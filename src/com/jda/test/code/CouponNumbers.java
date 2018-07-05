package com.jda.test.code;
import com.jda.test.logic.*;

public class CouponNumbers {
	
	public static int getRandomNumber(int n){
		return (int)(Math.random()*n);
	}
	
	public static int getRandomNoCount(int n){
		int distinct = 0;
		int count = 0;
		boolean[] number = new boolean[n];
		while(distinct<n){
			int value = getRandomNumber(n);
			if(!number[value]){
				number[value] = true;
				distinct++;
			}
			count++;
	}
		return count;
	}
	
	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.takeInputInteger();
		int count  = getRandomNoCount(n);
		System.out.println("Random numbers needed : " + count );
	}

}
