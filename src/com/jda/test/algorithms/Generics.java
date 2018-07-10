package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class Generics<T> {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println(""
				+ "1.BinarySearch for Integers "
				+ "2.BinarySearch for Strings"
				+ "3.Selection Sort for Integers"
				+ "4.Selection Sort for Strings"
				+ "5.Bubble Sort for Integers"
				+ "6.Bubble Sort for Strings");
		int choice = utility.inputGenericChoice();
		System.out.println("Enter size of array");
		int size = utility.inputPositiveInteger();
		
		switch(choice) {
			case 1:
				Integer[] arrayIntegerSearch = new Integer[size];
				
				for(int i=0;i<size;i++) {
					arrayIntegerSearch[i] = utility.inputInteger();
				}
				
				System.out.println("Enter element to search");
				Integer intToFind = utility.inputInteger();
				
				if(utility.binarySearch(arrayIntegerSearch, intToFind)) {
					System.out.println("Element found.");
				}
				else {
					System.out.println("Element not found.");
				}
				break;
			case 2:
				String[] arrayStringSearch = new String[size];
				
				for(int i=0;i<size;i++) {
					arrayStringSearch[i] = utility.inputString();
				}
				
				System.out.println("Enter string to search.");
				String strToFind = utility.inputString();
				
				if(utility.binarySearch(arrayStringSearch, strToFind)) {
					System.out.println("String Found.");
				}
				else {
					System.out.println("String not found.");
				}
		}
	}

}
