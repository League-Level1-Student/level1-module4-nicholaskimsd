import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class whackaMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
    Date timeAtStart = new Date();
	int i = 0;

	

	void drawButtons(int randumb) {
		
		frame = new JFrame();
		panel = new JPanel();
		
		System.out.println(randumb);
		for (int i = 0; i < 30; i++) {
			JButton coolButton = new JButton();
			coolButton.addActionListener(this);
			if(i == randumb) {
				coolButton.setText("mole");
			}
			panel.add(coolButton);
			
		}	
				frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(500, 500);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if(pressed.getText().equals("mole")) {
			playSound("Applause.wav");
			
			frame.dispose();
			
			Random Rando = new Random(); 
			int moleLocation = Rando.nextInt(30);
			
			drawButtons(moleLocation);		
			
			frame.setVisible(true);
			frame.setSize(500, 500);
			i += 1;
			
			
		}
		else {
			speak("words");
			}
		if(i==10) {
			endGame(timeAtStart, 10);
		}
		}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

	
		}
	


