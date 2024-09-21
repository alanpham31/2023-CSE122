import java.util.*;
import java.io.*;

public class MovieFavorites {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		System.out.print("What is the name of your favorites list file? ");
		String fileName = console.nextLine();
		// stored with most favorite at index 0, in decreasing order 
		List<String> favorites = loadFavorites(fileName);

		String userChoice = "";
		while (!userChoice.equalsIgnoreCase("quit")) {
			System.out.println("What would you like to do?");
			System.out.print("You can (quit), (compare), (report) top n, (move) down the list, (add) a " + 
							 "list of favorites, or (save) to file. ");
			userChoice = console.nextLine();
			if (userChoice.equalsIgnoreCase("compare")) {
				//compareToOtherFavorites(console, favorites);
			} else if (userChoice.equalsIgnoreCase("report")) {
				//reportTopN(console, favorites);
			} else if (userChoice.equalsIgnoreCase("move")) {
				//moveDownList(console, favorites);
			} else if (userChoice.equalsIgnoreCase("add")) {
				//addOtherFavoritesList(console, favorites); 
			} else if (userChoice.equalsIgnoreCase("save")) {
				//saveToFile(console, favorites);
			} // just reprompt if not one of these options
		}
	}
}