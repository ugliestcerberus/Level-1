import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
public static void main(String[]args){
	ChuckleClicker Matthew= new ChuckleClicker();
	Matthew.makeButtons();
}
JButton Boom= new JButton();
JButton Man= new JButton();
void makeButtons(){
JFrame name= new JFrame();
name.setVisible(true);
JPanel Environment= new JPanel();
name.add(Environment);
Environment.setVisible(true);

Environment.add(Boom);

Environment.add(Man);
Man.addActionListener(this);
Boom.addActionListener(this);
Man.setName("joke");
Boom.setName("punchline");
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==Man){
JOptionPane.showMessageDialog(null, "Joke");

}else if(e.getSource()==Boom){
JOptionPane.showMessageDialog(null,"PunchLine");
	}
}
	
}

