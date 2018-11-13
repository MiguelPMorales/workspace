package workstuff;

public class Assign4Fundraising {
	
	public static void main(String[] args) {
		String[] student = {"Marc","Mark","Marque","Marquois","Jean","Jeanne","Jeanette","Rob","Robert","Bah-lah-key"}; //names of student
		int[] mnyRaised = {110,140,130,819,840,568,704,120,698,899}; //money raised
		boolean[] formsCheck = {true,false,false,true,true,false,false,true,false,true}; //check if students have handed in their forms
		int totalRaised = 0; //total raised by students
		int avgRaised = 0; //avg amt raised by the students
		int goldenFanTotal = 0; // total amt raised by students who individually raised more than $200
		
		for(int i = 0; i < student.length; i++ ) {//list of students w/ money they raised and if they returned their forms yet or not
			System.out.println("Student: " + student[i] + " Money Raised: " + mnyRaised[i] + " Returned form?: " + formsCheck[i]);
		}//end for
		
		for(int i = 0; i < student.length; i++ ) { //total amt of money raised by the students along with the avg amt of funds raised by the students
			totalRaised += mnyRaised[i]; //adds each of the student's raised money to the total
			avgRaised = totalRaised / student.length; //divides the total amt of money by the amt of students
		}//end for
		System.out.println("This team raised a total of: $" + totalRaised); //prints total amt of money raised
		System.out.println("Each student raised an average of: $" + avgRaised); //prints avg amt of money raised by each student
		
		for(int i = 0; i < student.length; i++) { //checks students who raised more than $200. also checks for students who have handed in their forms
			if(mnyRaised[i] > 200) { //if student has raised more than $200 continue
				System.out.println("Student: " + student[i] + " raised more than $200."); //prints out student who raised more than 200
			}//end if
			if (formsCheck[i] != true) { //if student did not hand in their forms yet continue
				System.out.println("Student: " + student[i] + " did not hand in their forms yet. FOR SHAME!"); //prints student name and shames them for not returning their form
			}//end if
		}//end for
		
		for(int i = 0; i < student.length; i++) { //checks for students who raised less than $200
			if(mnyRaised[i] < 200) { //if student raised less than 200 continue
				System.out.println("Student: " + student[i] + " raised less than $200. FOR SHAME!"); //prints student name and shames them for not raising funds beyond 200
			}//end if
		}//end for
		
		for(int i = 0; i < student.length; i++) { //prints the total amt raised by students who raised more than $200
			if(mnyRaised[i] > 200) { //if student raised more than $200 continue
				goldenFanTotal += mnyRaised[i]; //adds money raised by that student to the goldenFanTotal
			}//end if
		}//end for
		System.out.println("The total raised by students who raised more than $200 is: " + goldenFanTotal); //prints out the total raised by students who raised more than $200 individually
		
/** OUTPUT
* Student: Marc Money Raised: 110 Returned form?: true
Student: Mark Money Raised: 140 Returned form?: false
Student: Marque Money Raised: 130 Returned form?: false
Student: Marquois Money Raised: 819 Returned form?: true
Student: Jean Money Raised: 840 Returned form?: true
Student: Jeanne Money Raised: 568 Returned form?: false
Student: Jeanette Money Raised: 704 Returned form?: false
Student: Rob Money Raised: 120 Returned form?: true
Student: Robert Money Raised: 698 Returned form?: false
Student: Bah-lah-key Money Raised: 899 Returned form?: true
This team raised a total of: $5028
Each student raised an average of: $502
Student: Mark did not hand in their forms yet. FOR SHAME!
Student: Marque did not hand in their forms yet. FOR SHAME!
Student: Marquois raised more than $200.
Student: Jean raised more than $200.
Student: Jeanne raised more than $200.
Student: Jeanne did not hand in their forms yet. FOR SHAME!
Student: Jeanette raised more than $200.
Student: Jeanette did not hand in their forms yet. FOR SHAME!
Student: Robert raised more than $200.
Student: Robert did not hand in their forms yet. FOR SHAME!
Student: Bah-lah-key raised more than $200.
Student: Marc raised less than $200. FOR SHAME!
Student: Mark raised less than $200. FOR SHAME!
Student: Marque raised less than $200. FOR SHAME!
Student: Rob raised less than $200. FOR SHAME!
The total raised by students who raised more than $200 is: 4528
*/
	}//end main
	
}
