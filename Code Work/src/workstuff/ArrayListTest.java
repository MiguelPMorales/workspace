package workstuff;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> listofInts = new ArrayList<>();
		//useful methods of ArrayList
		
		listofInts.add(98); //adding to arrayList
		listofInts.add(55);
		listofInts.add(1, 80); //inserts to index 1 in this case
		listofInts.remove(0); //remove item at first index
		listofInts.get(0); //returns item at index 0
		listofInts.size(); //returns size of ArrayList
		
		//print ArrayList
		listofInts.add(98);
		listofInts.add(24);
		
		for(int i = 0; i < listofInts.size(); i++) {
			System.out.println(listofInts.get(i));
		}//end for
		
		listofInts.remove(listofInts.size()-1);
		
		//print new ArrayList
		for(int i = 0; i < listofInts.size(); i++) {
			System.out.println(listofInts.get(i));
		}//end for

	}//end main

}
