package com.jda.test.oops;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import com.jda.test.dataStructure.Calender;

public class CustomerAccount {
	
	private HashMap<String,Tuple<Integer, String>> map;
	public void updateHoldings(String companyName, Integer quantity){
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateString = df.format(date);
		Tuple<Integer,String> tuple = new Tuple<Integer, String>(quantity, dateString);
		
	}

}
