package com.jda.test.code;
import com.jda.test.logic.*;

public class CoinToss {
	
	public double getPercentage(int n, int tailCount){
		double result = tailCount/n;
		result  *= 100.00;
		return result;
		
	}
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = utility.takeInputInteger();
		int tailCount = utility.getTailCount(n);
		float tailPercentage = ((float)tailCount/n)*100;
		float headPercentage = (float)100 - tailPercentage;
		System.out.println("Heads percentage : " + headPercentage + " Vs " + "Tails percentage : " + tailPercentage);
		
	}

}
