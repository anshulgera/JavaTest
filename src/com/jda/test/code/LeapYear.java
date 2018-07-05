package com.jda.test.code;
import com.jda.test.logic.*;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int year = utility.takeInputYear();
		boolean isLeapYear = utility.checkLeapYear(year);
		if(isLeapYear) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
