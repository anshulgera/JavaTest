package com.jda.test.logic;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		String input =  scanner.nextLine();
		while(true){
			if(input.length()>0){
				return input;
			}
			else{
				System.out.println("String is empty. Enter again.");
				input = scanner.nextLine();
			}
		}
	}
	
	public String inputStringMin3(){
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

	public void permute(String input, int left, int right) {
		Utility utility  = new Utility();
		if(left == right){
			System.out.println(input);
		}else{
			for(int i = left;i<=right;i++){
				input = utility.swap(input, left, i);
				utility.permute(input, left+1,right);
				input = utility.swap(input, left ,i);
				
			}
		}
		
	}

	private String swap(String input, int i, int j) {
		
		char[] array = input.toCharArray();
		char temp =  array[i];
		array[i] = array[j];
		array[j] = temp;
		return String.valueOf(array);
		
	}
	public void pressAnyKeyToStartStop(){
		try{
			System.in.read();
		}
		catch(Exception e){}
	return;
	}
	public void printBoard(char[][] board, int row, int column){
		for(int i = 0;i<row;i++){
			for(int j = 0;j<column;j++){
			System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void playTicTacToe(char[][] board, int row, int column){
		return;
	}

	public void calcSqRoot(int a, int b, int c) {
		float delta = (float) (Math.pow(b, 2) - 4*a*c);
		if(delta<0){
			System.out.println("Imaginary roots as b^2-4ac is egative.");
		}
		else if(delta == 0){
			float result = (float) (-b)/(2*a);
			System.out.println("As delta is zero, the roots are " + result +" and " + (-result));
		}
		else{
			float resultA = (float) (-b +Math.sqrt(delta))/(2*a);
			float resultB = (float)(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Roots are " + resultA + " and " + resultB);
		}
		
		
		
	}

	public int inputTemperatureinF() {
		System.out.println("Enter the temperature : ");
		int input = scanner.nextInt();
		while(true){
			if(Math.abs(input)<=50){
				return input;
			}
			else{
				System.out.println("Temperature should be between -50 and 50 degree Fahrenheit");
				input = scanner.nextInt();
			}
		}
	}

	public int inputWindSpeedinMPS() {
		System.out.println("Enter the wind speed : ");
		int input = scanner.nextInt();
		while(true){
			if(input>3 && input<120){
				return input;
			}
			else{
				System.out.println("Wind speed should be between 3 and 120mps.");
				input = scanner.nextInt();
			}
		}
	}

	public void calcWindChill(int temp, int wind) {
		double windChill = 35.74 + 0.6215 *(double) temp + (0.4275*temp - 35.75) * Math.pow(wind,  0.16);
		System.out.println("WindChill is " + windChill);
	}

	public boolean checkForAnagram(String a, String b) {
		
		//remove spaces
		a = a.replaceAll("\\s+","");
		b = b.replaceAll("\\s+","");
		a = sortString(a.toCharArray(), a.length());
		b = sortString(b.toCharArray(), b.length());
		return a.equals(b);
		
	}

	private String sortString(char[] string, int length) {
		
		for(int i=0;i<length-1;i++){
			
			for(int j=0;j<length-i-1;j++){
				if(string[j]>string[j+1]){
					char temp = string[j];
					string[j] = string[j+1];
					string[j+1] = temp;
				}
				
			}
		}
		return new String(string);
	}

	public ArrayList<Integer> getPrimeNumbers(int rangeEnd) {
		boolean[] prime = new boolean[rangeEnd+1];
		Arrays.fill(prime, true);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int p=2;p*p<=rangeEnd;p++){
			if(prime[p]==true){
				for(int i=p*2;i<=rangeEnd;i+=p){
					prime[i] = false;
				}
			}
		}
		for(int p =2;p<=rangeEnd;p++){
			if(prime[p]){
				result.add(p);
			}
		}
		return result;
	}

	public void printArrayList(ArrayList<Integer> prime) {
		for(int i=0;i<prime.size();i++){
			System.out.print(prime.get(i) + " ");
		}
	}

	public ArrayList<Integer> checkPalindrome(ArrayList<Integer> prime) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<prime.size();i++){
			if(checkPalindrome(prime.get(i))){
				result.add(prime.get(i));
			}
		}
		return result;
	}

	private boolean checkPalindrome(int integer) {
		int reverse = 0;
		int temp = integer;
		while(temp>0){
			reverse = reverse*10 + temp%10;
			temp /= 10;
		}
		if(integer==reverse){
			return true;
		}
		return false;
	}

	public ArrayList<Integer> checkAnagramList(ArrayList<Integer> prime) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<prime.size();i++){
			for(int j=i+1;j<prime.size();j++){
				String compareA = String.valueOf(prime.get(i));
				String compareB = String.valueOf(prime.get(j));
				if(compareA.length()!=compareB.length()){
					continue;
				}
				if(checkForAnagram(compareA, compareB)){
					result.add(prime.get(i));
					result.add(prime.get(j));
				}
			}
		}
		return result;
	}

	public void printArrayListPairs(ArrayList<Integer> anagrams) {
		int count = 0;
		for(int i=0;i<anagrams.size();i++){
			if(count==2){
				count = 0;
				System.out.print(" * ");
			}
			System.out.print(anagrams.get(i) + " ");
			count++;
		}
		return;
		
	}

	public int inputGenericChoice() {
		int choice = scanner.nextInt();
		while(true){
			if(choice>0 && choice<7) {
			return choice;
			}
			else {
				System.out.println("Enter valid input.");
				choice = scanner.nextInt();
			}
		}
	}

	public <T extends Comparable<T>> boolean binarySearch(T[] array, T toFind) {
		
		int left = 0;
		int right = array.length;
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(array[mid].compareTo(toFind) == 0) {
				return true;
			}
			if(array[mid].compareTo(toFind) > 0) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return false;
	}
}