package com.jda.test.algorithms;

import java.util.Scanner;

import com.jda.test.logic.Utility;

public class MergeSort {

	
	public static void main(String[] args) {
		Scanner scan;
		Utility utility = new Utility();
		System.out.println("Enter size of array.");
		int size = utility.inputPositiveInteger();
		String[] array = new String[size];
		System.out.println("Enter the strings.");
		for(int i=0;i<size;i++) {
			array[i] = utility.inputString();
		}
		

	}

}
