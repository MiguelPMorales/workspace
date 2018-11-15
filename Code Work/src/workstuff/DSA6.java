package workstuff;
import java.util.ArrayList;
import java.util.Scanner;
public class DSA6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int restartChoice;
		ArrayList<String> allSongs = new ArrayList<>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Thank u, next");
		artists.add("Ariana Grande");
		
		allSongs.add("Happier");
		artists.add("Marshmello");
		
		allSongs.add("Without Me");
		artists.add("Halsey");
		
		//print library of songs & artists
		for(int i = 0; i < allSongs.size(); i++) { //print all songs
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}//end for

		do {
		System.out.println("1. Add to Library\n" +
		"2. Delete from Library \n" +
		"3. Add to Party Playlist \n" +
		"4. Exit");
		
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1:
				scan.nextLine(); //gets rid of extra enter character
				System.out.println("Enter song title: ");
				allSongs.add(scan.nextLine());
				System.out.println("Enter artist: ");
				artists.add(scan.nextLine());
				break;
				
			case 2:
				scan.nextLine();
				System.out.print("Enter song number to delete: ");
				int delete = scan.nextInt();
				allSongs.remove(delete);
				artists.remove(delete);
				break;
				
			case 3:
				System.out.println("Enter song number to add to party playlist: ");
				partyPlaylist.add(allSongs.get(scan.nextInt()));
				break;
				
			case 4:
				System.out.println("Bye!");
				break;
				
			default:
				System.out.println("Invalid option");
		}//end switch
		
		System.out.println("All songs:");
		for(int i = 0; i < allSongs.size(); i++) { //print all songs
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
		}//end for
		
		System.out.println("");
		System.out.println("In Party Playlist: ");
		for(int i = 0; i < partyPlaylist.size(); i++) {
			System.out.println(i + " " + partyPlaylist.get(i) + " " + artists.get(allSongs.get(i)));
		}//end for
		
		System.out.println("Would you like to keep using this program?\n1. Yes\n2. No");
		restartChoice = scan.nextInt();
		}while(restartChoice != 2);
	}//end main

}
