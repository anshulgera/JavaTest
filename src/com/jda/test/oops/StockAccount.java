package com.jda.test.oops;

import com.jda.test.logic.Utility;

public class StockAccount {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int numberOfCompanies = utility.inputPositiveInteger();
		CompanyShares[] obj = new CompanyShares[numberOfCompanies];
		
		//Enter companies information
		for(int i=0;i<numberOfCompanies;i++){
			System.out.println("Enter company symbol : ");
			String name = utility.inputString();
			obj[i].setCompanyName(name);
			System.out.println("Enter Quantity : ");
			int quantity = utility.inputPositiveInteger();
			obj[i].setQuantityAvailable(quantity);
		}
		
			//Create customer account
		CustomerAccount customer = new CustomerAccount();
		
		System.out.println("Enter type of tramnsaction : ");
		int choice = utility.inputPositiveInteger();
		while(true){
			
		}
		

	}

}
