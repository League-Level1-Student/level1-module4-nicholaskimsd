import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class suprise implements ActionListener {
	public static void main(String[] args) {
		suprise fc = new suprise();
		fc.showButton();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton leftButton = new JButton();

	private void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("Treat");
		button.addActionListener(this);
		panel.add(leftButton);
		leftButton.setText("Trick");
		leftButton.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (button == pressed) {
			String joe = "http://www.angelfire.com/ca5/houseofstupid/koala3.jpg";
			showPictureFromTheInternet(joe);
		} else if (leftButton == pressed) {
			String hi = "https://www.thewrap.com/wp-content/uploads/2016/04/SpongeBob-Squarepants.jpg";
			showPictureFromTheInternet(hi);

		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
