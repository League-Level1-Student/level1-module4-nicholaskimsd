import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CORBA.Current;

public class Typewriter implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	char currentLetter;

	public void runner() {
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		char hi = generateRandomLetter();
		label.setText(Character.toString(hi));
		frame.addKeyListener(this);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == label.getText().charAt(0)) {
			System.out.println("");
			panel.setBackground(Color.GREEN);
		}

		else {
			panel.setBackground(Color.RED);
		}

		char hi = generateRandomLetter();
		label.setText(Character.toString(hi));

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
