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
		
		String[] months = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		char[] dayNotation = new char[] {'S','M','T','W','T','F','S'};
		int[] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		if(utility.checkLeapYear(year)) {
			days[1] = 29;
		}
		
		System.out.println(months[month-1] + " " + year);
		
		String[][] calender = new String[7][7];
		int count = 1;
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==0) {
					calender[i][j] = Character.toString(dayNotation[j]) + " ";
				}
				else if((i==1 && j!=day && count == 1) ||(count>days[month-1])) {
					calender[i][j] = "";
				}
				else {
					calender[i][j] = Integer.toString(count);
					count++;
					if(count/10==0) {
						calender[i][j] += " ";
					}
				}
			}
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(calender[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
