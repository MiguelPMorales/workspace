package workstuff;

public class TicTacToe {

	public static void main(String[] args) {
		String[] gameBoard = new String[3];//single dimension array
		gameBoard[0] = "-";
		gameBoard[1] = "-";
		gameBoard[2] = "-";
		
		for(int i = 0; i < gameBoard.length; i++) {
			System.out.println(gameBoard[i]);
		}//end for
		
		String[][] grid = new String[3][3];//create 2D array 3 rows 3 clmns
		grid[0][0] = "-";
		grid[1][1] = "-";
		grid[2][2] = "-";
		
		for(int row = 0; row < grid.length; row++) {//prints down rows
			
			//prints each column
			for(int col = 0; col < grid[row].length; col++) {
				grid[row][col] = "-";
				System.out.print(grid[row][col]);
			}//end for columns
			System.out.println();//prints a new line after the row is done
		}//end for rows
		
		grid[1][1] = "X";
		
		for(int row = 0; row < grid.length; row++) {//prints down rows
			
			//prints each column
			for(int col = 0; col < grid[row].length; col++) {
				//grid[row][col] = "-";
				System.out.print(grid[row][col]);
			}//end for columns
			System.out.println();//prints a new line after the row is done
		}//end for rows
		
		int player = 1;
		//take input player
		//place the token
		//switch players
		player = 2;
	}//end main

}
