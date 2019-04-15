import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryListReader {
	private ArrayList<Country> countries;
	
	public CountryListReader(String filename) {
		File countryList = new File(filename);
		try {
			Scanner s = new Scanner(countryList);
			s.nextLine(); // excluding the header of the file
			while(s.hasNextLine()){
				String line = s.hasNextLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
