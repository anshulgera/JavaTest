package com.jda.test.dataStructure;

public class LinkedList<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T t){
			data = t;
			next = null;
		}
	}
	
	public void createList(T[] array) {
		for(int i=0;i<array.length;i++) {
			addEnd(array[i]);	
		}
		System.out.println("List created.");
		printList(head);
	}

	private void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("END");
		
	}

	private void addEnd(T t) {
		if(head==null) {
			head = new Node(t);
			return;
		}
		
		Node newNode = new Node(t);
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
		return;
	}


}
