package com.jda.test.logic;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Utility {
	
	Scanner scanner;
	
	public Utility(){
		scanner = new Scanner(System.in);
	}
	
	public int inputInteger(){
		int n = scanner.nextInt();
		return n;
	}
	
	public int inputTernary(){
		int input;
		while(true){
			input =  scanner.nextInt();
			if(input>0 && input<4){
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
	
	public String inputString(){
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
	
	public int inputPositiveInteger(){
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

	public int inputYear(){
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
	
	public int inputNaturalNumber() {
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
	
	public void handleIntegerArray2D(int row, int column){
		
		Utility utility = new Utility();
		PrintWriter out = new PrintWriter(System.out);
		int[][] data = new int[row][column];
		for(int i=0;i<row;i++){
			for(int j = 0;j<column;j++){
				data[i][j] = utility.inputInteger();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				out.print(data[i][j] + " ");
			}
			out.println();
		}
		out.flush();
		out.close();
		return;
	}
	public double inputDouble(){
		String input = scanner.next();
		while(true){
			try{
				double value = Double.parseDouble(input);
				return value;
			}
			catch(NumberFormatException e){
				System.out.println("Enter valid input");
				input = scanner.next();
			}
		}
	}
	public void handleDoubleArray2D(int row, int column){
		
		PrintWriter out = new PrintWriter(System.out); 
		double[][] data = new double[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				data[i][j] = inputDouble();
			}
		}
			for(int i = 0;i<row;i++){
				for(int j = 0;j<column;j++){
					out.print(data[i][j] + " ");
				}
				out.println();
			}
			out.flush();
			out.close();
		}
	public void handleBooleanArray2D(int row, int column) {
		
		PrintWriter out =new PrintWriter(System.out);
		boolean[][] data = new boolean[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				data[i][j] = inputBoolean();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				out.print(data[i][j] + " ");
			}
			out.println();
		}
		out.flush();
		out.close();
	}
	
	private boolean inputBoolean() {

		String input = scanner.next();
		while(true){
			try{
				boolean value = Boolean.parseBoolean(input);
				return value;
			}
			catch(Exception e){
				System.out.println("Enter valid input.");
				input = scanner.next();
			}
		}
	}

	public void getTriplets(int array[], int size) {
		int sum = 0;
		int distinctTriplets = 0;
		int counter = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0;i<size-2;i++){
			for(int j=0;j<size-1;j++){
				for(int k=0;k<size;k++){
					if(array[i] + array[j] + array[k] == sum){
						distinctTriplets++;
						result.add(array[i]);
						result.add(array[j]);
						result.add(array[k]);
					}
				}
			}
		}
		
		System.out.println("Distinct Triplets : " + distinctTriplets);
		
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i) + " ");
			counter++;
			if(counter==3){
				System.out.println();
				counter = 0;
				}
			}
	}

	public double calcDistance(int x, int y) {
		return  Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		
	}
	
}