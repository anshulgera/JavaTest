package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number.");
		int number = utility.inputPositiveInteger();
		System.out.println("Answer true or false for each of the following questions.");
		utility.guessNumber(number);
	}

}
