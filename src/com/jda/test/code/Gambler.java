package com.jda.test.code;
import com.jda.test.logic.*;
public class Gambler {
	public static void main(String[] args){
		Utility ut = new Utility();
		int n = ut.takeInputInteger();
		int stake = ut.takeInputInteger();
		int goal = ut.takeInputInteger();
		int winCount =ut.getWinCount(stake,goal,n);
		System.out.println("Number of wins : " + winCount);
		
		
	}

}
