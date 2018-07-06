package com.jda.test.code;
import com.jda.test.logic.*;

/**
 * @author anshul gera
 * Random Numbers
 *
 */
public class CouponNumbers {
	
	/**Generate a random number between 0 and N.
	 * @param n
	 * @return Integer random number
	 */
	public static int getRandomNumber(int n){
		return (int)(Math.random()*n);
	}
	
	/**Count of random numbers required
	 * to get distinct N numbers at least once.
	 * @param n
	 * @return count of random numbers required.
	 */
	public static int getRandomNoCount(int n){
		int distinct = 0;
		int count = 0;
		boolean[] number = new boolean[n];
		while(distinct<n){
			int value = getRandomNumber(n);
			if(!number[value]){
				number[value] = true;
				//System.out.println(value);
				distinct++;
			}
			count++;
			System.out.println(value);
	}
		return count;
	}
	
	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.inputPositiveInteger();
		int count  = getRandomNoCount(n);
		System.out.println("Random numbers needed : " + count );
	}

}
