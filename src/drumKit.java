// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drumKit extends MouseAdapter {

    JLabel drumLabelWithImage;

    public static void main(String[] args) throws Exception {
   	 new drumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 JFrame man= new JFrame();
   	 man.setVisible(true);
   	 man.setSize(100,100);
   	 man.setTitle("Law enforcement");
   	 JPanel majk= new JPanel();
     man.add(majk);
     String drum= "drum.jpg";
     drumLabelWithImage = createLabelImage(drum);
    majk.add(drumLabelWithImage);
    new GridLayout();
   	 pack();
   	 drumLabelWithImage.addMouseListener(this);
    }
    private void pack() {
		// TODO Auto-generated method stub	
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseClicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 if(drumClicked==drumLabelWithImage){
   		 playSound("drumsound.wav");
   	 }

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}
