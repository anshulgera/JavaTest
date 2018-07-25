package com.jda.test.oops;

import java.io.Serializable;


public class StockInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stockName;
	private double stockPrice;
	private int stockQuantity;
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getStockPortFolio() {
		String info = "";
		info = getStockName() + "  -> Valuation : ";
		info += getStockPrice()*getStockQuantity()  + "\n";
		return info;
	}
}
