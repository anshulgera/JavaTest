package com.jda.test.logic;

import java.io.Serializable;

public class Inventory implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private String name;
	private int price;
	private int quantity;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString(){
		return "{" +  "\"name\":\"" + name + "\"," + "\"quantity\":" + quantity + ",\"price\":" + price + "}" ; 
	}
	

}
