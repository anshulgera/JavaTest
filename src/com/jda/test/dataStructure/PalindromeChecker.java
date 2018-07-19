package com.jda.test.dataStructure;
import com.jda.test.logic.Queue;
import com.jda.test.logic.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter expression : ");
		String expression = utility.inputString();
		Queue<Character> queue = new Queue<Character>();
		for(int i=0;i<expression.length();i++) {
			queue.enQueue(expression.charAt(i));
		}
		if(isPalindrome(queue)) {
			System.out.println("Expression is a palindrome.");
		}
		else {
			System.out.println("Expression is not a palindrome");
		}
	}

	private static boolean isPalindrome(Queue<Character> queue) {
		for(int i=0;i<queue.getSize()/2;i++) {
			if(queue.deQueue()!=queue.deQueueRear())
				return false;
		}
		return true;
	}
	

}
