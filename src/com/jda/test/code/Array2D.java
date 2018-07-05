package com.jda.test.code;
import com.jda.test.logic.*;

public class Array2D {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1.Integer 2.Doubles 3.Boolean");
		int choice = utility.inputTernary();
		System.out.println("Enter row and column size.");
		int row = utility.takeInputInteger();
		int column = utility.takeInputInteger();
		System.out.println("Enter values");
		switch(choice){
			case 1:
				int[][] data = new int[row][column];
				for(int i=0;i<row;i++){
					for(int j = 0;j<column;j++){
						data[i][j] = utility.takeInteger();
					}
				}
				break;
			case 2:
				double[][] data = new double[row][column];
				for(int i=0;i<row;i++){
					for(j=0;j<column;j++){
						data[i][j] = utility.takeDouble();
					}
				}
				break;
		}
	}

}
