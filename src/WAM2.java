import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WAM2 {
	int button = 12;
    JFrame gameboard = new JFrame();
	JPanel screen = new JPanel();
	JButton moleButton;
	public static void main(String[] args) {
		WAM2 game = new WAM2();
		game.gameboard.add(game.screen);
		int random= new Random().nextInt(game.button);
		game.gameboard.setSize(750,650);
		game.drawButtons(random);
		game.gameboard.setVisible(true);
	}

	public void drawButtons(int mole) {
		for (int i = 0; i < this.button; i++) {
			JButton hyt = new JButton();
			screen.add(hyt);
			if(i==mole){
				moleButton=hyt;
				moleButton.setText("mole");
			}
		}
	}
}
