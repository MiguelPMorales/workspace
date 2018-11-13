package workstuff;

public class SuperheroArray {

	public static void main(String[] args) {
		String[] HeroesArray = {"Speedy Man","Strong Man","Focus Man","Depression Man","Supper Man"}; //array for superhero names
		System.out.println(HeroesArray[0]); //calls the first value of HeroesArray
		System.out.println(HeroesArray[HeroesArray.length - 1]); //calls the last value of HeroesArray
		
		for(int i = 0; i < HeroesArray.length; i++) {//prints every name in HeroesArray
			System.out.println(HeroesArray[i]); //prints value inside each index of HeroesArray
		}//end for
		
		String[] SuperpowersArray = {"Super Speed","Super Strength","Super Focus","Super Depression","Super Supper"}; //array for superhero names
		Boolean[] isHumanArray = {true, false, true, true, false}; //array to tell if superheroes are human or non-human
		System.out.println("Name Power Are they human?"); //prints words inside brackets 
		
		for(int i = 0; i < HeroesArray.length; i++) { //prints every superhero along with their superpower and if they are human or not
			System.out.println(i + " " + HeroesArray[i] + " " + SuperpowersArray[i] + " " + isHumanArray[i]);
		}//end for
		
		System.out.println("Superheroes now exposed to Couprinite"); //line 22 & 23 print words inside brackets
		System.out.println("Name Power Are they human?");
		
		for(int i = 0; i < HeroesArray.length; i++) { //all non-humans have their powers set to NONE
			if(isHumanArray[i] == false) {//if superhero is not a human continue
				SuperpowersArray[i] = "NONE"; //updates the superpower of that superhero to NONE
			}//end if
		}//end for
		
		for(int i =  0; i < HeroesArray.length; i++) {//reprints every superhero along with their superpowers and if they are human or not
			System.out.println(i + " " + HeroesArray[i] + " " + SuperpowersArray[i] + " " + isHumanArray[i]);
		}//end for
			
		//--OUTPUT--
		//Speedy Man
		//Supper Man
		//Speedy Man
		//Strong Man
		//Focus Man
		//Depression Man
		//Supper Man
		//Name Power Are they human?
		//0 Speedy Man Super Speed true
		//1 Strong Man Super Strength false
		//2 Focus Man Super Focus true
		//3 Depression Man Super Depression true
		//4 Supper Man Super Supper false
		//Superheroes now exposed to Couprinite
		//Name Power Are they human?
		//0 Speedy Man Super Speed true
		//1 Strong Man NONE false
		//2 Focus Man Super Focus true
		//3 Depression Man Super Depression true
		//4 Supper Man NONE false
		//--END OUTPUT--
	}//end main

}

