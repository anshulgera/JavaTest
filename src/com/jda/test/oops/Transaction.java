package com.jda.test.oops;

import java.util.ArrayList;

import com.jda.test.logic.Utility;

public class Transaction {
	private static Utility utility;
	static{
		utility = new Utility();
	}

	public void buy(CustomerAccount customerAccount, ArrayList<CompanyShares> companyInfo) {
		
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
			System.out.println("No such company.");
			return;
		}
		
		//Get required quantity
		System.out.println("Enter quantity : ");
		int reqQuantity = utility.inputPositiveInteger();
		
		//Check if required quantity exists.
		if(reqQuantity>companyInfo.get(companyIndex).getQuantity()){
			System.out.println("Required Quantity exceeds Available Quantity.");
			return;
		}
		
		
		ArrayList<StockTuple> currentHoldings = customerAccount.getHoldings();
		int stockPosition;
		boolean companyExistsInHoldings = false;
		
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
		int currentCompanyQuantity = companyInfo.get(companyIndex).getQuantity();
		currentCompanyQuantity -= reqQuantity;
		
		//Update quantity avaliable
		companyInfo.get(companyIndex).setQuantity(currentCompanyQuantity);
		System.out.println("Bought : " + code + ", Quantity : " + reqQuantity);
		return;
		
	}

	public void sell(CustomerAccount customerAccount, ArrayList<CompanyShares> companyInfo) {
		
		ArrayList<StockTuple> currentHoldings = customerAccount.getHoldings();
		System.out.println("Your current holdings : ");
		for(int i=0;i<currentHoldings.size();i++){
			System.out.println(currentHoldings.get(i).getCode() + " : " + currentHoldings.get(i).getQuantity());
		}
		
		System.out.println("Enter code of stock to sell.");
		String sellCode = utility.inputString();
		
		int sellCodeIndex;
		for(sellCodeIndex=0;sellCodeIndex<currentHoldings.size();sellCodeIndex++){
			if(currentHoldings.get(sellCodeIndex).getCode().equals(sellCode)){
				break;
			}
		}
		
		if(sellCodeIndex==currentHoldings.size()){
			System.out.println("Stock doesn't exist in holdings, hance can't sell.");
			return;
		}
		
		System.out.println("Enter Sell Quantity : ");
		int sellQuantity = utility.inputPositiveInteger();
		if(currentHoldings.get(sellCodeIndex).getQuantity()<sellQuantity){
			System.out.println("Sell quantity greater than available Quantity. Transaction Failed.");
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
		return;
	}

}
