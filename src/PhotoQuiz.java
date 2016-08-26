 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String Candy= "http://img03.deviantart.net/b4ea/i/2015/199/d/7/five_nights_at_candy_s__official__candy__by_thesitcixd-d91vl1c.png";
		// 2. create a variable of type "Component" that will hold your image
Component Cat= createImage(Candy);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(Cat);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String Enemy= JOptionPane.showInputDialog("which fnac enemy is shown in the picture? A.Chester B.Cindy C.The rat D. Candy");
		// 7. print "CORRECT" if the user gave the right answer
if(Enemy.equals("D")){
	System.out.println("You are correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else{
	System.out.println("You are wrong, try again!");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(Cat);
		// 10. find another image and create it (might take more than one line of code)
//String War= "http://georgiainfo.galileo.usg.edu/gastudiesimages/Revolutionary%20War%20Battle%203.jpg";
		// 11. add the second image to the quiz window
//quizWindow.add(War);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String past= JOptionPane.showInputDialog("which type of war is shown in the picture above? A. Civil War B. The Revolutionary War C. The Vietnam War.");
		// 14+ check answer, say if correct or incorrect, etc.

	}


	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}


