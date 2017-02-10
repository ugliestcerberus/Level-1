	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

	/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

	public class BookOfIllusions extends MouseAdapter {

		/*
		 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
		 * static main method, so that we can add a click listener to each illusion.
		 */
		JFrame jframe= new JFrame();
		JLabel prank = loadImageFromComputer("finger prank.jpg");
		public static void main(String[]args) throws Exception {
			BookOfIllusions illusions = new BookOfIllusions();
			illusions.createBook();
		}
		
		private void createBook() {
		jframe.setVisible(true);
		jframe.setSize(1000,500);
		
		
			// 6. create a variable of type "JLabel" but don’t initialize it yet
			// 7. use the "loadImage..." methods below to initialize your JLabel
			// 8. add your JLabel to the frame
		jframe.add(prank);
			// 9. call the pack() method on the frame
		jframe.pack();
			// 10. add a mouse listener to your frame (hint: use *this*)
		jframe.addMouseListener(this);
		}

		public void mousePressed(MouseEvent e) {
			// 11. Print "clicked!" to the console when the mouse is
			System.out.println("clicked!");
			// 12. remove everything from the frame that was added earlier
			// 13. load a new image like before (this is more than one line of code)
			jframe.remove(prank);
			// 14. pack the frame
			JLabel person= loadImageFromComputer("fat people.jpg");
			jframe.add(person);
			jframe.pack();
		}

		// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

		/*
		 * To use this method, the image must be placed in your Eclipse project under "default package".
		 */
		public JLabel loadImageFromComputer(String fileName) {
			URL imageURL = getClass().getResource(fileName);
			Icon icon = new ImageIcon(imageURL);
			return new JLabel(icon);
		}

	



}
