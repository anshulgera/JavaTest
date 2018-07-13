package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class TempConv {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1->C to F  \n2->F to C");
		int choice = utility.inputPositiveInteger();
		while(true) {
			if(choice>0 && choice<3) {
				break;
			}
			else {
				System.out.println("Enter valid input.");
				choice = utility.inputPositiveInteger();
			}
		}
		switch(choice){
		case 1:
			utility.celsiusToF();
			break;
		case 2:
			utility.fahrenheitToC();
		}
	}

}
