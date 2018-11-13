package workstuff;

public class Employees {

	public static void main(String[] args) {
		String[] employeeName = {"Greg","George","Jill","John","Basil"};
		int[] wage = {15,16,21,15,22};
		int[] hoursWorked = {20,30,15,60,38};
		
		for(int i = 0; i < employeeName.length; i++) {
			System.out.println("i: " + i + " Name: " + employeeName[i] + " \tWage: " + wage[i]);
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < employeeName.length; i++) {
			System.out.println(" Name: " + employeeName[i] + " \tPay: " + wage[i] * hoursWorked[i]);
		}//end for
		
		for(int i = 0; i < employeeName.length; i++) {//linear search for wage over 20
			if(wage[i] > 20) {
				System.out.println("FIRE Name: " + employeeName[i]);
				employeeName[i] = "";
				wage[i] = 0;
			}//end if
		}//end for
		
		for(int i = 0; i < employeeName.length; i++) {
			System.out.println(" Name: " + employeeName[i] + " \tPay: " + wage[i] * hoursWorked[i]);	
		}//end for
		
		
	}//end main

}
