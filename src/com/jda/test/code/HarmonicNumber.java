package com.jda.test.code;
import com.jda.test.logic.*;
/**
 * @author anshul gera
 *
 */
public class HarmonicNumber {

	/**
	 * @param Sum of harmonic series upto 1/N.
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		int number = utility.inputPositiveInteger();
		float result = utility.nthHarmonicNumber(number);
		System.out.println(result);

	}

}
