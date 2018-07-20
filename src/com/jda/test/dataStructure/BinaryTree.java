package com.jda.test.dataStructure;

import com.jda.test.logic.Utility;

public class BinaryTree {

	static long modulo = 100000007;
	public static long catalanNumber(int n) {
		long result = 0;
		if(n<=1)
			return 1;
		for(int i=0;i<n;i++) {
			result += catalanNumber(i) * catalanNumber(n-1-i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = utility.inputPositiveInteger();
		long number = catalanNumber(n);
		System.out.println(number);
		

	}

}
