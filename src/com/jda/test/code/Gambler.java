package com.jda.test.code;
import com.jda.test.logic.*;
/**
 * @author ANSHUL GERA
 *
 */
public class Gambler {
	
	public static void main(String[] args){
		
		Utility utility = new Utility();
		int numberOfGames = utility.inputPositiveInteger();
		int stake = utility.inputPositiveInteger();
		int goal = utility.inputPositiveInteger();
		int winCount =utility.getWinCount(stake,goal,numberOfGames);
		float winPercentage = utility.calcPercentage(winCount,numberOfGames);
		System.out.println("Number of wins : " + winCount);
		System.out.println("Winning percentage : " + winPercentage );
		
	}

}
