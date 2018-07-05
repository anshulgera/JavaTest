package com.jda.test.logic;

import java.util.Scanner;



public class Utility {
	
	Scanner scanner;
	
	public Utility(){
	
		scanner = new Scanner(System.in);

	}
	public int takeInteger(){
		int n = scanner.nextInt();
		return n;
	}
	
	public int inputTernary(){
		int input;
		while(true){
			input =  scanner.nextInt();
			if(input>0 || input<4){
				return input;
			}
			else{
				System.out.println("Enter valid input.");
			}
		}
	}
	
	public float calcPercentage(int x,int y){
		
		return ((float)x/y)*(float)100;
		
	}
	
	public String takeInputString(){
		String name = new String();
		while(true){
		 name = scanner.nextLine();
			if(name.length()<3){
				System.out.println("Minimum 3 char.");
			}
			else{
				break;
			}
		}
	return name;
	}
	
	public int takeInputInteger(){
		int n;
		while(true){
			n = scanner.nextInt();
			if(n<=0){
				System.out.println("Enter positive number");
			}
			else{
				break;
			}
		}
		return n;
	}
	
	public String replaceName(String template, String name){
	
		template  = template.replace("<<UserName>>", name);
		return template;
	
	}
	
	public int getTailCount(int n){
		int tailCount = 0;
		for(int i=0;i<n;i++){
			if(Math.random()<0.5){
				tailCount++;
			}
		}
		return tailCount;
	}

	public int takeInputYear(){
		int n;
		while(true){
			n = scanner.nextInt();
			if(n>999 && n<=9999) {
				return n;
			}
			else {
				System.out.println("Enter 4 digit number.");
			}
		}
		
	}
	
	public boolean checkLeapYear(int n) {
		if(n%400==0) {
			return true;
		}
		if(n%4==0 && n%100!=0){
			return true;
		}
		return false;
	}
	
	public int validateN() {
		int n;
		while(true) {
			n = scanner.nextInt();
			if(n>=0 && n<32) {
				return n;
			}
			else {
				System.out.println("Enter value between 0 and 31");
			}
		}
	}
	
	public void printTablePower(int n) {
		int x = 1;
		for(int i=0;i<=n;i++) {
			System.out.println(i + " " + x);
			x = x * 2;
		}
		return;
	}
	
	public int inputHarmonicNumber() {
		int n;
		while(true) {
			n = scanner.nextInt();
			if(n<=0) {
				System.out.println("Enter valid number");
			}
			else {
				return n;
			}
		}
	}
	
	public float nthHarmonicNumber(int n) {
		float result = 0;
		for(int i=1;i<=n;i++) {
			result += (float)1/i;
		}
		return result;
	}
	
	public void printPrimeFactors(int n) {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				while(n%i==0) {
					System.out.println(i);
					n=n/i;
				}
			}
			if(n>2) {
				System.out.println(n);
			}
		}
		
	}
	public int getWinCount(int stake, int goal, int n){
		int winCount= 0 ;
		for(int i=0;i<n;i++){
			int currentValue = stake;
			
			while(true){
				if(currentValue == goal){
					winCount++;
					break;
				}
				if(currentValue== 0){
					break;
				}
				if(Math.random()<0.5){
					currentValue--;
				}
				else{
					currentValue++;
				}
			}
		}
		return winCount;
	}
	

}
