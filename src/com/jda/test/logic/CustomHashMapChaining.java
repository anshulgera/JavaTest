package com.jda.test.logic;
import com.jda.test.logic.Node;

public class CustomHashMapChaining{
	CustomHashMapChaining head = null;
	class HashMapElement<E,T>{
		E key;
		Node<T> next;
		Node<T> chain;
		HashMapElement(E key, T data){
			this.key = key;
			this.next = null;
			this.chain = null;
		}
	}
	
	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\textInteger.txt";
		Utility utility = new Utility();
		String[] numbers = utility.readFileForIntegers(fileLocation);
		System.out.println("Enter hashMap key : ");
		int hashMapKey = utility.inputPositiveInteger();
		for(int i=1;i<hashMapKey+1;i++) {
			HashMapElement<Integer, Node<Integer>> hashMap = new HashMapElement<Integer, Node<Integer>>; 
		}
	}
	
	
}
