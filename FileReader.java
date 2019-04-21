import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class is an adaptation of the file reading I did in the fifth assignment for MCIT
 * @author Venky
 * @author Sergii
 *
 */
public class FileReader {
	
	/**
	 * This method provides an easy method to return all of the information in a file without punctuation
	 * as a list of words
	 * @param fileName the name of the file
	 * @return the information in the file as an ArrayList of lines(Strings) in the file
	 */
	public static ArrayList<String> readWords(String fileName){
		return read(fileName, true);
	}
	
	
	/**
	 * This method provides an easy method to return all of the information in a file without punctuation
	 * as a list of words
	 * @param fileName the name of the file
	 * @return the information in the file as an ArrayList of lines(Strings) in the file
	 */
	public static ArrayList<String> readLines(String fileName){
		return read(fileName, false);
	}
	
	/**
	 * This method provides an easy method to return all of the information in a file without punctuation
	 * as a list of words
	 * @param fileName the String with the file name
	 * @param next whether or not the file should be read by word (true) or by line (false)
	 * @return the information in the file as an ArrayList
	 */
	private static ArrayList<String> read(String fileName, boolean next) {
		

		File input = new File(fileName);
		ArrayList<String> information = new ArrayList<String>();
		
		
		//uses a simple try catch to read the file
		try {
			
			Scanner fileReader = new Scanner(input);
			
			if(next) //if reading by word, the ArrayList will contain info by word
				while(fileReader.hasNext()) 
					information.add(fileReader.next());
				
			else //otherwise the ArrayList will contain info by lines
				while(fileReader.hasNextLine())
					information.add(fileReader.nextLine());
			
			fileReader.close();
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		return information;
	}

	/**
	 * Reads a csv file and provides the output as an ArrayList of ArrayList of Strings
	 * @param fileName the name of the csv file to be read
	 * @return all of the data in the file: The outer ArrayList contains the data line by line
	 * the inner ArrayList contains the data word by word
	 */
	public static ArrayList<ArrayList<String>> readGrid(String fileName) {
		

		File input = new File(fileName);
		ArrayList<ArrayList<String>> information = new ArrayList<ArrayList<String>>();
		
		
		//uses a simple try catch to read the file
		try {
			
			Scanner fileReader = new Scanner(input);
			ArrayList<String> row = new ArrayList<String>();
			String rowInfo;
			while(fileReader.hasNextLine()) {
				rowInfo = fileReader.nextLine();
				row = new ArrayList<String>(Arrays.asList(rowInfo.split(",")));
				information.add(row);
			}
			
			fileReader.close();
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		return information;
	}
	
	
}
