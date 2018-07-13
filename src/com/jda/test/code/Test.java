package com.jda.test.code;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		int a = 10;
		int b = 20;
		String s = "";
		s += Integer.toString(a);
		s = Integer.toString(b) + s;
		System.out.println(s);
	}

}
