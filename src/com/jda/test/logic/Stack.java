package com.jda.test.logic;

public class Stack<T> {
	
	public Node top = null;
	class Node{
		T data;
		Node next;
		Node(T t)
		{
			data = t;
			next = null;
		}

	}
	public void push(T value) {
		Node newNode = new Node(value);
		if(top==null) {
			top = newNode;
		}
		else {
		newNode.next = top;
		top = newNode;
		}
		return;
	}
	
	public void pop() {
		Node temp = top;
		
		if(temp==null) {
			System.out.println("Empty stack");
			return;
		}
		top = temp.next;
		System.out.println(temp.data + " removed.");
		temp = null;
		return;
	}
	

	public T peek() {
		if(top==null) {
			System.out.println("Stack empty.");
			return null;
		}
		return top.data;
	}
	
	/**
	 * Prints the stack.
	 * Alerts if the stack is empty.
	 */
	public void printStack() {
		Node temp = top;
		if(temp==null) {
			System.out.println("Empty stack");
			return;
		}
		System.out.print("Top->");
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("End\n");
		return;
	}

	/**
	 * Evaluates an expression using stack.
	 * First tokenize the expression.
	 *  Use one stack for holding the integer values.
	 *  Another stack for the operands.
	 * @param expression
	 */
	public void evaluateExpression(String expression) {
		//holding the whole expression
		char[] tokens = expression.toCharArray();
		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> operands = new Stack<Character>();
		
		for(int i=0;i<tokens.length;i++) {
			
		}
	}
}
