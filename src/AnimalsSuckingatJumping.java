import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class AnimalsSuckingatJumping {
static JFrame jframe= new JFrame();
 public static void main(String[] args) throws MalformedURLException {

	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

		 	String urlOfAnimalsSuckingatJumping = "http://68.media.tumblr.com/8d95d7e99cd36bc0ac0527015bf46cd3/tumblr_n3qw9kgGSz1syxxpeo7_400.gif";
		 	jframe.setTitle("Cats Fail");
		 	jframe.add(createImage(urlOfAnimalsSuckingatJumping));
		 	jframe.setVisible(true);
		 	jframe.setLocationRelativeTo(jframe);
		 	jframe.setSize(500, 500);
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}

