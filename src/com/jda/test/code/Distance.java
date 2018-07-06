package com.jda.test.code;

import com.jda.test.logic.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int x = utility.inputInteger();
		int  y = utility.inputInteger();
		double distance = utility.calcDistance(x, y);
		System.out.println(distance);
	}
}
