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
				
				long timeStart1  = System.currentTimeMillis();
				utility.binarySearch(arrayIntegerSearch, intToFind);
				long timeEnd1  = System.currentTimeMillis();
				System.out.println("Time taken : " + (float)(timeEnd1-timeStart1)/1000);
				break;
				
			case 2:
				String[] arrayStringSearch = new String[size];
				System.out.println("Enter strings.");
				utility.emtpyLine();
				for(int i=0;i<size;i++) {
					arrayStringSearch[i] = utility.inputString();
				}
				Arrays.sort(arrayStringSearch);
				System.out.println("Enter string to search.");
				String strToFind = utility.inputString();
				
				long timeStart2  = System.currentTimeMillis();
				utility.binarySearch(arrayStringSearch, strToFind);
				long timeEnd2  = System.currentTimeMillis();
				System.out.println("Time taken : " + (float)(timeEnd2-timeStart2)/1000);
				break;
				
			case 3:
				Integer[] arrayIntegerInsertion = new Integer[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayIntegerInsertion[i] = utility.inputInteger();
				}
				
				long timeStart3  = System.currentTimeMillis();
				utility.insertionSort(arrayIntegerInsertion);
				long timeEnd3  = System.currentTimeMillis();
				System.out.println("Time taken : " + (float)(timeEnd3-timeStart3)/1000);
				break;
				
			case 4:
				String[] arrayStringInsertion = new String[size];
				System.out.println("Enter strings.");
				utility.emtpyLine();
				for(int i=0;i<size;i++) {
					arrayStringInsertion[i] = utility.inputString();
				}
				
				long timeStart4  = System.currentTimeMillis();
				utility.insertionSort(arrayStringInsertion);
				long timeEnd4  = System.currentTimeMillis();
				System.out.println("Time taken : " + (timeEnd4-timeStart4));
				break;
				
			case 5:
				Integer[] arrayIntegerBubble = new Integer[size];
				System.out.println("Enter elements.");
				for(int i=0;i<size;i++) {
					arrayIntegerBubble[i] = utility.inputInteger();
				}
				
				long timeStart5  = System.currentTimeMillis();
				utility.bubbleSort(arrayIntegerBubble);
				long timeEnd5  = System.currentTimeMillis();
				System.out.println("Time taken : " + (float)(timeEnd5-timeStart5)/1000);
				break;
			
			case 6:
				String[] arrayStringBubble = new String[size];
				System.out.println("Enter strings.");
				utility.emtpyLine();
				for(int i=0;i<size;i++) {
					arrayStringBubble[i] = utility.inputString();
				}
				
				long timeStart6  = System.currentTimeMillis();
				utility.bubbleSort(arrayStringBubble);
				long timeEnd6  = System.currentTimeMillis();
				System.out.println("Time taken : " + (float)(timeEnd6-timeStart6)/1000);
				break;
				
		}
	}

}
