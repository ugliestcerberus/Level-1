
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
public static void main(String[]args){
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	}
	void showButton(){
		JFrame lewisClark= new JFrame();
		lewisClark.setVisible(true);
		JButton butt= new JButton();
		lewisClark.add(butt);
		butt.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Yeiss");
		int rand= new Random().nextInt(5);
		if(rand==0){
		System.out.println("Try again");
		}
		else if(rand==1){
			System.out.println("Good");
			}
		else if(rand==2){
			System.out.println("Better");
			}
		else if(rand==3){
			System.out.println("Getting Money");
			}
		else if(rand==4){
			System.out.println("Millionare");
			}
	}

}
