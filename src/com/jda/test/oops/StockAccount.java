package com.jda.test.oops;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.jda.test.logic.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		ObjectMapper mapper = new ObjectMapper();
		
		//Read company info from Git URL
		String requestURLStock = "https://raw.githubusercontent.com/anshulgera/JavaTest/OOPs/jsonStockData.json";
		String stockJsonFromURL = utility.readStringFromURL(requestURLStock);
		
		//Hold all company information in an ArrayList
		ArrayList<CompanyShares> companyInfo = new ArrayList<CompanyShares>();
		companyInfo = mapper.readValue(stockJsonFromURL, new TypeReference<ArrayList<CompanyShares>>(){});	
		
		//Read customer data from Git URL
		String requestURLCustomer = "https://raw.githubusercontent.com/anshulgera/JavaTest/OOPs/jsonCustomersData.json";
		String customerJsonFromURL = utility.readStringFromURL(requestURLCustomer);
		
		//Hold Customers information in an ArrayList
		ArrayList<CustomerAccount> accountHolders = new ArrayList<CustomerAccount>();
		accountHolders = mapper.readValue(customerJsonFromURL, new TypeReference<ArrayList<CustomerAccount>>(){});
				
		
		System.out.println("Enter your name : ");
		String user = utility.inputString().toLowerCase();
		int customerIndex;
		boolean userExist = false;
		
		//Check if user exists.
		for(customerIndex=0;customerIndex<accountHolders.size();customerIndex++){
			if(user.equals(accountHolders.get(customerIndex).getName())){
				userExist = true;
				break;
			}
		}
		
		//if User doesn't exist. Add customer in accountHodlers ArrayList.
		if(!userExist){
			System.out.println("User doesn't exist.");
			System.out.println("Creating new account for the user.");
			CustomerAccount newCustomer  = new CustomerAccount();
			newCustomer.setName(user);
			ArrayList<StockTuple> emptyList = new ArrayList<StockTuple>();
			newCustomer.setHoldings(emptyList);
			accountHolders.add(newCustomer);
			System.out.println("Account created.");
		}
		
		
		
		Transaction transaction  = new Transaction();
		
		while(true){
			System.out.println("1.Buy  2.Sell  3.Save  4.PrintReport  5.PortFolio Value  6.Exit");
			int choice = utility.inputPositiveInteger();
			utility.emtpyLine();
			if(choice>0 && choice<7){
				switch(choice){
				case 1:
					transaction.buy(accountHolders.get(customerIndex), companyInfo);
					continue;
				case 2:
					transaction.sell(accountHolders.get(customerIndex), companyInfo );
					continue;
				case 3:
					transaction.save(accountHolders, companyInfo);
					continue;
				case 4:
					transaction.printReport(accountHolders.get(customerIndex).getHoldings());
					continue;
				case 5:
					transaction.printValuation(accountHolders.get(customerIndex).getHoldings());
					continue;
				case 6:
					break;
					
				}
			}
			else{
				System.out.println("Invalid Input. Enter Again");
				choice = utility.inputPositiveInteger();
			}
		}
		
		
		
		
		
		
			
		}
}

