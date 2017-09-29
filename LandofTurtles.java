import java.awt.Window;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandofTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame f= new JFrame();
f.setVisible(true);
		// 2. Add the panel to the frame
f.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
f.pack();

		// 4. Instantiate a Turtle 

// 5. Add the turtle to the panel 

// 6. Put 50 Turtles on the beach
	for (int i = 0; i < 51; i++) {
	Turtle jas= new Turtle();
	jas.penUp();
	panel.addTurtle(jas);
	jas.moveTo(new Random().nextInt(1000),new Random().nextInt(1000));
}
	}
}
