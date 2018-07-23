package com.jda.test.dataStructure;
import java.util.ArrayList;
import com.jda.test.logic.Queue;

public class PrimeNumberQueue {

	public static void main(String[] args) {
		int range = 1000;
		PrimeNumberAnagram primeNumberAnagram = new PrimeNumberAnagram();
		ArrayList<Integer> primeAnagrams = new ArrayList<Integer>();
		primeAnagrams = primeNumberAnagram.getPrimeAnagramNumbers(range);
		
		//Push prime anagrams in a stack
		Queue<Integer> primeAnagramQueue = new Queue<Integer>();
		int sumOfAnagrams = 0;
		for(int i=0;i<primeAnagrams.size();i++) {
			primeAnagramQueue.enQueue(primeAnagrams.get(i));
			sumOfAnagrams += primeAnagrams.get(i);
		}
		//print the anagrams in reverse order
		primeAnagramQueue.printQueue();
		System.out.println(sumOfAnagrams);

	}

}
