package com.jda.test.code;
import java.util.Scanner;

import com.jda.test.logic.Utility;

public class StopWatch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press enter to start : ");
		utility.pressAnyKeyToStartStop();
		scanner.nextLine();
		long timeStart  = System.currentTimeMillis();
		System.out.println("Press enter to stop : ");
		utility.pressAnyKeyToStartStop();
		long timeEnd = System.currentTimeMillis();
		System.out.println((float)(timeEnd - timeStart)/1000 + " seconds");

		
	}

}
