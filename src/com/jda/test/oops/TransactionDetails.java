package com.jda.test.oops;

public class TransactionDetails {
	
	private static int transactionNumber =1000;
	private String userName;
	private String transactionType;
	private String stockCode;
	private double stockPrice;
	private int quantity;
	private String timeStamp;
	
	TransactionDetails(){
		transactionNumber++;
	}
	
	public static int getTransactionNumber() {
		return transactionNumber;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public static void setTransactionNumber(int transactionNumber) {
		TransactionDetails.transactionNumber = transactionNumber;
	}

}
