package workstuff;
import java.util.Scanner;
public class Newstore {

	static Scanner scan = new Scanner (System.in); //creates a variable called Scanner, used to scan user input to be placed into a variable as a value
	/**
	 * store that has 3 items to choose from. from those 3 items you are allowed to buy any amount, and the bill is displayed
	 */
	public static void store() { 
		String nameOfCustomer; //Variable to store user's name
		System.out.println("What is your name?"); //prints out words inside brackets
		nameOfCustomer = scan.nextLine(); //Prompts user to input their name
		int numInput;//stores value inputted by user
		System.out.println("Welcome " + nameOfCustomer + ", to Elie's Baking Emporium!"); //prints words and value of variables inside brackets
		do {
		System.out.println("What would you like to buy?\n0. Exit\n1. Weed Brownie\n2. Cinnamon Buns\n3. Pie");//prints out the words inside brackets. words after the "\n" are put into a new line
		numInput = scan.nextInt(); //Prompts user to make a choice between 3 items
		if(numInput == 1) {//If user inputs 1 continue
			int amt; //variable used to store amt. value inputted by user (applies to all variables named amt)
			double price; //variable used to store total price of item + amt they wish to buy of that item (applies to all variables named price)
			System.out.println("How much would you like to buy?");//prints words inside brackets
			amt = scan.nextInt(); //user prompt asking how much of this item they would like to buy
			price = amt * 3; //multiplies the amount requested by the price per item
			System.out.println("That will cost you $" + price + ", have a good day!"); //prints words and value of variables inside brackets
		}//end if
		else if(numInput == 2) { //if user inputs 2 continue
			int amt;
			double price;
			System.out.println("How much would you like to buy?");//prints words inside brackets
			amt = scan.nextInt();//user prompt asking how much of this item they would like to buy
			price = amt * 3;//multiplies amt. requested by price per item
			System.out.println("That will cost you $" + price + ", have a good day!"); //prints words and value of variables inside brackets
		}//end else if
		else if(numInput == 3) { //if user inputs 3 continue
			int amt;
			double price;
			System.out.println("How much would you like to buy?"); //prints words inside brackets
			amt = scan.nextInt(); //user prompt asking how much of this item they would like to buy
			price = amt * 3; //multiplies amt. requested by price per item
			System.out.println("That will cost you $" + price + ", have a good day!"); //prints the words and value of variables inside brackets
		}//end else if
		else {//else statement used if all above if and else if statements not satisfied
			System.out.println("Sorry, we don't have that!");//prints the words inside brackets
			store();//calls the function "store" to restart the code
			
		}//end else if
		}while(numInput != 0);

	}
		
	public static void main(String[] args) {
		
		store();//runs the store function
	}

}
