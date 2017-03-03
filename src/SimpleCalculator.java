import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	static JButton add = new JButton();
	static JButton sub = new JButton();
	static JButton multi = new JButton();
	static JButton divi = new JButton();
	static JTextField number1 = new JTextField("number 1");
	static JTextField number2 = new JTextField("number 2");
	static JLabel answer = new JLabel();

	public static void main(String[] args) {
		SimpleCalculator real = new SimpleCalculator();
		real.createUI();
	}

	

	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(number1.getText());
		int num2 = Integer.parseInt(number2.getText());
		String ans;
		if (e.getSource() == add) {
			ans = Integer.toString(addition(num1, num2));
			answer.setText(ans);
		} else if (e.getSource() == sub) {
			ans = Integer.toString(subtraction(num1, num2));
			answer.setText(ans);
		} else if (e.getSource() == multi) {
			ans = Integer.toString(multiplication(num1, num2));
			answer.setText(ans);
		} else if (e.getSource() == divi) {
			ans = Integer.toString(division(num1, num2));
			answer.setText(ans);
		}
	}

	public int subtraction(int num1, int num2) {
		return (num1 - num2);
	}

	public int addition(int num1, int num2) {
		return (num1 + num2);
	}

	public int division(int num1, int num2) {
		if (num2 == 0) {
			answer.setText("can't be solved");
			return (0);
		} else {
			return (num1 / num2);
		}
	}

	public int multiplication(int num1, int num2) {
		return (num1 * num2);
	}
}

