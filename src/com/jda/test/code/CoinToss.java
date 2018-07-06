package com.jda.test.code;
import com.jda.test.logic.*;

/**
 * @author Anshul Gera
 *
 */
public class CoinToss {
	
	
	/**Math.random
	 * Value<0.5 Tails win otherwise Heads win
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		int number = utility.inputPositiveInteger();
		int tailCount = utility.getTailCount(number);
		float tailPercentage = ((float)tailCount/number)*100;
		float headPercentage = (float)100 - tailPercentage;
		System.out.println("Heads percentage : " + headPercentage + " Vs " + "Tails percentage : " + tailPercentage);
		
	}

}
