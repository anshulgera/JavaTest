package com.jda.test.logic;

public class Weekdays {
	String date;
	String currentDay;
	public Weekdays next;
	Weekdays(int date, int day){
		this.date = Integer.toString(date);
		String[] days = new String[] {"S","M","T","W","T","F","S"};
		this.currentDay = days[day];
	}
}
