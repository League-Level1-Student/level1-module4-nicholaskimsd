import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton leftButton = new JButton();
void makeButton() {
	System.out.println("Button clicked");
    frame.setVisible(true);
    frame.add(panel);
	panel.add(button);
	button.setText("Joke");
	button.addActionListener(this);
	panel.add(leftButton);
	leftButton.setText("Punch Line");
	leftButton.addActionListener(this);
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	if(button==pressed) {
		System.out.println("hi");
		JOptionPane.showMessageDialog(null, "Today at the bank, an old lady asked me to help check her balance. "
				+ "So I pushed her over.");
	}
	if(leftButton==pressed) {
		System.out.println("hi");
		JOptionPane.showMessageDialog(null, "Why do Dasher and Dancer love coffee? "
				+ "Because they’re Santa’s star bucks!");
				 
	}
	
}


}
