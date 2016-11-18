import javax.swing.JOptionPane;

public class MathWizard {

	public static void main(String[] args) {
	while(true){
	String question= JOptionPane.showInputDialog("What operation (add,subtract,multiply,divide,exit) would you use?");
	 if(question.equals("exit")){
		System.exit(0);
	}
	String number= JOptionPane.showInputDialog("What's the first number?");
	String result= JOptionPane.showInputDialog("What's the 2nd number?");
	int num1= Integer.parseInt(number);
	int num2= Integer.parseInt(result);
	if(question.equals("add")){
		JOptionPane.showMessageDialog(null, Calculator.add(num1, num2));
	}
	else if(question.equals("subtract")){
		JOptionPane.showMessageDialog(null, Calculator.subtract(num1, num2));
	}
	else if(question.equals("multiply")){
		JOptionPane.showMessageDialog(null, Calculator.multiply(num1, num2));
	}
	else if(question.equals("divide")){
		JOptionPane.showMessageDialog(null, Calculator.divide(num1, num2));
	}
	}
	
	
	}
}
