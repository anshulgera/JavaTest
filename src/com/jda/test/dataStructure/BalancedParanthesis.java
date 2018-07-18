package com.jda.test.dataStructure;
import com.jda.test.logic.Stack;
import com.jda.test.logic.Utility;

public class BalancedParanthesis {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		Stack<Character> stack = new Stack<Character>();
		System.out.println("Enter expression");
		String expression = utility.inputString();
		for(int i=0;i<expression.length();i++) {
			stack.push(expression.charAt(i));
		}
		stack.evaluateExpression(expression);
	}

}
