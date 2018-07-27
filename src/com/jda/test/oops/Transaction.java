package com.jda.test.oops;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.jda.test.logic.JsonUtil;
import com.jda.test.logic.Utility;

public class Transaction {
	private static Utility utility;
	static{
		utility = new Utility();
	}
	
	public String getTimeStamp(){
		String date = new SimpleDateFormat("HH.mm.ss.dd.MM.yyyy").format(new java.util.Date());
		return date;
	}

	public void buy(CustomerAccount customerAccount, ArrayList<CompanyShares> companyInfo, ArrayList<TransactionDetails> transactionArray) {
		
		TransactionDetails details = new TransactionDetails();
		System.out.println("Enter Code of company to buy");
		String code = utility.inputString();
		int companyIndex;
		boolean companyExists = false;
		
		//Check if company exists.
		for(companyIndex = 0;companyIndex<companyInfo.size();companyIndex++){
			if(code.equals(companyInfo.get(companyIndex).getCode())){
				companyExists = true;
				break;
			}
		}
		
		//If company doesn't exist
		if(!companyExists){
			System.out.println("No such company.\n Transaction Failed");
			return;
		}
		
		//Get required quantity
		System.out.println("Enter quantity : ");
		int reqQuantity = utility.inputPositiveInteger();
		utility.emtpyLine();
		
		//Check if required quantity exists.
		if(reqQuantity>companyInfo.get(companyIndex).getQuantity()){
			System.out.println("Required Quantity exceeds Available Quantity.\n Transaction Failed");
			return;
		}
		
		
		ArrayList<StockTuple> currentHoldings = customerAccount.getHoldings();
		int stockPosition;
		boolean companyExistsInHoldings = false;
		
		if(currentHoldings.isEmpty()){
						StockTuple tuple = new StockTuple();
						tuple.setCode(code);
						tuple.setQuantity(reqQuantity);
						currentHoldings.add(tuple);	
			}
		else{
						//Check if company exists in customer's current holdings.
						for(stockPosition=0;stockPosition<currentHoldings.size();stockPosition++){
							if(currentHoldings.get(stockPosition).getCode().equals(code)){
								companyExistsInHoldings = true;
								break;
							}
						}
						
						//Add stock in current holdings array if it doesn't exist already.
						if(!companyExistsInHoldings){
							StockTuple tuple = new StockTuple();
							tuple.setCode(code);
							tuple.setQuantity(reqQuantity);
							currentHoldings.add(tuple);
						}else{
							//If stock already exists in current holdings, update value.
							int currQuantity = currentHoldings.get(stockPosition).getQuantity();
							currQuantity += reqQuantity;
							currentHoldings.get(stockPosition).setQuantity(currQuantity);
							
						}
						
						}
		int currentCompanyQuantity = companyInfo.get(companyIndex).getQuantity();
		currentCompanyQuantity -= reqQuantity;
		
		//Update quantity avaliable
		companyInfo.get(companyIndex).setQuantity(currentCompanyQuantity);
		
		System.out.println("Bought : " + code + ", Quantity : " + reqQuantity);
		
		details.setUserName(customerAccount.getName());
		details.setTransactionType("Buy");
		details.setQuantity(reqQuantity);
		details.setStockCode(companyInfo.get(companyIndex).getCode());
		details.setTimeStamp(getTimeStamp());
		transactionArray.add(details);
		return;
	}

