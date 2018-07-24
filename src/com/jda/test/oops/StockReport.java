package com.jda.test.oops;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.codehaus.jackson.*;

import com.jda.test.logic.Utility;

public class StockReport {

	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		System.out.println("Number of stocks : ");
		int numberOfStocks = utility.inputInteger();
		utility.emtpyLine();
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		
		for(int i=0;i<numberOfStocks;i++) {
			JSONObject stockInfo = new JSONObject();
			
			System.out.println("Stock Code : ");
			String stockCode = utility.inputString();
			stockInfo.put("stcokCode", stockCode);
			
			System.out.println("Stock Price : ");
			double stockPrice = utility.inputDouble();
			stockInfo.put("stockPrice", stockPrice);
			
			System.out.println("Number of shares : ");
			int stockQuantity = utility.inputPositiveInteger();
			stockInfo.put("stockQuantity", stockQuantity);
			
			utility.emtpyLine();
			
			jsonArray.add(stockInfo);
			
		}
		jsonObject.put("stocks", jsonArray);
		
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
		
		String a = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
		
		try{
			PrintWriter pw = new PrintWriter("C:\\Users\\1022772\\git\\JavaTest\\jsondata.json");
			pw.write(jsonObject.toJSONString());
			pw.flush();
			pw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
