package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class ToBinary {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int number =  utility.inputPositiveInteger();
		int binary = calculateBinaryRep(number);
		System.out.println(binary);
	}

	public static int calculateBinaryRep(int number) {
		/*int binary = 0;
		int remainder;
		int base = 1;
		while(number>0) {
			remainder = number%2;
			binary = binary + remainder*base;
			number /= 2;
			base *= 10;
		}
		System.out.println(binary);
		*/
		int temp = number;
		int power;
		int binary = 0;
		while(temp>0){
			power = (int)Math.floor((Math.log(temp)/Math.log(2)));
			binary = (int) (binary + Math.pow(10, power));
			//System.out.println(binary);
			temp = (int) (temp - Math.pow(2, power));
			//System.out.println(temp);
		}
		return binary;
	}

}
