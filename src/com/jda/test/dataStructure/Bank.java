package com.jda.test.dataStructure;

import com.jda.test.logic.Queue;
import com.jda.test.logic.Utility;

public class Bank {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Transact transact = new Transact();
		Queue<Integer> queue = new Queue<Integer>();
/*		
		System.out.println("1.Add person to queue "
				+ "2.Perform transaction "
				+ "3.Exit");
*/
		int choice = 0;
	
		while(true) {
			System.out.println("1.Add person to queue "
					+ "2.Perform transaction "
					+ "3. Get status of queue "
					+ "4. Exit");
			choice = utility.inputPositiveInteger();
			if(choice>0 && choice<5) {
				switch(choice) {
				case 1:
					transact.addPerson(queue);
					continue;
				case 2:
					transact.performTransaction(queue);
					continue;
				case 3:
					transact.getStatus(queue);
					continue;
				case 4:
					return;
				}
			}
			else {
				System.out.println("Invalid input. Enter again");
				choice = utility.inputPositiveInteger();
			}
		}
		
		
	}

}
