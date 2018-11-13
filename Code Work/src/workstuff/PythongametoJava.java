package workstuff;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class PythongametoJava {
	//backpack.append = adds to backpack (add parentheses)
	//backpack.contains = passes a string to search for what you are looking for (add parentheses)
	static int UserHP = 50;
	//Sets UserHP to 50
	static ArrayList<String> backpack = new ArrayList<>();
	static Scanner scan = new Scanner ( System.in);
	
	public static void window1() throws InterruptedException { //Defines window1 w/ no arguments
		System.out.println("You die from the fall. Bad choice");
		//Prints You die from the fall. Bad choice
		Thread.sleep(3000);
		//Sleeps pgm. for 3 secs.
		YourRoom();
		//Calls YourRoom so it goes back to the beginning
	}//end window1
	
	public static void door1() throws InterruptedException { //Defines door1 w/ no arguments
		System.out.println("You end up in your kitchen.");
		//Prints You end up in your kitchen
		Thread.sleep(3000);
		//Sleeps the pgm. for 3 secs.
		System.out.println("You hear a noise coming from the basement");
		//prints You hear a noise coming from the basement
		Thread.sleep(3000);
		//Sleeps the pgm. for 3 secs.
		System.out.println("Go to see what caused the noise? or Stay?");
		//Prints "Go to see what caused the noise? or Stay?"
		
		int choice;
		System.out.println("Choose 1 to Go, Choose 2 to Stay");
		choice = scan.nextInt();
		if (choice == 1) { //If the userchoice is equal to "Go" continue
			basement1();
			//calls basement1()
		}
		else if (choice == 2) { //else if the choice is equal to "Stay' continue
			kitchen1();
			//calls kitchen1()
		}
		else { //If the anwser is something either than "Go" or "Stay" continue
			System.out.println("Invalid choice, Try again");
			//prints "Invalid choice, Try again"
			door1();
			//calls door1()	
		}
		
		
	}//end door1
	
	public static void basement1() throws InterruptedException { //defines basement1 with nho arguments
		System.out.println("You enter the Basement");
		//prints "You enter the Basement"
		Thread.sleep(3000);
		//Sleeps pgm. for 3 secs.
		System.out.println("False alarm, It was just a box");
		//Prints "False alarm, It was just a box"
		Thread.sleep(3000);
		//Sleeps pgm. for 3 secs.
		System.out.println("There is however clothes for you to take");
		//Prints There is however clothes for you to take
		Thread.sleep(3000);
		//Sleeps pgm. for 3 secs.
		System.out.println("Would you like to take these clothes?");
		//prints Would you like to take these clothes?
		Thread.sleep(3000);
		//sleeps pgm. for 3 secs.
		
		int choice;
		System.out.println("Say 1 to take clothes. Say 2 to leave them.");
		choice = scan.nextInt();
		if (choice == 1 && backpack.contains("Clothes")) {
			//if the user choice equals to Yes and clothes are not in the variable Backpack
			if(backpack.contains("Clothes")) {
				//if Clothes are in Backpack continue
				System.out.println("You already have clothes. Why would you need more?");
				//prints "You already have clothes. Why would you need more?"
			}//end inner if statement
			else {
				backpack.add("Clothes");
				//goes to Backpack and adds the Item "Clothes to it"
			}//end inner else statement
			
		}//end if statement
		else if(choice == 2) {
			//if the user choice is equal to No continue
			System.out.println("That's alright, I also like being without clothes");
			//prints That's alright, I also like being without clothes
		}//end else if statement
		else {
			//if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
			System.out.println("I don't think you understood the question");
			//prints "I don't think you understood the question"
			Thread.sleep(3000);
			//Sleeps pgm. for 3 secs.
			basement1();
			//calls the function basement1() to go to it
		}//end else statement
		}//end basement
		
	
	public static void YourRoom() throws InterruptedException {
		System.out.println("Your name is Rebly.");
		//Prints "Your name is Rebly."
		Thread.sleep(4000);
		//Sleeps program for 4 secs.
		System.out.println("Rebly wakes up in their room.");
		//Prints "Rebly wakes up in their room."
		Thread.sleep(3000);
		//Sleeps program for 3 secs.
		System.out.println("You wake up with only underwear on.");
		//Prints "You wake up with only underwear on."
		Thread.sleep(3000);
		//Sleeps program for 3 secs.
		System.out.println("You hear glass breaking outside.");
		//Prints "You hear glass breaking outside."
		Thread.sleep(3000);
		//Sleeps program for 3 secs.
		System.out.println("You look out the window and zombies are overrunning the place.");
		//Prints " You look out the window and zombies are overrunning the place."
		Thread.sleep(4000);
		//Sleeps pgm. for 4 secs.
		System.out.println("You know you have to make quick decisions.");
		//Prints "You know you have to make quick decisions"
		Thread.sleep(3000);
		//Sleeps pgm. for 3 secs.
		System.out.println("Your options are:");
		System.out.println("1. Jump out the Window(Potential Danger)");
		System.out.println("2. Walk out of the Room(Potential Danger)");
		 // Prints "Your options are:
		 // 1. Jump out the Window(Potential Danger)
		 // 2. Walk out of the Room(Potential Danger)"
		
		int choice;
		System.out.println("Enter a Number for your Choice, Remember Both have potential Danger");
		choice = scan.nextInt();
		//Makes the variable choice and prints "Enter a number for your Choice, Remember Both have potential Danger"
		if (choice == 1) {
			window1();
			//Continues through window1
		}
		else if (choice == 2) {
			door1();
			//Continues through door1
		}
		else { //If the answer is different than 1 or 2 continue
			System.out.println("Invalid choice, Try again");
			//prints "Invalid choice, Try again"
			YourRoom();
		}//end choice
		

		
		
	}//end YourRoom
	
	public static void main(String[] args) {
		System.out.println("This game will be based on your choices.");
		//Prints "This game will be based on your choices."
		System.out.println("Choose wisely.");
		//Prints "Choose wisely."
		
		

		
		

	}

}
