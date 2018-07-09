package com.jda.test.code;
import java.util.Arrays;
import com.jda.test.logic.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		Utility utility = new Utility();
		char[][] board = new char[3][3];
		for(char[] row : board){
			Arrays.fill(row, 'E');
		}
		utility.printBoard(board , 3, 3);
		utility.playTicTacToe(board, 3 ,3);
	}

}
