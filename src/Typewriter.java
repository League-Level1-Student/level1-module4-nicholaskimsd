import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.Current;

public class Typewriter implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	char currentLetter;
	 currentLetter=label.getText().charAt(0);
	public void runner() {
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		char letter = generateRandomLetter();
		label.setText(Character.toString(letter));
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
			System.out.println("You pressed the letter "+currentLetter+ ". You got it right");
			panel.setBackground(Color.GREEN);
		}

		else {
			panel.setBackground(Color.RED);
			System.out.println("You pressed the letter "+currentLetter+".  You got it wrong" );
		}

		char hi = generateRandomLetter();
		label.setText(Character.toString(hi));

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 

}
