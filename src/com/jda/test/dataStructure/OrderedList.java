package com.jda.test.dataStructure;
import com.jda.test.logic.LinkedList;
import com.jda.test.logic.Utility;

public class OrderedList {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		String fileLocation = "C:\\\\Users\\\\1022772\\\\git\\\\JavaTest\\\\textInteger.txt";
		
		String[] array = utility.readsFileForSortedIntegers(fileLocation);
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer[] input = new Integer[array.length];
		for(int i=0;i<array.length;i++) {
			input[i] = Integer.parseInt(array[i]);
		}
		
		list.createList(input);
		list.head = list.mergeSortList(list.head);
		list.printList(list.head);
		System.out.println("Enter number to search");
		int search = utility.inputInteger();
		if(list.searchWord(search)) {
			System.out.println(search + " Deleted");
			list.deleteWord(search);
		}
		else {
			list.insertSorted(search);
			System.out.println(search + " Inserted.");
		}
		list.printList(list.head);
	}

}
