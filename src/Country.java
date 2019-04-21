/**
 * The class Country represent a country, identified by the name and the code
 * instances of the class includes gross domestic product, populations for several years in the period
 * from 1979 till 2016, the period of 38 years
 * @author sd
 *
 */
public class Country {
	
	private int countryCode; // a code of a country
	private String countryName; // a name of a country
	private double[] gdpPPP; // an array of an annual country's gross domestic products at purchasing power parity in the period
	private double[][] malePopulations; // an array of country's male age group populations in the period
	private double[][] femalePopulation; // an array of country's male age group populations in the period
	private double[][] wellBeingIndex; // an array of country's wellBeing  indices in the period
	private double[][] maleNumberOfDeath; // an array of number of death of males in all age groups in the period
	private double[][] femaleNumberOfDeath; // an array of number of death of females in all age groups in the period

	public int getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	/**
	 * @return the gdpPPP
	 */
	public double[] getGdpPPP() {
		return gdpPPP;
	}

	/**
	 * @return the malePopulations
	 */
	public double[][] getMalePopulations() {
		return malePopulations;
	}

	/**
	 * @return the femalePopulation
	 */
	public double[][] getFemalePopulation() {
		return femalePopulation;
	}

	/**
	 * @return the wellBeingIndex
	 */
	public double[][] getWellBeingIndex() {
		return wellBeingIndex;
	}

	/**
	 * @return the maleNumberOfDeath
	 */
	public double[][] getMaleNumberOfDeath() {
		return maleNumberOfDeath;
	}

	/**
	 * @return the femaleNumberOfDeath
	 */
	public double[][] getFemaleNumberOfDeath() {
		return femaleNumberOfDeath;
	}
	
	

}