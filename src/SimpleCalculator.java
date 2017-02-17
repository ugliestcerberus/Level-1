import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	static JButton add = new JButton();
	static JButton sub = new JButton();
	static JButton multi = new JButton();
	static JButton divi = new JButton();
	static JTextField number1 = new JTextField("number 1");
	static JTextField number2 = new JTextField("number 2");

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame calculator = new JFrame();
		calculator.setVisible(true);
		calculator.add(panel);
		add.addActionListener(null);
		sub.addActionListener(null);
		multi.addActionListener(null);
		divi.addActionListener(null);
		panel.add(add);
		panel.add(sub);
		panel.add(multi);
		panel.add(divi);
		add.setText("addition");
		sub.setText("subtraction");
		multi.setText("multiplication");
		divi.setText("division");
		calculator.setTitle("Simple calculator");
		add.addActionListener(null);
		sub.addActionListener(null);
		multi.addActionListener(null);
		divi.addActionListener(null);
		panel.add(number1);
		panel.add(number2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			System.out.println("add two numbers");
		}
	}
}
