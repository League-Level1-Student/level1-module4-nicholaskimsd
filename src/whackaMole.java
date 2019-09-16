import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class whackaMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	JButton button = new JButton();
	

	void drawButtons(int randumb) {

		for (int i = 0; i < 30; i++) {
			JButton coolButton = new JButton();
			coolButton.addActionListener(this);
			panel.add(coolButton);

		}
	}

	public void runner() {
		frame.add(panel);
		Random randy = new Random(); 
		int moleLocation = randy.nextInt(30);
	drawButtons(moleLocation);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
