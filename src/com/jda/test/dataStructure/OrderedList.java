package com.jda.test.dataStructure;
import com.jda.test.logic.Utility;

public class OrderedList {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		String fileLocation = "C:\\\\Users\\\\1022772\\\\git\\\\JavaTest\\\\textInteger.txt";
		
		String[] array = utility.readFileForIntegers(fileLocation);
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer[] input = new Integer[array.length];
		for(int i=0;i<array.length;i++) {
			input[i] = Integer.parseInt(array[i]);
		}
		
		list.createList(input);
		list.sortList();
	}

}
