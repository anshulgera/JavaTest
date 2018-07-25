package com.jda.test.logic;
public class Queue<T> {
	Node<T> front = null;
	Node<T> tail = null;
	
	
	public void enQueue(T value) {
		Node<T> newNode = new Node<T>(value);
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
		
		Node<T> temp = front;
		
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
		Node<T> temp = front;
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
		Node<T> temp = front;
		int size = 0;
		while(temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public void getStatus() {
		int size = getSize();
		System.out.print("Number of people in queue " + size + "\n");
		if(size<1)
			return;
		System.out.println("Queue status : ");
		
	}

	public T deQueueRear() {
		if(front == null)
			return null;
		if(front.next == null) {
			Node<T> temp = front;
			front = null;
			return temp.data;
		}
		Node<T> newEnd = front;
		Node<T> end;
		while(newEnd.next.next!=null) {
			newEnd = newEnd.next;
		}
		end = newEnd.next;
		newEnd.next = null;
		return end.data;
	}
	

}
