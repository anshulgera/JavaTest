package com.jda.test.oops;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.codehaus.jackson.*;

import com.jda.test.logic.JsonUtil;
import com.jda.test.logic.Utility;

/**Generate JSON file by getting input from user and generate the portfolio.
 * @author Anshul Gera
 *
 */
public class StockReport {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		JsonUtil jsonUtil = new JsonUtil();
		System.out.println("Number of stocks : ");
		int numberOfStocks = utility.inputInteger();
		utility.emtpyLine();
		
		JSONObject jsonObject = new JSONObject();
		JSONArray stockArrayJSON =  new JSONArray();
		
		String stockPortfolio = new String();
		
		//Enter stocks information
		for(int i=0;i<numberOfStocks;i++) {
			StockInfo stockObject = new StockInfo();
			
			System.out.println("Stock Code : ");
			String stockCode = utility.inputString();
			stockObject.setStockName(stockCode);
			
			System.out.println("Stock Price : ");
			double stockPrice = utility.inputDouble();
			stockObject.setStockPrice(stockPrice);
			
			System.out.println("Number of shares : ");
			int stockQuantity = utility.inputPositiveInteger();
			stockObject.setStockQuantity(stockQuantity);
			
			utility.emtpyLine();
			
			//Add stock information to the JSONArray
			stockArrayJSON.add(stockObject);
			stockPortfolio += stockObject.getStockPortFolio();
			
		}
		
		//Add stockArray to the JSONObject
		jsonObject.put("stocks", stockArrayJSON);
		
		String output = jsonUtil.convertJavaToJson(jsonObject);
		
		//create JSON file 
		try{
			PrintWriter pw = new PrintWriter("/home/bridgelabz/git/JavaTest/jsonInventory.json");
			pw.write(output);
			pw.flush();
			pw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(stockPortfolio);
		
	}

}
