package workstuff;
import java.util.Scanner;
public class SimpleCaesarCipher {

	static Scanner scanNum = new Scanner(System.in);
	static Scanner scanLine = new Scanner(System.in);
	static String text;
	
	/**
	 * Encryption function that shifts the inputed letters up by a certain amount
	 * @param plainText - text to be encrypted
	 * @param shiftValue - amount to shift text by
	 */
	public static void CaesarEncrypter(String plainText, int shiftValue) {
		int textNum = plainText.length();
		plainText = plainText.toLowerCase(); //turns all the letters inside plainText to lowercase
		text = "";
		for(int i = 0; i < textNum; i++) {//continues as long as "i" is less than the number of letters
			char x = (char)(plainText.charAt(i) + shiftValue);//used to shift each letter by the shiftValue
			text = text + x;//adds the shifted letter to text
		}//end for
	}//end CaesarEncrypter
	
	/**
	 * Decryption function that shifts the inputed letters down by a certain amount
	 * @param encryptedText - encrypted text to be decrypted
	 * @param shiftValue - amount to shift letters down by
	 */
	public static void CaesarDecrypter(String encryptedText, int shiftValue) {
		int textNum = encryptedText.length();
		encryptedText = encryptedText.toLowerCase();
		text = "";
		for(int i = 0; i < textNum; i++) {//runs as long as "i" is less than the amount of letters
			char x = (char)(encryptedText.charAt(i) - shiftValue); //shifts the letters by the shiftValue
			text = text + x;//adds the shifted letter to text
		}//end for
	} //end CaesarDecrypter
	
	/**
	 * Used to choose between the decrypt or the encrypt function
	 */
	public static void Chooser() {
		int choice;
		System.out.println("Which program would you like to use?\n1. Encrypter\n2. Decrypter");
		choice = scanNum.nextInt();
		if(choice == 1) {//if user chooses encryption function continue
			String Sverifier = ""; //variable used to verify that user has inputed usable text to encrypt
			int Iverifier = 0; //variable used to verify that user has inputed usable number to shift letters with
			System.out.println("Running Encrypter Program.\nPlease enter the text you want to encrypt.");
			String plainText = scanLine.nextLine();
			if(plainText != Sverifier) { //if user inputed valid text continue
				System.out.println("Now, please enter the amount you wish to shift these letters at.");
				int shiftValue = scanNum.nextInt();
				if(shiftValue != Iverifier) {//if user inputed valid number value continue
					CaesarEncrypter(plainText,shiftValue);
				}//end if
				else {//if user did not input valid number value continue
					System.out.println("You did not input a valid shift value. Returning to menu.");
					Chooser();
				}//end else
			}//end if
			else {//if user did not input any text continue
				System.out.println("You did not input any text. Returning to menu.");
				Chooser();
			}//end else
		}//end if
		else if(choice == 2) {//if user chooses decryption function continue
			String Sverifier = "";
			int Iverifier = 0;
			System.out.println("Running Decrypter Program.\nPlease enter the text you want to decrypt.");
			String encryptedText = scanLine.nextLine();
			if(encryptedText != Sverifier) {//if user has entered encrypted text continue
				System.out.println("Now, please enter the amount you wish to shift these letters at.");
				int shiftValue = scanNum.nextInt();
				if(shiftValue != Iverifier) {//if user has entered valid number continue
					CaesarDecrypter(encryptedText,shiftValue);
				}//end if
				else {//if user did not entered any number continue
					System.out.println("You did not input a valid shift value. Returning to menu.");
					Chooser();
				}//end else
			}//end if
			else {//if user did not enter any encrpyted text
				System.out.println("You did not input any text. Returning to menu.");
				Chooser();
			}//end else
		}//end else if
		else {//if user did not make a valid choice between encrypter and decrypter
			System.out.println("Invalid choice.\nPlease choose a valid option.");
			Chooser();
		}
	}//end Chooser
	
	public static void main(String[] args) {
		Chooser();//runs chooser function
		System.out.println("Your encrypted/decrypted text is: " + text);//prints out the words + the value inside the variable "text"
		
	}//end main

}
