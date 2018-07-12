package com.jda.test.algorithms;

import com.jda.test.logic.Utility;

public class MinCoinChange {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int diffCoins;
		System.out.println("Enter number of different denominations : ");
		diffCoins = utility.inputPositiveInteger();
		
		int[] coins = new int[diffCoins];
		System.out.println("Enter the demoninations available.");
		for(int i=0;i<diffCoins;i++) {
			coins[i] = utility.inputPositiveInteger();
		}
		
		System.out.println("Enter the amount to be exchanged : ");
		int amount = utility.inputPositiveInteger();
		utility.minCoinChange(coins, diffCoins, amount);
	
	}

}
