import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class will be responsible for making a basic GUI that displays trends from the dataset
 * @author Sergii
 * @author Venky
 *
 */
public class GUI extends JFrame {

	public GUI() {

		initUI();
	}

	/**
	 * This method will accept user input from a drop down menu
	 * This method will also help create the frame
	 */
	private void initUI() {

		setTitle("WHO Mortality Trends");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("CLICK ME");
		b1.setBounds(50, 50, 50, 50);
		this.add(b1);

	}
	
	/**
	 * This method will be the main method for the entire project
	 * This method will create the GUI and begin file reading
	 * @param args
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			GUI ex = new GUI();
			ex.setVisible(true);
		});

	}
	
	/**
	 * This method will plot the graph on screen
	 * @param g this variable will contain the information to be plotted
	 */
	private void generateGraph(Graph g) {
		
	}
	
}
