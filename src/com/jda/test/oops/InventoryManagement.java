package com.jda.test.oops;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.test.logic.ManageInventory;
import com.jda.test.logic.Utility;

public class InventoryManagement {

	public static void main(String[] args) throws IOException, ParseException {
		Utility utility = new Utility();
		ManageInventory manageInventory = new ManageInventory();
		String requestURL = "https://raw.githubusercontent.com/anshulgera/JavaTest/OOPs/jsonGroceryInventory.json";
		String  jsonFromURL = utility.readStringFromURL(requestURL);
		
		//String to JSON Object
		Object obj = new JSONParser().parse(jsonFromURL);
		JSONObject jsonObject = (JSONObject)obj;
		System.out.println("1. Insert Product 2.Delete Product");
		int choice = utility.inputPositiveInteger();
		utility.emtpyLine();
		while(true){
			if(choice>0 && choice<3){
				break;
			}else{
				System.out.println("Enter 1 or 2.");
				choice = utility.inputPositiveInteger();
			}
		}
		System.out.println("Enter product Name");
		String inputProduct = utility.inputString().toLowerCase();
		switch(choice){
		case 1:
			jsonObject = manageInventory.insertProduct(jsonObject,inputProduct);
			break;
		case 2:
			jsonObject = manageInventory.deleteProduct(jsonObject, inputProduct);
			break;
		}
		//System.out.println(jsonObject);
		
		
		
		
		
		
		
	}

	

}
