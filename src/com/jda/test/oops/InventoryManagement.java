package com.jda.test.oops;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.test.logic.Utility;

public class InventoryManagement {

	public static void main(String[] args) throws IOException, ParseException {
		Utility utility = new Utility();
		
		String requestURL = "https://raw.githubusercontent.com/anshulgera/JavaTest/OOPs/jsonInventory.json";
		String  jsonFromURL = utility.readStringFromURL(requestURL);
		
		Object obj = new JSONParser().parse(jsonFromURL);
		JSONObject jsonObject = (JSONObject)obj;
		
		
		
		
		
	}

}
