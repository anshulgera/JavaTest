package com.jda.test.dataStructure;

import com.jda.test.logic.Utility;
import com.jda.test.logic.Weekdays;

public class WeekObject {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = 1;
		int day;
		if(month>0 && month<13) {
			day = utility.getDay(date, month, year);
		}
		else {
			return;
		}
		
		int numberOfDays = utility.days[month-1];
		
		Weekdays head;
		
		
	}

}
