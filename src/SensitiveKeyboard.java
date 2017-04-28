import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener{
public static void main(String[]args){
SensitiveKeyboard sk= new SensitiveKeyboard();	
JFrame frame= new JFrame();
frame.setVisible(true);
frame.addKeyListener(sk);
}

public void keyTyped(KeyEvent e) {
	
}
public void keyPressed(KeyEvent e) {
speak("Ouch!");
}
public void keyReleased(KeyEvent e) {
	
}
private void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
} 
}
