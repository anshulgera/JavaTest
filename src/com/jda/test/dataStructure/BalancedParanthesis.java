package com.jda.test.dataStructure;
import com.jda.test.logic.Stack;
import com.jda.test.logic.Utility;

public class BalancedParanthesis {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		Stack<Character> stack = new Stack<Character>();
		System.out.println("Enter expression");
		String expression = utility.inputString();
		if(stack.checkParanthesis(expression)) {
			System.out.println("Paranthesis balanced.");
		}
		else {
			System.out.println("Paranthesis unbalanced");
		}
		
	}

}
