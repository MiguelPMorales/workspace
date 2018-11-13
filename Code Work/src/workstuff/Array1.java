package workstuff;
import java.util.Random;
public class Array1 {

	public static void main(String[] args) {
		Random r = new Random();
		String[] nameArray = {"Christian","Tyrone","Uniqua","Scott","Nya","Mr.Truong"};
		int[] gradesArray = new int[nameArray.length]; 
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {//print arrays
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}//end for
		
		for(int i = 0; i < gradesArray.length; i++) {//print arrays
			gradesArray[i] = r.nextInt(101);
		}//end for
	
		gradesArray[5] = 85;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}//end for
		
		for(int i = 0; i < nameArray.length; i++) {//avg
			avg += gradesArray[i];
		}//end for
		avg = avg/gradesArray.length;
		System.out.println("Class Average: " + avg);
	}//end main

}
