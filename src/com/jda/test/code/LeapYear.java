package com.jda.test.code;
import com.jda.test.logic.*;

public class LeapYear {

	public static void main(String[] args) {
		Utility ut = new Utility();
		int y = ut.takeInputYear();
		boolean isLeapYear = ut.checkLeapYear(y);
		if(isLeapYear) {
			System.out.println(y + " is a leap year.");
		}
		else {
			System.out.println(y + " is not a leap year");
		}

	}

}
