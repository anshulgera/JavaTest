package com.jda.test.algorithms;

import java.util.ArrayList;

import com.jda.test.logic.Utility;

public class PrimeExtend {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int range = 1000;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime = utility.getPrimeNumbers(range);
		ArrayList<Integer> palindrome = new ArrayList<Integer>();
		palindrome = utility.checkPalindrome(prime);
		utility.printArrayList(palindrome);
		ArrayList<Integer> anagrams = new ArrayList<Integer>();
		anagrams = utility.checkAnagram(prime);
		utility.printArrayList(anagrams);
		
	}

}
