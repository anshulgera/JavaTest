package com.jda.test.code;
import com.jda.test.logic.Utility;

public class Triplets {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int size = utility.inputPositiveInteger();
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = utility.inputInteger();
		}
		utility.getTriplets(array, size);

	}

}
