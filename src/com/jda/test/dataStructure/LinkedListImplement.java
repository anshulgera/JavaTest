package com.jda.test.dataStructure;

import com.jda.test.logic.Utility;

public class LinkedListImplement {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\textFile.txt";
		String[]  words = utility.getWords(fileLocation);
		LinkedList<String> list = new LinkedList<String>();
		list.createList(words);
		System.out.println("Enter word to search.");
		String search = utility.inputString();
		
		if(list.searchWord(search)) {
			list.deleteWord(search);
			list.printList(list.head);
		}
		else {
			System.out.println("Element not found, adding it to the list");
			list.addEnd(search);
			list.printList(list.head);
		}
	}

	

}
