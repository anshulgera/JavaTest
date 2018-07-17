package com.jda.test.logic;

public class LinkedList<T extends Comparable<? super T>> {
	
	public Node head;
	
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
	
	public boolean searchWord(T search) {
		Node temp = head;
		while(temp!=null) {
			if(search.compareTo(temp.data)==0) {
				return true;
			}
			temp = temp.next;
		}
		return false;
		
	}

	public void deleteWord(T search) {
		
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

	public Node mergeSortList(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node mid = splitList(head);
		Node nextOfMid = mid.next;
		mid.next = null;
		
		Node left = mergeSortList(head);
		Node right = mergeSortList(nextOfMid);
		Node sortedList = sortedMerge(left,right);
		return sortedList;
	}

	private Node splitList(Node head) {
		if(head==null) {
			return head;
		}
		Node fast = head.next;
		Node slow = head;
		while(fast!=null) {
			fast = fast.next;
			if(fast!=null) {
				fast = fast.next;
				slow = slow.next;
			}
		}
		return slow;
	}

	private Node sortedMerge(Node left, Node right) {
		
		Node result = null;
		if(left==null)
			return right;
		if(right==null)
			return left;
		if(left.data.compareTo(right.data)<=0) {
			result = left;
			result.next = sortedMerge(left.next, right);
		}
		else {
			result = right;
			result.next = sortedMerge(left, right.next);
		}
		return result;
	}

	public void insertSorted(T search) {
		
		Node temp = head;
		Node newNode = new Node(search);
		
		//empty list 
		if(temp==null) {
			head = newNode;
			return;
		}
		
		//insert at first
		if(temp.data.compareTo(search)>=0) {
			newNode.next = temp;
			head = newNode;
			return;
		}
		//traverse till next or temp is greater than newNode
		while(temp.next!=null && temp.next.data.compareTo(search)<0) {
			temp = temp.next;
		}
		//insert element
		if(temp.next!=null) {
			newNode.next = temp.next;
			temp.next = newNode;
			return;
		}
		//to insert at end of list	
		temp.next = newNode;
		return;
		
	}

		

}
