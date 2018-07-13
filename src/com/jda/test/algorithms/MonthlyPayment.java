package com.jda.test.algorithms;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		if(args.length>0 && args.length<4) {
			
			float monPay = calculateMonthlyPayment(args[0],args[1],args[2]);
			System.out.println("Monthly Payment : " + monPay);
		}else {
			System.out.println("Invalid command line arguments.");
		}

	}

	private static float calculateMonthlyPayment(String principal, String years, String rate) {
		try {
		float n = 12 * Float.parseFloat(years);
		float r = Float.parseFloat(rate)/(1200);
		float payment = (Float.parseFloat(principal) * r)/(float)(1 - Math.pow((1+r),-n));
		return payment;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid command line arguments.");
			return 0;
		}
		
	}
	

}
