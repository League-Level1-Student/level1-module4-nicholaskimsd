import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {

	
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JTextField field = new JTextField();
		JTextField joe = new JTextField();
		JButton rightbutton = new JButton();
		JButton leftbutton = new JButton();
		JButton coolbutton = new JButton();
		
		 
		public void runner() {
			frame.add(panel);
			panel.add(label);
			panel.add(field);
			panel.add(joe);
			 panel.add(button);
			 panel.add(coolbutton);
			 panel.add(leftbutton);
			 panel.add(rightbutton);
			field.setPreferredSize(new Dimension(100,20));
			joe.setPreferredSize(new Dimension(100,20));
			 button.setText("+");
			 coolbutton.setText("-");
			 leftbutton.setText("*");
			 rightbutton.setText("/");
			 frame.setVisible(true);
			 frame.pack();
		 
	}
		
		
		void addition() {
			
		}
		void subtract(){
			
		}
		void multiplication(){
			
		}
		void division() {
			
		}

}
