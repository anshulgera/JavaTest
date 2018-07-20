package com.jda.test.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.jda.test.logic.Utility;

/**
 * @author 1022772
 * Prints prime number in range 0 to 1000
 * in row and column fashion of row range of 0 to 100, 101 to 200..
 *
 */
public class PrimeNumbersRange {

	public static void main(String[] args) {
		int range = 1000;
		Utility utility = new Utility();
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers = utility.getPrimeNumbers(range);
		int numberOfCols = 0;
		int numberOfRows = 10;
		int i = 0;
		while(primeNumbers.get(i++)<100) {
			numberOfCols++;
		}
		
		String[][] array = new String[numberOfRows][numberOfCols];
		
		//Initialize the array with -1
		for(String[] row : array) {
			Arrays.fill(row, " ");
		}
		
		//To iterate while entering prime numbers in array.
		int row = 0;
		int col = 0;
		
		//Enter the prime numbers in 2d array.
		//-1 in blank spaces
		for(int x=0;x<primeNumbers.size();x++) {
			
			if(row != primeNumbers.get(x)/100) {
				row = primeNumbers.get(x)/100;
				col = 0;
			}
			array[row][col] = Integer.toString(primeNumbers.get(x));
			while(array[row][col].length()!=3) {
				array[row][col] = " " + array[row][col];
			}
			col++;
		}
		utility.print2DArray(array,numberOfRows, numberOfCols);
	}

}
