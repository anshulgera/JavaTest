package com.jda.test.code;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		while(true){
			try{
				double value = Double.parseDouble(input);
				System.out.println(value);
				break;
			}catch(NumberFormatException e){
				System.out.println("Enter valid input");
				input = scan.next();
			}
			
		}

	}

}
