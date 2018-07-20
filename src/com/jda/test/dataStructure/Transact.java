package com.jda.test.dataStructure;

import com.jda.test.logic.Queue;
import com.jda.test.logic.Utility;

public class Transact {

	static Integer CASH_BALANCE = 1000;
	Utility utility = new Utility();
	
	public void addPerson(Queue<Integer> queue) {
		System.out.println("1.Deposit 2.Withdraw");
		int choice = utility.inputPositiveInteger();
		while(true) {
			if(choice>0 && choice<3) {
				switch(choice) {
					case 1:
						deposit(queue);
						return;
					case 2:
						withdraw(queue);
						return;
				}
			}
			else {
				System.out.println("Invalid input. Enter 1 or 2");
				choice = utility.inputPositiveInteger();
			}
		}
	}

	private void withdraw(Queue<Integer> queue) {
		
		System.out.println("Enter amount to withdraw");
		int amount = utility.inputPositiveInteger();
		queue.enQueue(-amount);
		System.out.println("Request Enqueued");
		return;
	}

	private void deposit(Queue<Integer> queue) {
		System.out.println("Enter amount to deposit");
		int amount = utility.inputPositiveInteger();
		queue.enQueue(amount);
		System.out.println("Request Enqueued.");
		return;
	}

	public void performTransaction(Queue<Integer> queue) {
		System.out.println("Performing transaction...");
		if(queue.isEmpty()) {
			System.out.println("No request to process");
			return;
		}
		int amount = queue.deQueue();
		int check = CASH_BALANCE + amount;
		if(check<0) {
			System.out.println("Insufficient balance."
					+ " Request rejected.");
			return;
		}
		else {
			if(amount<0) {
				System.out.print("Withdrawl request : " + (-amount) + "\n");
			}
			else {
				System.out.println("Deposit request : " + amount + "\n");
			}
			System.out.println("Balance before : " + CASH_BALANCE);
			CASH_BALANCE += amount;
			System.out.println("Request processed. Available  cash balance : " + CASH_BALANCE);
		}
		return;
	}

	public void getStatus(Queue<Integer> queue) {
		int size = queue.getSize();
		System.out.print("Number of people in queue " + size + "\n");
		if(size<1)
			return;
		System.out.println("Queue status : ");
		queue.printQueue();
	}
}
