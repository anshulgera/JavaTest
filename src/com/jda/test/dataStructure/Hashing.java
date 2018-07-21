package com.jda.test.dataStructure;
import com.jda.test.logic.Utility;

/**
 * @author Anshul
 *Read numbers from a file and store them in a custom hashmap 
 *implementing chaining
 */
public class Hashing {
	
	public static void main(String[] args) {
		
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\textInteger.txt";
		Utility utility = new Utility();
		String[] numbers = utility.readFileForIntegers(fileLocation);
		int hashKey = 11;
		for(int i=0;i<numbers.length;i++) {
			
		}
	
	}

}
