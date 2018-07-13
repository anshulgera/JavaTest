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

	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("END\n");
		
	}

	public void addEnd(T t) {
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
	
	@SuppressWarnings({ "unchecked", "hiding" })
	public <T extends Comparable<T>> boolean searchWord(T search) {
		Node temp = head;
		while(temp!=null) {
			if(search.compareTo((T)temp.data)==0) {
				return true;
			}
			temp = temp.next;
		}
		return false;
		
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T extends Comparable<T>> void deleteWord(T search) {
		
		Node temp = head;
		Node prev = null;
		T tempData = (T) temp.data;
		//if object is found at head
		if(temp!=null && (tempData).compareTo(search)==0) {
			head = temp.next;
			return;
		}
		//search till object is found
		while(temp!=null && (tempData).compareTo(search)!=0) {
			prev = temp;
			temp = temp.next;
			tempData = (T)temp.data;
		}
		//reached end and object not found
		if(temp==null) {
			return;
		}
		prev.next = temp.next;
		return;
		
	}
	
	


}
