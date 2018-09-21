import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GettingLatestTweet implements ActionListener {
	JFrame frame;
	JButton button;
	JPanel panel;
	JTextField text;
	JTextPane pane;
	public static void main(String[] args) {
	GettingLatestTweet t = new GettingLatestTweet();
	t.gettingLatestTweet();
	}
public void gettingLatestTweet() {
	frame = new JFrame();
	frame.setLayout(new BorderLayout());
	frame.setSize(1000, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button = new JButton();
	button.addActionListener(this);
	panel = new JPanel();
	text = new JTextField(15);
	pane = new JTextPane();
	pane.setPreferredSize(new Dimension(800, 200));
	pane.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	pane.setBackground(Color.BLACK);
	pane.setForeground(Color.CYAN);
	pane.setEditable(false);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(text);
	panel.add(button);

	panel.add(pane);
	button.setText("Search Twitter");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("tweet tweet");
	pane.setText(getLatestTweet(text.getText()));
}
private String getLatestTweet(String searchingFor) {

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
