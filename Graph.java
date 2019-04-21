import java.util.ArrayList;

/**
 * This class will contain the name and the list of points
 * This information will be selected and plotted on the GUI
 * @author Sergii
 * @author venky
 *
 */
public class Graph {
	
	private String name;
	private ArrayList<Point> points;
	
	/**
	 * Creates a new Graph object
	 * @param name contains the name of the graph
	 * @param points the points on the graph
	 */
	public Graph(String name, ArrayList<Point> points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	
	/**
	 * Gets the range of the graph
	 * The bounds are the lowest or highest values in the dataset +/- 10%
	 * @return an ArrayList with 4 doubles.
	 * @return the first is the lower x-bound, the second is the higher x-bound
	 * @return the third is the lower y-bound, the fourth is the higher y-bound
	 */
	public ArrayList<Double> getRange() {
		
		double xMin = points.get(0).getX();
		double xMax = xMin;
		
		double yMin = points.get(0).getY();
		double yMax = yMin;
		
		//go through all of the points and find the min and max values
		for(Point p : points) {
			
			double currentX = p.getX();
			double currentY = p.getY();
			
			if(currentX < xMin)
				xMin = currentX;
			
			else if(currentX > xMax)
				currentX = xMax;
			
			if(currentY < yMin)
				yMin = currentY;
			
			else if(currentY > yMax)
				yMax = currentY;
			
		}
		
		ArrayList<Double> bounds = new ArrayList<Double>();
		
		//I will add 10% in each direction to give the graph space
		double xAdjust = 0.1 * (xMax - xMin);
		double yAdjust = 0.1 * (yMax - yMin);
		
		bounds.add(xMin - xAdjust);
		bounds.add(xMax + xAdjust);
		bounds.add(yMin - yAdjust);
		bounds.add(yMax + yAdjust);
		
		return bounds;	
	}

}
