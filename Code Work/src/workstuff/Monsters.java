package workstuff;
import java.util.Scanner;
public class Monsters {

	static Scanner wscan = new Scanner(System.in);
	static Scanner nscan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] monsters = {"Ghost","Skeleton","Imp","Vampire","Francis","Poor Life Choices","Player"};
		
		System.out.println("Enter player name: ");
		monsters[monsters.length - 1] = "Player: " + wscan.nextLine();
		
		int[] coins = new int[monsters.length];
		
		//add coins
		for(int i = 0; i < monsters.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(monsters[i] + " has " + coins[i] + " coins.");
		}//end for
		
		String[] abilities = new String[monsters.length];
		abilities[0] = "Wall Hacks";
		abilities[1] = "Big Spook";
		abilities[2] = "Claws";
		abilities[3] = "Succ Blood";
		abilities[4] = "Ask for Food";
		abilities[5] = "Haunting Life Choice";
		abilities[6] = "A Bucket of Water";
		
		for(int i = 0; i < monsters.length; i++) {
			System.out.println(monsters[i] + " will attack with: " + abilities[i]);
		}//end for
		
		int[] hp = new int[monsters.length];
		
		//assign random hp
		for(int i = 0; i < monsters.length; i++) {
			hp[i] = (int)(Math.random() * 15 + 2); 
		}//end for
		
		for(int i = 0; i < monsters.length; i++) {
			System.out.println(monsters[i] + " has " + hp[i] + " health points.");
		}//end for
		
		System.out.println("The " + monsters[2] + " ate a teenager, how " + 
		"many coins did it get?"); //prompt to enter a number
		coins[2] += nscan.nextInt(); //adding coins to coins[2]
		
		//taking in a string from user input
		System.out.println(monsters[2] + " morphs into what?: "); //prompt
		monsters[2] = wscan.nextLine();
		
		System.out.println("The new monster is now a: " + monsters[2]);
		
		int totalCoins = coins[monsters.length - 1]; //accumulator
		int turns = 0; //track turns
		
		//TODO
			//Fight
		while(hp[hp.length - 1] > 0) {
			int randomMonster = (int)(Math.random() * monsters.length);//pick random monster
				if(randomMonster != monsters.length - 1) {
				//Decide hit or be hit
					int hitChance = (int)(Math.random() * 2);
					
					if(hitChance % 2 == 0) {//monster does dmg
						//subtract random hp if player is hit
						int randomDmg = (int)(Math.random() * 2 + 1);
						hp[monsters.length - 1] -= randomDmg; //subtracting hp
						System.out.println(monsters[randomMonster] + " hit you for: " + randomDmg +
						" hp! " + hp[monsters.length - 1] + " HP left.");
					}//end if
					else {//player does dmg
						System.out.println("Player hits with " + abilities[monsters.length - 1] + 
						" " + monsters[randomMonster] + " runs away! It left " + coins[randomMonster] +
						" coins.");
						totalCoins += coins[randomMonster];
					}//end else
					//track number of turns
					turns++;
				}//end if
				System.out.println();
			}//end while
		
			System.out.println("You run away with " + totalCoins + " coins"
					+ " and lasted " + turns + " Turns.");
				//Collect coins
				//Track number of turns
			//Fight while player hp > 0
	}//end main

}
