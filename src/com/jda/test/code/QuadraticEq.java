package com.jda.test.code;

import com.jda.test.logic.Utility;

public class QuadraticEq {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter input A, B C for the quadratic equation.");
		int a = utility.inputInteger();
		int b = utility.inputInteger();
		int c = utility.inputInteger();
		utility.calcSqRoot(a,b,c);

	}

}
