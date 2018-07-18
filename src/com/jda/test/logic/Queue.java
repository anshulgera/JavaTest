package com.jda.test.logic;

public class Queue<T> {
	public Node front = null;
	public Node tail = null;
	
	class Node{
		T data;
		Node next;
		Node(T t){
			data = t;
			next=null;
		}
	}
	
	public void enQueue(T value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			front = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		return;
	}
	
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			return null;
		}
		
		Node temp = front;
		
		if(temp.next==null) {
			front = null;
			tail = null;
			return temp.data;
		}
		
		front = front.next;
		return temp.data;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Empty queue");
			return;
		}
		Node temp = front;
		System.out.print("Front->");
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("End\n");
		return;
	}
	
	public boolean isEmpty() {
		return (front==null)?true:false;
	}
	public int getSize() {
		if(isEmpty()) {
			return 0;
		}
		Node temp = front;
		int size = 0;
		while(temp!=null) {
			size++;
		}
		return size;
	}

	public void printQueue(Queue<Integer> queue) {
		if(isEmpty()) {
			System.out.println("Empty queue");
			return;
		}
		Queue<Integer>.Node temp = queue.front;
		System.out.print("Front->");
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("End\n");
		return;
	}

}
