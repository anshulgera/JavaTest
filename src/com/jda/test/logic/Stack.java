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
	
	public T pop() {
		Node temp = top;
		
		if(temp==null) {
			System.out.println("Empty stack");
			return null;
		}
		top = temp.next;
		return temp.data;
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
	

	private boolean hasPrecedence(char c, Character peek) {
		if(peek=='(' || peek==')')
			return false;
		if((c=='*' || c=='/') && (peek=='+' || peek=='-'))
			return false;
		return true;
	}

	private Integer applyOperand(Character op, Integer a, Integer b) {
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return b-a;
		case '*':
			return a*b;
		case '/':
			return (a==0)?null:b/a;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (top==null)?true:false;
	}

	
	public Integer evaluateExpression(String expression) {
		//holding the whole expression
		char[] tokens = expression.toCharArray();
		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> operands = new Stack<Character>();
		
		for(int i=0;i<tokens.length;i++) {
			
			/*
			 *Handle empty space, skip iteration
			 */
			if(tokens[i]==' ') {
				continue;
			}
			
			/*
			 * Handle integers
			 */
			if(tokens[i]>='0' && tokens[i]<='9') {
				StringBuffer strbuff = new StringBuffer();
				/*
				 * To handle multiple digit integer, take it as a stringbuffer object
				 * parse it to integer and push it to stack
				*/
				while(i<tokens.length && tokens[i]>='0' && tokens[i]<='9') {
					strbuff.append(tokens[i]);
					i++;
				}
				/*
				 * Parse stringbuffer object to string 
				 * and then parse that string as an integer to integer stack
				 */
				
				values.push(Integer.parseInt(strbuff.toString()));
			}
			
			else if(tokens[i] == '(') {
				operands.push(tokens[i]);
			}
			
			/*
			 * Solve expression present in brace
			 */
			else if(tokens[i] == ')') {
				/*
				 * Till we encounter closing brace
				 */
				while(operands.peek().compareTo('(')!=0) {
					values.push(applyOperand(operands.pop(),values.pop(),values.pop()));
				}
				operands.pop();
			}
			/*
			 * Token is an operator
			 */
			else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i]  == '*'
					|| tokens[i] == '/') {
				while(!operands.isEmpty() && hasPrecedence(tokens[i], operands.peek())) {
					values.push(applyOperand(operands.pop(),values.pop(),values.pop()));
				}
				/* 
				 * If stack is empty or if current token doesn't have precedence
				 * over operand top, then push operand
				 */
				operands.push(tokens[i]);
			}
		}
		/*
		 * Apply remaining operations on the values in stack
		 */
		while(!operands.isEmpty()) {
			values.push(applyOperand(operands.pop(),values.pop(),values.pop()));
		}
		
		return values.pop();
	}
}
