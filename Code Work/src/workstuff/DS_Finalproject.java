package workstuff;
import java.util.Scanner;
import java.util.Random;
public class DS_Finalproject {

	public static String wordToBeGuessed() {
		Random r = new Random();
		String[] words = {"Apple","Banana","Orange","Cactus"};
		int wordPicker = r.nextInt(4);
		String wordToGuess = words[wordPicker];
		System.out.println("The word has been randomly chosen...");
		System.out.println("Begin guessing!");
		return wordToGuess;
	}//end wordToBeGuessed
	
	public static void hangmanDrawing() {
		if (AmtGuesses == 1) {// one wrong guess
			System.out.println("Wrong! Try again: "); // wrong guess msg
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("___|___");
			System.out.println("");
		}//end else if
		else if (AmtGuesses == 2) {// second wrong guess
			System.out.println("Wrong! Try again: "); // wrong guess msg
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}//end else if
		else if (AmtGuesses == 3) {// third wrong guess
			System.out.println("Wrong! Try again: ");// wrong guess msg
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}//end else if
		else if (AmtGuesses == 4) {//fourth wrong guess
			System.out.println("Wrong! Try again: "); // wrong guess msg
			System.out.println("   ____________");
			System.out.println("   |          |");
			System.out.println("   |         / \\");
			System.out.println("   |         \\_/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}//end else if
		else if (AmtGuesses == 5) {//runs after fifth wrong attempt
			System.out.println("Wrong guess, try again:");// prints, "wrong guess, try again:"
			System.out.println("   ____________");
			System.out.println("   |          |");
			System.out.println("   |         / \\");
			System.out.println("   |         \\_/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}//end else if
		else if (AmtGuesses == 6) {//the last drawing for the sixth and final attempt
			System.out.println("GAME OVER! Nice try. YOU LOST!");// informs the player that they have lost and killed the stick man... :(
			System.out.println("   ____________");
			System.out.println("   |          |");
			System.out.println("   |         / \\");
			System.out.println("   |         \\_/");
			System.out.println("   |          /|\\");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("___|___");
			System.out.println("The word was: " + word);// prints out what the right answer was
		}//end else if
	}//end hangmanDrawing
	
	public static void player() {
		Scanner input = new Scanner(System.in);// scanner
		while (AmtGuesses < 6 && letters.contains("*")) {// limits the amount of guesses
			System.out.println("Guess a letter: ");//prints, Guess a letter
			System.out.println(letters);//prints the letters that the person guesses into the length of the 
			String guess = input.next();//prompts for input
			hang(guess);// prints the associated hangman image for the amount of guesses
		}
	}//end player
	
	public static void hang(String guess) {
		String newletters = "";
		
		for(int i = 0; i < word .length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newletters += guess.charAt(0);
			}//end if
			
			else if (letters.charAt(i) != '*') {
				newletters += word.charAt(i);
			}//end else if
			
			else {
				newletters += "*";
			}//end else
		}//end for
		
		if (letters.equals(newletters)) {
			AmtGuesses++;
			hangmanDrawing();
		}//end if
		
		else {
			letters = newletters;
		}//end else
		
		if (letters.equals(word)) {
			System.out.println("You won!");
		}//end if
	}//end hang
	
	static String word = wordToBeGuessed();//stores word1() to word
	public static String letters = new String(new char[word.length()]).replace("\0", "*");//places "*" for each letter in the word
	public static int AmtGuesses = 0;//sets AmtGuesses to 0
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player();
	}//end main
}


