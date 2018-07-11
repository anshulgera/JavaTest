package com.jda.test.algorithms;

import java.util.Arrays;

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
				Arrays.sort(arrayIntegerSearch);
				System.out.println("Enter element to search");
				Integer intToFind = utility.inputInteger();
				utility.binarySearch(arrayIntegerSearch, intToFind);
				break;
				
			case 2:
				String[] arrayStringSearch = new String[size];
				System.out.println("Enter strings.");
				for(int i=0;i<size;i++) {
					arrayStringSearch[i] = utility.inputString();
				}
				Arrays.sort(arrayStringSearch);
				System.out.println("Enter string to search.");
				String strToFind = utility.inputString();
				utility.binarySearch(arrayStringSearch, strToFind);
				break;
				
			case 3:
				Integer[] arrayIntegerInsertion = new Integer[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayIntegerInsertion[i] = utility.inputInteger();
				}
				utility.insertionSort(arrayIntegerInsertion);
				break;
				
			case 4:
				String[] arrayStringInsertion = new String[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayStringInsertion[i] = utility.inputString();
				}
				utility.insertionSort(arrayStringInsertion);
				break;
				
			case 5:
				Integer[] arrayIntegerBubble = new Integer[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayIntegerBubble[i] = utility.inputInteger();
				}
				utility.bubbleSort(arrayIntegerBubble);
				break;
			
			case 6:
				String[] arrayStringBubble = new String[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayStringBubble[i] = utility.inputString();
				}
				utility.bubbleSort(arrayStringBubble);
				break;
				
		}
	}

}
