package com.jda.test.algorithms;
import com.jda.test.logic.Utility;

public class BinaryNibble {

	public static void main(String[] args) {
		ToBinary binaryHelper = new ToBinary();
		Utility utility = new Utility();
		int number = utility.inputPositiveInteger();
		int binary = binaryHelper.calculateBinaryRep(number);
		System.out.println(binary);
		int swap = utility.swapNibbles(number);
		System.out.println(swap);

	}

}
