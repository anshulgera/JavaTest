package com.jda.test.code;
import com.jda.test.logic.*;

public class Replace {

	public static void main(String[] args) {
		
		String template = "Hello <<UserName>>, How are you?";
		Utility utility = new Utility();
		System.out.println("Enter your name: ");
		String name = utility.takeInputString();
		template = utility.replaceName(template, name);
		System.out.println(template);

	}

}
