package com.jda.test.code;

import com.jda.test.logic.Utility;

public class PermuteRecursive {
	public static void permuteAux(StringBuilder string, StringBuilder chosen){
		if(string.toString().equals("")){
			System.out.println(chosen);
		}
		else{
			for(int i=0;i<string.length();i++){
				//choose
				char temp = string.charAt(i);
				chosen.append(temp);
				string.deleteCharAt(i);
				
				//permute
				permuteAux(string, chosen);
				
				//unchoose
				string.insert(i, temp);
				chosen.deleteCharAt(chosen.length()-1);
				
			}
		}
	}
	public static void permuteRecursive(StringBuilder s){
		StringBuilder chosen = new StringBuilder("");
		permuteAux(s, chosen);
	}

	public static void main(String[] args) {
	Utility utility = new Utility();
	System.out.println("Enter string to permute : ");
	String input = utility.inputString();
	StringBuilder string = new StringBuilder(input);
	permuteRecursive(string);

	}

}
