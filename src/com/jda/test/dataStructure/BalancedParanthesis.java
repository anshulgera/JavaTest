package com.jda.test.dataStructure;
import com.jda.test.logic.Stack;
import com.jda.test.logic.Utility;

public class BalancedParanthesis {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter expression");
		String expression = utility.inputString();
		if(checkParanthesis(expression)) {
			System.out.println("Paranthesis balanced.");
		}
		else {
			System.out.println("Paranthesis unbalanced");
		}
		
	}
	public static boolean checkParanthesis(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
			if(expression.charAt(i)=='(') {
				stack.push('(');
			}else if(expression.charAt(i)==')') {
				if(!stack.isEmpty() && stack.peek()=='(' ) {
					stack.pop();
					continue;
				}
				else
					return false;
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}

}
