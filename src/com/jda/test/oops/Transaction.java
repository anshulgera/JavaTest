package com.jda.test.oops;

import java.util.ArrayList;

import com.jda.test.logic.Utility;

public class Transaction {

	public void buy(CustomerAccount customerAccount, ArrayList<CompanyShares> companyInfo) {
		
		Utility utility = new Utility();
		
		System.out.println("Enter Code of company to buy");
		String code = utility.inputString().toLowerCase();
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
		int accountHoldingIndex;
		boolean companyExistsInHoldings = false;
		
		//Check if company exists in customer's current holdings.
		for(accountHoldingIndex=0;accountHoldingIndex<currentHoldings.size();accountHoldingIndex++){
			if(currentHoldings.get(accountHoldingIndex).getCode().equals(code)){
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
			int currQuantity = currentHoldings.get(accountHoldingIndex).getQuantity();
			currQuantity += reqQuantity;
			currentHoldings.get(accountHoldingIndex).setQuantity(currQuantity);
			
		}
		int currentCompanyQuantity = companyInfo.get(companyIndex).getQuantity();
		currentCompanyQuantity -= reqQuantity;
		
		//Update quantity avaliable
		companyInfo.get(companyIndex).setQuantity(currentCompanyQuantity);
		return;
		
	}

}
