package workstuff;
import java.util.Scanner;
public class Newerstore {

	static double price = 0; //variable used to store total price of item + amt they wish to buy of that item
	static final double tax = 0.05; //variable used to act as tax of items being bought
	
	static Scanner scan = new Scanner (System.in); //creates a variable called Scanner, used to scan user input to be placed into a variable as a value
	public static double buyingProcess(double itemPrice) {
		int amt;
		double price;
		System.out.println("How much would you like to buy?");
		amt = scan.nextInt();
		price = amt * itemPrice;
		return price;
	}
	public static void menu() {
		String nameOfCustomer; //Variable to store user's name
		System.out.println("What is your name?"); //prints out words inside brackets
		nameOfCustomer = scan.nextLine(); //Prompts user to input their name
		int numInput;//stores value inputed by user
		
		double totalPrice = 0;
		
		System.out.println("Welcome " + nameOfCustomer + ", to Elie's Baking Emporium!"); //prints words and value of variables inside brackets
		do {
		System.out.println("What would you like to buy?\n0. Exit/Pay\n1. Brownie\n2. Cinnamon Buns\n3. Pie");//prints out the words inside brackets. words after the "\n" are put into a new line
		numInput = scan.nextInt(); //Prompts user to make a choice between 3 items
		if(numInput == 1) {//If user inputs 1 continue
			price+= buyingProcess(3.99);
		}
		else if(numInput == 2) { //if user inputs 2 continue
			price += buyingProcess(5.99);
		}
		else if(numInput == 3) { //if user inputs 3 continue
			price += buyingProcess(8.50);
		}
		double taxPrice;
		taxPrice = price * tax;
		totalPrice = totalPrice + (price + taxPrice);
		
		}while(numInput != 0);
		System.out.println("That will cost you $" + totalPrice + ", have a good day!");
	}//end menu
	
	
	
	public static void main(String[] args) {
		menu();

	}//end main

}
