import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JTextField textfield = new JTextField();
	JTextField textfield2 = new JTextField();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton division = new JButton();

	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(division);
		textfield.setPreferredSize(new Dimension(100, 20));
		textfield2.setPreferredSize(new Dimension(100, 20));
		add.setText("+");
		subtract.setText("-");
		multiply.setText("*");
		division.setText("/");
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		division.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {

	}

	

	public void add(int num, int num2) {

		JOptionPane.showMessageDialog(null, num + num2);

	}

	public void subtract(int num, int num2) {

		JOptionPane.showMessageDialog(null, num - num2);

	}

	public void multiply(int num, int num2) {

		JOptionPane.showMessageDialog(null, num * num2);

	}

	public void divide
	(int num, int num2) {

		JOptionPane.showMessageDialog(null, num / num2);
	}
	public void actionPerformed(ActionEvent e) {
		String text1 = textfield.getText();
		int number1 = Integer.parseInt(text1);
		String text2 = textfield2.getText();
		int number2 = Integer.parseInt(text2);
		JButton buttonpressed = (JButton) e.getSource();
		
		if (buttonpressed == add){
			add(number1, number2);
		}
		if (buttonpressed==subtract) {
			subtract(number1, number2);
		}
		if (buttonpressed==multiply) {
			multiply(number1, number2);
		}
		if (buttonpressed==division) {
			divide(number1, number2);
		}
	}
}
