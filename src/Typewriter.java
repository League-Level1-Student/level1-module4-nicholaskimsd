import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.CORBA.Current;

public class Typewriter implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
public static void main(String[] args) {
	
}




char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}




public void runner() {
	frame.add(label);
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
	char hi = generateRandomLetter();
	label.setText(Character.toString(hi));
	if(e.getSource()==hi) {
		
	}
	
}




@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
