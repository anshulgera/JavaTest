package com.jda.test.dataStructure;
import java.util.ArrayList;
import com.jda.test.logic.Stack;

public class PrimeNumberStack {

	public static void main(String[] args) {
		int range = 1000;
		PrimeNumberAnagram primeNumberAnagram = new PrimeNumberAnagram();
		ArrayList<Integer> primeAnagrams = new ArrayList<Integer>();
		primeAnagrams = primeNumberAnagram.getPrimeAnagramNumbers(range);
		
		//Push prime anagrams in a stack
		Stack<Integer> primeAnagramStack = new Stack<Integer>();
		int sumOfAnagrams = 0;
		for(int i=0;i<primeAnagrams.size();i++) {
			primeAnagramStack.push(primeAnagrams.get(i));
			sumOfAnagrams += primeAnagrams.get(i);
		}
		//print the anagrams in reverse order
		primeAnagramStack.printStack();
		System.out.println(sumOfAnagrams);
	}

}
