import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
public class GetLatestTweet implements ActionListener{
	static JFrame jframe = new JFrame();
	static JButton jbutton = new JButton();
	static JPanel jpanel= new JPanel();
	static JTextField jtextfield= new JTextField(20);
	public static void main(String[] args) {
		GetLatestTweet nep = new GetLatestTweet();
		getLatestTweet("jfgh");
	}
	GetLatestTweet() {
		jframe.setVisible(true);
		jframe.setSize(1000, 1000);
		jpanel.add(jbutton);
		jframe.add(jpanel);
		jpanel.add(jtextfield);
		jbutton.setText("Search the Twitterverse");
		jbutton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	String latestTweet= getLatestTweet(jtextfield.getText());	
	if(jbutton==e.getSource()) {
	System.out.println(latestTweet);
	}
	}
	private static String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}
}