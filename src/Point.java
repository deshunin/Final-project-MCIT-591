/**
 * We can store data from the CSV file in a list of points
 * These points can be plotted later
 * @author Sergii
 * @author Venky
 *
 */
public class Point {
	
	private double x;
	private double y;
	private String color;
	
	/**
	 * This constructor sets the color as black
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		this.color = "black";
	}
	
	/**
	 * This constructor sets the color as user input
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public Point(double x, double y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
