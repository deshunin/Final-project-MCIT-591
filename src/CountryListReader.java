import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * The  method reads data from the csv data files to create the ArrayList 
 * of countries for the data analysis and visualization results
 * @author sd
 *
 */
public class CountryListReader {
	private ArrayList<Country> countries;
	
	public CountryListReader(String filename) {
		File countryList = new File(filename);
		try {
			Scanner s = new Scanner(countryList);
			s.nextLine(); // excluding the header of the file
			while(s.hasNextLine()){
				String line = s.nextLine();
				//read data and create objects in ArrayList countries 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
