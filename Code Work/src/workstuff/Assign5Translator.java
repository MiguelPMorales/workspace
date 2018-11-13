package workstuff;
import java.util.Scanner;
public class Assign5Translator {

	static Scanner scan = new Scanner(System.in); //scan input
	static String choice = ""; //used to store input
	
	/**
	 * Allows user to choose between translating english to icelandic or icelandic to english
	 */
	public static void translatorOpt() {
		System.out.println("Which translator would you like to use? \n1. English to Icelandic\n2. Icelandic to English");
		int numChoice = scan.nextInt();
		if(numChoice == 1) {
			EngtoIce(); //calls the EngtoIce function
		}//end if
		
		if(numChoice == 2) {
			IcetoEng(); //calls the IcetoEng function
		}//end else if
		
		else { //if user does not choose either of the two translators continue
			System.out.println("You chose an invalid option. Please use a number to choose between the two translator options.");
			translatorOpt(); //restarts translatorOpt
		}//end else
	}//end translatorOpt
	
	/**
	 * Translates from a set number of English words to their Icelandic versions
	 */
	public static void EngtoIce() {
		
		String[] English = {"Welcome","You","Me","Happy","Sad","Trains","Okay","Bagel","Pizza","Cheese","Pepperoni","Bedroom","Fresh","Rabbit","Clam"};
		String[] Icelandic = {"Velkommin","Þú","Ég","Gleðilegt","Dapur","Lestir","allt í lagi","Bagel","Pizza","Ostur","Pepperoni","Svefnherbergi","Ferskt","Kanína","Clam"};
		//both arrays above used to find translated version of chosen word

			System.out.println("These are all the translatable words usable in this program:");
			for(int i = 0; i < English.length; i++) { //lists every english word translatable to icelandic
				System.out.println(English[i]);
			}//end for
			
			System.out.println("Which word would you like to have translated?"); //asks user what word they would like to translate
			scan.nextLine();//deletes hidden enter key
			choice = scan.nextLine();//actual word input
			
			for(int i = 0; i < English.length; i++) { //checks every word. once found, prints out the word along with its translated version
				boolean foundorNot = false;	//check if the word has been found and translated
				do { //does everything inside brackets
				if(choice.equalsIgnoreCase(English[i])) { //looks for chosen word by looking at each index of the english array. non case-sensitive
					foundorNot = true;
					if(foundorNot == true) { //if foundorNot is set to true continue
						System.out.println("English: " + English[i] + "\nIcelandic: " + Icelandic[i]);
					}//end if
				}//end if
				i++; //adds 1 to the "i" variable
				}while(i != English.length); //while the "i" variable does not equal the length of the English array go back to the "do"
				
				if(foundorNot == false) { //if foundorNot is still set to false continue
					System.out.println("Invalid word. Returning to translator options.");
					translatorOpt(); //calls translatorOpt
				}//end else if
			
			}//end for
			
			System.out.println("Would you like to continue translating? \n1. Yes\n2. No");
			int numchoice = scan.nextInt(); //stores number input
			if(numchoice == 1) { //if user input is 1 continue
				System.out.println("Returning to translator choices...");
				translatorOpt();
			}//end if
			
			else { //if user input is anything other than 1 continue
				System.out.println("Exiting...");
				System.exit(-1);
			}//end else
	}//end EngtoIce
	
	/**
	 * Translates from a set number of Icelandic words to the English versions
	 */
	public static void IcetoEng() {
	
		String[] English = {"Welcome","You","Me","Happy","Sad","Trains","Okay","Bagel","Pizza","Cheese","Pepperoni","Bedroom","Fresh","Rabbit","Clam"};
		String[] Icelandic = {"Velkommin","Þú","Ég","Gleðilegt","Dapur","Lestir","allt í lagi","Bagel","Pizza","Ostur","Pepperoni","Svefnherbergi","Ferskt","Kanína","Clam"};
		//both arrays used to find the translated version of the chosen word
		
		System.out.println("These are all the translatable words usable in this program:"); //lists all the available translatable words in icelandic to english
		for(int i = 0; i < Icelandic.length; i++) {
			System.out.println(Icelandic[i]);
		}//end for
		
		System.out.println("Which word would you like to have translated?"); //asks user to input word of choice
		scan.nextLine(); //deletes hidden enter key
		choice = scan.nextLine(); //actual user input
		
		for(int i = 0; i < Icelandic.length; i++) {//finds the word the user wants to translate and then prints it out
			boolean foundorNot = false;
			do {
			if(choice.equalsIgnoreCase(Icelandic[i])) { //looks for chosen word by looking at each index of the icelandic array. non case-sensitive
				foundorNot = true;
				if(foundorNot == true) { //if foundorNot is true continue
					System.out.println("Icelandic: " + Icelandic[i] + "\nEnglish: " + English[i]);
				}//end if
			}//end if
			i++;
			}while(i != Icelandic.length);
			
			if(foundorNot == false) { //if chosen word has not been found on the array continue
				System.out.println("Invalid word. Returning to translator options.");
				translatorOpt(); //calls translatorOpt
			}//end else if
		}//end for
		
		System.out.println("Would you like to continue translating? \n1. Yes\n2. No");
		int numchoice = scan.nextInt();//stores number input
		if(numchoice == 1) {//if user inputs 1 continue
			System.out.println("Returning to translator choices...");
			translatorOpt();
		}//end if
		
		else {//if user inputs anything other than 1 continue
			System.out.println("Exiting...");
			System.exit(-1);//exits the program
		}//end else
	}//end IcetoEng
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the English to Icelandic/Icelandic to English Translator!");
		translatorOpt();
	}//end main

}
