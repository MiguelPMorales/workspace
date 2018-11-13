package workstuff;

public class DSA4 {

	public static void main(String[] args) {
		String[] names = {"A","B","C","D","E","F","G","H","I","J"};
		double[] raisedMny = {100,200.20,300,400.75,450,500.12,120.45,700,201.50,133};
		boolean[] hasForms = {true,false,true,false,true,false,true,false,true,false};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " $: " + raisedMny[i] + " form: " + hasForms[i]);
		}//end for
		
		//step 2
		double totalAmt = 0;
		for(int i = 0; i < raisedMny.length; i++) {
			totalAmt += raisedMny[i]; //add each index to totalAmt
		}//end for
		double avgRaised = totalAmt / names.length; //calculates avg amt raised
		
		int bigMoneyCount = 0; //tracks how many ppl raised over $200
		
		for(int i = 0; i < raisedMny.length; i++) { //searching for >200
			//counting number of ppl over $200
			if(raisedMny[i] > 200) {
				System.out.println(names[i] + " Raised " + raisedMny[i]);
				bigMoneyCount++; //add one to bigMoneyCount
			}//end if
		}//end for
		
		for(int i = 0; i < hasForms.length; i++) {
			//searching for ppl who have not returned their form
			if(hasForms[i] == false) {
				System.out.println(names[i] + " has not returned form");
			}//end if
		}//end for
		
		System.out.println("Total amount Raised " +  totalAmt);
		System.out.println("avg amount raised " + avgRaised);
		
		double lowestAmt;//declare var for item tracked
		lowestAmt = raisedMny[0];//assume first index is item searched for
		String person;
		int nameIndex = 0;//tracks index of the person with lowest amt raised
		for(int i = 0; i < raisedMny.length; i++) {//find lowest amt raised
			if(raisedMny[i] < lowestAmt) {
				lowestAmt = raisedMny[i];
				nameIndex = i;
				person = names[i];
			}//end if
		}//end for
		
		System.out.println("lowest amount raised: " + lowestAmt + " by " + names[nameIndex]);
		
	}//end main

}
