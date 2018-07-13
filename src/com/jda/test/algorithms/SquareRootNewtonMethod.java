package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class SquareRootNewtonMethod {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double c = utility.inputDoublePositive();
		calculateSqrt(c);

	}

	private static void calculateSqrt(double c) {
		double t = c;
		double epislon = 1e-15;
		while(Math.abs(t - c/t)>epislon*t) {
			double tt = (c/t + t)/2;
			t = tt;
		}
		
		System.out.println("SQRT of " + c + " is -> " + t);
	}

}