	public void sell(CustomerAccount customerAccount, ArrayList<CompanyShares> companyInfo, ArrayList<TransactionDetails> transactionArray) {
		
		ArrayList<StockTuple> currentHoldings = customerAccount.getHoldings();
		printReport(currentHoldings);
		
		//If portfolio is empty, nothing to sell.
		if(currentHoldings.isEmpty()) {
			System.out.println("Nothing in protfolio to sell.");
			return;
		}
		
		System.out.println("Enter code of stock to sell.");
		String sellCode = utility.inputString();
		
		int sellCodeIndex;
		for(sellCodeIndex=0;sellCodeIndex<currentHoldings.size();sellCodeIndex++){
			if(currentHoldings.get(sellCodeIndex).getCode().equals(sellCode)){
				break;
			}
		}
		
		//If stock doesn't exist in user's portfolio.
		if(sellCodeIndex==currentHoldings.size()){
			System.out.println("Stock doesn't exist in holdings, hence can't sell.\n Transaction Failed.");
			return;
		}
		
		System.out.println("Enter Sell Quantity : ");
		int sellQuantity = utility.inputPositiveInteger();
		utility.emtpyLine();
		
		//If sell quantity is greater than available, transaction fails.
		if(currentHoldings.get(sellCodeIndex).getQuantity()<sellQuantity){
			System.out.println("Sell quantity greater than available Quantity.\n Transaction Failed.");
			return;
		}
		
		//Sell stock and update currentHoldings and available stocks
		currentHoldings.get(sellCodeIndex).setQuantity(currentHoldings.get(sellCodeIndex).getQuantity()-sellQuantity);
		int companyIndex;
		for(companyIndex=0;companyIndex<companyInfo.size();companyIndex++){
			if(companyInfo.get(companyIndex).getCode().equals(sellCode)){
				break;
			}
		}
		companyInfo.get(companyIndex).setQuantity(companyInfo.get(companyIndex).getQuantity() + sellQuantity);
		System.out.println("Sold : " + sellCode + ", Quantity : " + sellQuantity);
		
		if(currentHoldings.get(sellCodeIndex).getQuantity().equals(0)){
			currentHoldings.remove(sellCodeIndex);
		}
		TransactionDetails details = new TransactionDetails();
		details.setUserName(customerAccount.getName());
		details.setQuantity(sellQuantity);
		details.setTransactionType("Sell");
		details.setStockCode(companyInfo.get(companyIndex).getCode());
		details.setStockPrice(companyInfo.get(companyIndex).getPrice());
		details.setTimeStamp(getTimeStamp());
		transactionArray.add(details);
		return;
	}

	public void printReport(ArrayList<StockTuple> currentHoldings) {
		System.out.println("Your current holdings : ");
		if(currentHoldings.size()==0){
			System.out.println("Portfolio empty.");
			return;
		}
		for(int i=0;i<currentHoldings.size();i++){
			System.out.println(currentHoldings.get(i).getCode() + " : " + currentHoldings.get(i).getQuantity());
		}
		
	}

	public void printValuation(ArrayList<StockTuple> holdings) throws IOException {

		System.out.println("Your PortFolio's valuation : ");
		if(holdings.size()==0){
			System.out.println("Portfolio empty.");
			return;
		}
		double valuation =0;
		for(int i=0;i<holdings.size();i++){
			String code = holdings.get(i).getCode();
			double  price = findPrice(code);
			int quantity = holdings.get(i).getQuantity();
			System.out.println(code + " : " + quantity +" * " + price);
			valuation += price*quantity;
		}
		System.out.println("Total Valuation : " + valuation);
		return;
	}

	private double findPrice(String code) throws IOException {
		
		ObjectMapper mapper  = new ObjectMapper();
		
		//String requestURLStock = "https://raw.githubusercontent.com/anshulgera/JavaTest/OOPs/jsonStockData.json";
		//String stockJsonFromURL = utility.readStringFromURL(requestURLStock);
		String path = "C:\\Users\\1022772\\git\\JavaTest\\jsontextstock.txt";
		File file = new File(path);
		
		//Hold all company information in an ArrayList
		ArrayList<CompanyShares> companyInfo = new ArrayList<CompanyShares>();
		companyInfo = mapper.readValue(file, new TypeReference<ArrayList<CompanyShares>>(){});	
		
		int companyIndex;
		for(companyIndex = 0;companyIndex<companyInfo.size();companyIndex++){
			if(companyInfo.get(companyIndex).getCode().equals(code)){
				break;
			}
		}
		return companyInfo.get(companyIndex).getPrice();
		
		
	}

	public void save(ArrayList<CustomerAccount> accountHolders, ArrayList<CompanyShares> companyInfo, ArrayList<TransactionDetails> transactionArray) {
		JsonUtil util = new JsonUtil();
		String jsonCompany = util.convertJavaToJson(companyInfo);
		System.out.println(jsonCompany);
		String jsonCustomers = util.convertJavaToJson(accountHolders);
		System.out.println(jsonCustomers);
		String jsonTransaction = util.convertJavaToJson(transactionArray);
		System.out.println(jsonTransaction);
		return;		
	}

	
	

}
