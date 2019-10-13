import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
	JButton button = new JButton();
	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		button.setText("Spin");
		frame.setVisible(true);
		frame.pack();
		

	}
}
