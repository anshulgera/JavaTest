package com.jda.test.code;

import com.jda.test.logic.Utility;

public class Permutations {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		String input = utility.inputString();
		int length = input.length();
		utility.permute(input, 0, length-1);

	}

}
