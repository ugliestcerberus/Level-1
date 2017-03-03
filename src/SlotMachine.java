import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.Random;
public class SlotMachine implements MouseListener{
	static JFrame slots = new JFrame();
	static JPanel spaces = new JPanel();
	static JLabel result = new JLabel("I lost");
	static JButton spin = new JButton();
	static JTextField outcome= new JTextField();

	public static void main(String[] args) {
		SlotMachine machine = new SlotMachine();
		slots.setVisible(true);
		slots.setSize(500, 500);
		slots.add(spaces);
		spin.setText("Spin!");
		spaces.add(spin);
		spaces.add(result);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	int num1= 0;
	int num2= 0;
	int num3= 0;
	Random rand = new Random();
	
	num1= rand.nextInt(3);
	num2= rand.nextInt(3);
	num3= rand.nextInt(3);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
