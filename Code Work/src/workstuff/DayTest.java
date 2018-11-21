package workstuff;

public class DayTest {

	public static void main(String[] args) {
		Day today = new Day();
		Day birthDay = new Day(1951, 5, 26);
		Day lastDay = new Day(2012, 7, 23);
		
		System.out.println(birthDay);
		System.out.println(lastDay);
		System.out.println(lastDay.daysFrom(birthDay));

	}//end main

}
