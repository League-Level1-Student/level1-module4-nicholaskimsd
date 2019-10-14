import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
	JButton button = new JButton();
	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Spin");
		frame.setVisible(true);
		frame.pack();
		

	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.removeAll();
		panel.add(button);
		Random randy = new Random();
		int reel1 = randy.nextInt(3);
		int reel2 = randy.nextInt(3);
		int reel3 = randy.nextInt(3);
		try {
			
			
		if(reel1==0) {
			
				panel.add(createLabelImage("cherries.jpg"));
			
		}
		if(reel1==1) {
			panel.add(createLabelImage("orange.jpg"));
		}
		if(reel1==2) {
			panel.add(createLabelImage("seven-706891_960_720.jpg"));
		}
		if(reel2==0) {
			panel.add(createLabelImage("cherries.jpg"));
		}

		if(reel2==1) {
			panel.add(createLabelImage("orange.jpg"));
		}
		if(reel2==2) {
			panel.add(createLabelImage("seven-706891_960_720.jpg"));
		}
		
		
		if(reel3==0) {
			panel.add(createLabelImage("cherries.jpg"));
		}
		if(reel3==1) {
			panel.add(createLabelImage("orange.jpg"));
		}
		if(reel3==2) {
			panel.add(createLabelImage("seven-706891_960_720.jpg"));
		}
		
		
		
		frame.pack();
		
		
		
		
		
		
		
		
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(reel1==reel2&&reel2==reel3) {
			JOptionPane.showMessageDialog(null, "You Won Rufio");
		}
	}
}


