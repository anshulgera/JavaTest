package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter the strings to check for anagram.");
		String a = utility.inputString();
		String b = utility.inputString();
		if(utility.checkForAnagram(a, b)){
			System.out.println("Strings are anagrams.");
		}
		else{
			System.out.println("Strings are not anagrams.");
		}
		

	}

}
