package com.jda.test.code;
import com.jda.test.logic.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.inputHarmonicNumber();
		float result = ut.nthHarmonicNumber(n);
		System.out.println(result);

	}

}
