package com.jda.test.oops;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.jda.test.dataStructure.Calender;

public class CustomerAccount {
	
	private String name;
	private ArrayList<StockTuple> holdings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<StockTuple> getHoldings() {
		return holdings;
	}
	public void setHoldings(ArrayList<StockTuple> holdings) {
		this.holdings = holdings;
	}

}
