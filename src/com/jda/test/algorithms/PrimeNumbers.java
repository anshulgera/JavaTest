package com.jda.test.algorithms;

import java.util.ArrayList;

import com.jda.test.logic.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		int rangeEnd = 1000;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		Utility utility = new Utility();
		prime = utility.getPrimeNumbers(rangeEnd);
		utility.printArrayList(prime);

	}

}
