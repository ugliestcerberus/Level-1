import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class JukeBox implements Runnable, MouseListener {
Song matthewWilber= new Song();
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new JukeBox());
	}

           public void run() {

		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song
        	  Song matthewWilder = new Song("matthewWilder"); 
        	  Song letItBurn= new Song("letItBurn.mp3");
        	  Song stereoHearts= new Song("stereoHearts.mp3");
        	  JFrame jukebox= new JFrame();
        	  JPanel jpanel= new JPanel();
        	  JLabel jlabel= new JLabel();
        	  JLabel artist1= new JLabel();
        	  JLabel artist2= new JLabel();
        	  JLabel artist3= new JLabel();
        	  JButton song1= new JButton();
        	  song1.setText("matthewWilder");
        	  song1.setName("matthewWilder");
        	  JButton song2= new JButton();
        	  song2.setText("letItBurn");
        	  song2.setName("letItBurn");
        	  JButton song3= new JButton();
        	  song3.setText("stereoHearts");
        	  song3.setName("stereoHearts");
        	  jpanel.add(song1);
        	  jpanel.add(song2);
        	  jpanel.add(song3);
        	  jukebox.setVisible(true);
        	  jukebox.pack();
        	  song1.setVisible(true);
        	  song2.setVisible(true);
        	  song3.setVisible(true);
        	  jukebox.add(jpanel);
        	  song1.addMouseListener(this);
        	  song2.addMouseListener(this);
        	  song3.addMouseListener(this);
		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 * 
		 */
          }
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	String name= e.getComponent().getName()+".mp3";
	matthewWilber.stop();
	matthewWilber= new Song(name);
	matthewWilber.play();
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

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
    public Song(){
    	
    }
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}
