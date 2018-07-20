package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int date = 0, month = 0, year = 0;
		if(args.length>0) {
			year = Integer.parseInt(args[0]);
			month = Integer.parseInt(args[1]);
			date = Integer.parseInt(args[2]);
			
		}
		System.out.println("Enter year, month and date");
		String[] days = new String[] {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int day = utility.getDay(date, month, year);
		System.out.println(date+"/"+month+"/"+year+" -> " + days[day]);
		//year = utility.inputYear();
		//month = utility.inputMonth();
		//date = utility.inputDate(month, year);
		
	}

}
