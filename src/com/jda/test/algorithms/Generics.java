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
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayIntegerSearch[i] = utility.inputInteger();
				}
				
				System.out.println("Enter element to search");
				Integer intToFind = utility.inputInteger();
				utility.binarySearch(arrayIntegerSearch, intToFind);
				break;
				
			case 2:
				String[] arrayStringSearch = new String[size];
				
				for(int i=0;i<size;i++) {
					arrayStringSearch[i] = utility.inputString();
				}
				
				System.out.println("Enter string to search.");
				String strToFind = utility.inputString();
				utility.binarySearch(arrayStringSearch, strToFind);
				break;
				
			case 3:
				
		}
	}

}
