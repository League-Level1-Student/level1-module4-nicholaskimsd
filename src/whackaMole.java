import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class whackaMole {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield = new JTextField();
	JButton button = new JButton();
	JTextField textfield1 = new JTextField();

	void drawButtons(int randumb) {

		for (int i = 0; i < 30; i++) {
			if(i == randumb) {
				JButton coolButton = new JButton("mole!");
			}
			else {
				JButton hi = new JButton();
				
			}
				

		}
	}

	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(textfield1);
		panel.add(button);

	}

}
