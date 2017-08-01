import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CutenessTV implements ActionListener{
	static JFrame frame = new JFrame();
	static JPanel panel= new JPanel();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();

	public static void main(String[] args) {
		new CutenessTV();
	}
	
	CutenessTV(){
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setText("Button 1");
		button2.setText("Button 2");
		button3.setText("Button 3");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}

	// Make a user interface with 3 buttons that will play different videos
	// depending on which button is clicked. Use the methods below to play the
	// cutest videos ever.
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println();
		
	}
}