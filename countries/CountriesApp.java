package countries;

//import java.io.BufferedReader;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reply = "";
		
		do
		{
		reply = mainLoop(sc);
		}while (reply.equalsIgnoreCase("y"));
		System.out.println("Peace out");
		sc.close();
	}

	public static String mainLoop(Scanner sc) {
		String reply;
		String input = initialize(sc);
		optionMenu(input);
		System.out.println("Back to menu? (y or n)");
		reply = sc.nextLine();
		return reply;
	}

	public static String initialize(Scanner sc) {
		String input = "";
		
		
		System.out.println("Welcome to the Countries Maintenence App");
		System.out.println("1 - See the list of countries\n2 - Add a Country\n3 - Exit");
		input = sc.nextLine();
		return input;
	}

	public static void optionMenu(String input) {
		switch(input){
		case "1":
			CountriesTxtFile.readfromFile();
			break;
		case "2":
			CountriesTxtFile.writeToFile();
			break;
		case "3":
			break;
			default:
				System.out.println("Please Enter a valid number peasant:");
		}
	}

}
