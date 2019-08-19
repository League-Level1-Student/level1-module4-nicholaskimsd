package _09_latest_tweet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latestTweets {
	JTextField textfield = new JTextField();
	JButton button = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public void runner() {
		frame.add(panel);
		panel.add(label);
		frame.add(textfield);
		frame.add(button);
		
	}
}
