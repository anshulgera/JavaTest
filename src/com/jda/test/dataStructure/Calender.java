package com.jda.test.dataStructure;
import com.jda.test.logic.Utility;

/**
 * @author 1022772
 *
 */
public class Calender {

	/**Prints the calender of a particuler month and year.
	 * Month and year are passed as CMD arguements. 
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int date = 1;
		
		int day = utility.getDay(date, month, year);
		
		//[Jan,Feb,...]
		String[] months = utility.months;
		//[S,M,T,.]
		char[] dayNotation = utility.dayNotation;
		//[31,28,31,..]
		int[] days = utility.days;
		
		if(utility.checkLeapYear(year)) {
			days[1] = 29;
		}
		
		System.out.println(months[month-1] + " " + year);
		
		String[][] calender = new String[7][7];
		int count = 1;
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				//Print dayNotations
				if(i==0) {
					
					calender[i][j] = Character.toString(dayNotation[j]) + " ";
				}
				//Empty spaces
				else if((i==1 && j!=day && count == 1) ||(count>days[month-1])) {
					calender[i][j] = "";
				}
				//Print days
				else {
					calender[i][j] = Integer.toString(count);
					count++;
					if(count/10==0) {
						calender[i][j] += " ";
					}
				}
			}
		}
		
		//Print calender
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(calender[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
