package com.jda.test.dataStructure;

import java.util.ArrayList;

import com.jda.test.logic.Utility;

/**
 * @author Anshul
 *Get all the prime numbers that are anagrams in a given range.
 */
public class PrimeNumberAnagram {
	
	public ArrayList<Integer> getPrimeAnagramNumbers(int range){
		Utility utility = new Utility();
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers = utility.getPrimeNumbers(range);
		ArrayList<Integer> primeAnagram = new ArrayList<Integer>();
		primeAnagram = utility.checkAnagramList(primeNumbers);
		return primeAnagram;
		
	}

	public static void main(String[] args) {
		int range = 1000;
		PrimeNumberAnagram primeNumberAnagram = new PrimeNumberAnagram();
		ArrayList<Integer> primeAnagram = new ArrayList<Integer>();
		primeAnagram = primeNumberAnagram.getPrimeAnagramNumbers(range);
		
		for(int i=0;i<primeAnagram.size();i++) {
			if(i%2==0)
				System.out.print("\n");
			System.out.print(primeAnagram.get(i) + " ");
		}
	}

}
