package com.jda.test.dataStructure;
import com.jda.test.logic.Node;
import com.jda.test.logic.Utility;
import java.util.HashMap;

public class Hashing {
	
	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\textInteger.txt";
		Utility utility = new Utility();
		HashMap<Integer, Node> map = new HashMap<>();
		String[] numbers = utility.readFileForIntegers(fileLocation);
		for(int i=0;i<numbers.length;i++) {
			int number = Integer.parseInt(numbers[i]);
			int remainder = number%11;
			Node newNode = new 
			map.put(remainder, newNode);
		}
	}

}
