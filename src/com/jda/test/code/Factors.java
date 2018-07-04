package com.jda.test.code;
import com.jda.test.logic.*;
public class Factors {

	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.takeInputInteger();
		ut.printPrimeFactors(n);

	}

}
