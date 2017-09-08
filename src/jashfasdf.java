import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class jashfasdf implements ActionListener{
static JFrame hasg= new JFrame();
static JPanel jash= new JPanel();
static JButton jasdjg= new JButton();
static JButton jasdfsdf= new JButton();
static JButton jasf= new JButton();
int sum;
int num1;
int num2;
public static void main(String[] args) {
jashfasdf has= new jashfasdf();
}
jashfasdf(){
hasg.setVisible(true);
hasg.setSize(1000,1000);
hasg.add(jash);
jash.add(jasdjg);
jash.add(jasdfsdf);
jash.add(jasf);
jasdjg.setText("Random");
jasdfsdf.setText("Greeting");
jasf.setText("Math");
jasf.addActionListener(this);
jasdfsdf.addActionListener(this);
jasdjg.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==jasdjg) {
int number= new Random().nextInt(1000);
JOptionPane.showMessageDialog(null, "Here's a random number " + number);
}
else if(e.getSource()==jasdfsdf) {
JOptionPane.showMessageDialog(null, "Please enter a name");
String name= JOptionPane.showInputDialog(null, "");
JOptionPane.showMessageDialog(null, "Hello " + name);
}
else if(e.getSource()==jasf) {
String jah= JOptionPane.showInputDialog(null,"Please enter a number");
int x= Integer.parseInt(jah);
String number= JOptionPane.showInputDialog(null,"Please enter a number");
int as= Integer.parseInt(number);
sum=x+as;
JOptionPane.showMessageDialog(null,  x + "+" + as +"="+sum);
}
}
}