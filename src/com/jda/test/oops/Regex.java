package com.jda.test.oops;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.jda.test.logic.Utility;

public class Regex {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		String numberRegex = "[0-9]+";
		String nameRegex = "^[\\p{L} .'-]+$";
		Date date = new Date();
		String dateFormat = new SimpleDateFormat("dd-MM-yyyy").format(date);
		
		String message = "Hello <<name>>, We have your full \n" + 
				"name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. \n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz. xx/xx/xxxx";
		
		String name = utility.inputString().toLowerCase();
		while(true) {
			if(name.matches(nameRegex))
				break;
			else {
					System.out.println("Invalid name format");
					name = utility.inputString();
				}
		}
		String[] fullName = name.split(" ");
		String firstName = fullName[0].substring(0, 1).toUpperCase() + fullName[0].substring(1);
		message = message.replaceAll("<<name>>", firstName);
		
		name = "";
		for(int i=0;i<fullName.length;i++) {
			if(i==fullName.length-1)
				name += fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1);
			else
				name += fullName[i].substring(0, 1).toUpperCase() + fullName[i].substring(1) + " ";
		}
		
		message = message.replaceAll("<<full name>>", name);
		
		String number = utility.inputString();
		while(true) {
			if(number.length()==10 && number.matches(numberRegex)) {
				message = message.replaceAll("xxxxxxxxxx", number);
				break;
			}
			else {
				System.out.println("Invalid number");
				number = utility.inputString();
			}
		
		}
		message = message.replaceFirst("xx/xx/xxxx", dateFormat);
		System.out.println(message);
	}
}