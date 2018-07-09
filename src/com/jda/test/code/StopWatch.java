package com.jda.test.code;
import com.jda.test.logic.Utility;

public class StopWatch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Press enter to start : ");
		utility.pressAnyKeyToStartStop();
		long timeStart  = System.currentTimeMillis();
		System.out.println("Press enter to stop : ");
		utility.pressAnyKeyToStartStop();
		long timeEnd = System.currentTimeMillis();
		System.out.println((float)(timeEnd - timeStart)/1000 + " seconds");

		
	}

}
