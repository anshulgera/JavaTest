package com.jda.test.dataStructure;

import com.jda.test.logic.Stack;
import com.jda.test.logic.Utility;

/**
 * @author 1022772
 *Implementing Queue using 2 stacks.
 *Making the enQueue Operation costly.
 */
public class QueueUsingStack {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		int choice;
		while(true) {
			System.out.println("1.enQueue 2.deQueue 3.Quit");
			choice = utility.inputPositiveInteger();
			if(choice >0 && choice <4) {
				switch(choice){
					case 1:
						enQueue(stack1,stack2);
						continue;
					case 2:
						deQueue(stack1,stack2);
						continue;
					case 3:
						return;
				}
			}
		}

	}

	
	private static void deQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
		if(stack1.isEmpty()) {
			System.out.println("Empty queue");
			return;
		}
		System.out.println("deQueued : " + stack1.pop());
		return;
	}

	/**Push the 'value' at the bottom of stack1 with the help of stack2.
	 * The oldest element in the queue will be at the top of stack1.
	 * @param stack1
	 * @param stack2
	 */
	private static void enQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
	
		Utility utility = new Utility();
		System.out.println("Enter value : ");
		int value = utility.inputInteger();
		if(stack1.isEmpty()) {
			stack1.push(value);
			return;
		}
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(value);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return;
	}
}
