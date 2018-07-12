package com.jda.test.algorithms;
import com.jda.test.logic.Utility;

public class ReadFile {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\text.txt";
		System.out.println("Enter word to search.");
		String search = utility.inputString();
		utility.searchFile(fileLocation, search);
	}

}
