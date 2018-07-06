package com.jda.test.code;
import com.jda.test.logic.*;

public class Array2D {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1.Integer 2.Doubles 3.Boolean");
		int choice = utility.inputTernary();
		System.out.println("Enter row and column size.");
		int row = utility.inputPositiveInteger();
		int column = utility.inputPositiveInteger();
		System.out.println("Enter values");
		switch(choice){
			case 1:
				utility.handleIntegerArray2D(row, column);
				break;
			case 2:
				utility.handleDoubleArray2D(row, column);
				break;
			case 3:
				utility.handleBooleanArray2D(row, column);
				break;
	}
		
	}
}
