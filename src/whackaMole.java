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
			if(i == randumb) {
				coolButton.setText("mole");
			}
			panel.add(coolButton);
			
		}
	}

	public void runner() {
		frame.add(panel);
		Random randy = new Random(); 
		int moleLocation = randy.nextInt(30);
	drawButtons(moleLocation);
	button.setText("mole");
		frame.setVisible(true);
		frame.setSize(300, 300);
		
	}

	@Override
	public void actionPerformed(ActionEvent f) {
		JButton pressed = (JButton) f.getSource();
		if(pressed.getText().equals("mole")) {
			frame.dispose();
		}
		else {
			
			}
		}
	
		}
	


