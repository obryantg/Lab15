package countries;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTxtFile {
		
	
			
	public static void writeToFile() {
		Scanner sc = new Scanner(System.in);
		String input;
		
		Path countriesList = Paths.get("countries.txt");
		File countriesFile = countriesList.toFile();
		
		//try {
			//PrintWriter out = new PrintWriter(countriesFile);
			//out.println("List of Countries:");
		  try {
	            FileWriter out = new FileWriter(countriesFile,true);
	            System.out.print("Enter a country: ");
	            input = sc.nextLine();
	        out.append(input + "\n");
	        System.out.println("Entry Saved");
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sc.close();
		}
		
}
	public static void readfromFile()
	{
	Path countriesPath= Paths.get("countries.txt");
	File countriesFile= countriesPath.toFile();
	try {
	FileReader fr = new FileReader(countriesFile);
	BufferedReader br = new BufferedReader( fr);
	String line = br.readLine();
	while (line !=null)
	{
	//	skips lines that are blank until end
		if (! line.equals(""))
	System.out.println(line);
	line = br.readLine(); //read another line
	}
	br.close();
	}
	catch (IOException e)
	{
	System.out.println(e);
	}
}
}
