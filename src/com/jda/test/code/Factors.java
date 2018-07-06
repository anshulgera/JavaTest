package com.jda.test.code;
import com.jda.test.logic.*;
/**
 * @author anshul gera
 *
 */
public class Factors {

	/**Prime factorization
	 * @param args
	 */
	public static void main(String[] args) {
		Utility ut = new Utility();
		int n = ut.inputPositiveInteger();
		ut.printPrimeFactors(n);

	}

}
