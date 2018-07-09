package com.jda.test.code;

import com.jda.test.logic.Utility;

public class WindChill {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int temp = utility.inputTemperatureinF();
		int wind = utility.inputWindSpeedinMPS();
		utility.calcWindChill(temp, wind);

	}

}
