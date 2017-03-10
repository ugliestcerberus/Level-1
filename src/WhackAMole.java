import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel; 
public class WhackAMole {
public static void main(String[]args){
JFrame gameboard= new JFrame();	
JPanel label= new JPanel();
JButton whackamole= new JButton();
JLabel scoreboard= new JLabel();
JLabel lives= new JLabel();
gameboard.setSize(500,500);
gameboard.setVisible(true);
gameboard.add(label);
gameboard.add(whackamole);
gameboard.add(scoreboard);
lives.setText("lives left:");
scoreboard.setText("Your score is:");
}
public void drawButtons(){
WhackAMole.	();
}
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

}
