package workstuff;
import java.util.Scanner;
public class Tic_Tac_Toe {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int currentPlayer = 0;
		int checkWinner = 0;
		String playerFill = "";
		String[][] grid = new String[3][3];//create 2D array 3 rows 3 clmns

		for(int row = 0; row < grid.length; row++) {//prints down rows
			
			//prints each column
			for(int col = 0; col < grid[row].length; col++) {
				grid[row][col] = "-";
				System.out.print(grid[row][col]);//remove after code finished
			}//end for columns
			System.out.println();//prints a new line after the row is done //remove after code finished
		}//end for rows
		
		do {
			checkWinner = 1;
			/**
			if(currentPlayer == 0) {
				currentPlayer = 1;
				playerFill = "X";
			}//end if
		
			else if(currentPlayer == 1) {
				currentPlayer = 2;
				playerFill = "O";
			}//end else if
		
			else if(currentPlayer == 2) {
				currentPlayer = 1;
				playerFill = "X";
			}//end else if
		
			System.out.println("It is currently Player " + currentPlayer + "'s turn!");
			System.out.println("Please enter your desired vertical number (between 0-2):");
			int vtl = scan.nextInt();
			System.out.println("Please enter your desired horizontal number (between 0-2):");
			int hzl = scan.nextInt();
		
			grid[vtl][hzl] = playerFill;
			System.out.println("Token placed!");
			
			for(int row = 0; row < grid.length; row++) {//prints down rows
				
				//prints each column
				for(int col = 0; col < grid[row].length; col++) {
					System.out.print(grid[row][col]);//remove after code finished
				}//end for columns
				System.out.println();//prints a new line after the row is done //remove after code finished
			}//end for rows
			
			if(grid[0][0] == "X" && grid[1][0] == "X" && grid[2][0] == "X") {
				checkWinner = 1;
			}//end if
			
			else if(grid[0][0] == "X" && grid[0][1] == "X" && grid[0][2] == "X") {
				checkWinner = 1;
			}//end else if
			
			else if(grid[0][0] == "X" && grid[1][0] == "X" && grid[2][0] == "X") {
				checkWinner = 1;
			}//end else if
			
			else if(grid[0][0] == "X" && grid[1][1] == "X" && grid[2][2] == "X") {
				checkWinner = 1;
			}//end else if
			
			else if(grid[0][1] == "X" && grid[1][1] == "X" && grid[2][1] == "X") {
				checkWinner = 1;
			}//end else if
			
			else if(grid[0][2] == "X" && grid[1][2] == "X" && grid[2][2] == "X") {
				checkWinner = 1;
			}//end else if
//---------------------------------------------X-------------------------------------			
			else if(grid[0][0] == "O" && grid[1][0] == "O" && grid[2][0] == "O") {
				checkWinner = 2;
			}//end if
			
			else if(grid[0][0] == "O" && grid[0][1] == "O" && grid[0][2] == "O") {
				checkWinner = 2;
			}//end else if
			
			else if(grid[0][0] == "O" && grid[1][0] == "O" && grid[2][0] == "O") {
				checkWinner = 2;
			}//end else if
			
			else if(grid[0][0] == "O" && grid[1][1] == "O" && grid[2][2] == "O") {
				checkWinner = 2;
			}//end else if
			
			else if(grid[0][1] == "O" && grid[1][1] == "O" && grid[2][1] == "O") {
				checkWinner = 2;
			}//end else if
			
			else if(grid[0][2] == "O" && grid[1][2] == "O" && grid[2][2] == "O") {
				checkWinner = 2;
			}//end else if
			*/
		}while(checkWinner != 1 || checkWinner != 2);
		System.out.println("Congrats " + checkWinner + ", You won!");
	}//end main

}
