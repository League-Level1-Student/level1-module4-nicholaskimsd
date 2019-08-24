import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield = new JTextField();
	JButton button = new JButton();
	JTextField textfield1 = new JTextField();

	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		panel.add(textfield1);
		textfield.setPreferredSize(new Dimension(200, 20));
		textfield1.setPreferredSize(new Dimension(200, 20));
		button.addActionListener(this);
		button.setText("translate");
		frame.setVisible(true);
		frame.pack();

	}

	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if (button == pressed) {

			String field = textfield.getText();

		}
	}

}
