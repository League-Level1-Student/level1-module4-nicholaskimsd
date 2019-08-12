package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	

		
		int randy = new Random().nextInt(4);
	
		System.out.println(randy);


if(randy==0) {
	JOptionPane.showMessageDialog(null, "ask a yes or no question");
	String hi = JOptionPane.showInputDialog("Ask The Magic 8 ball something or i'll find you.");
	JOptionPane.showMessageDialog(null, "Yes");
}

	if (randy == 1) {
		JOptionPane.showMessageDialog(null, "ask a yes or no question");
		String hi = JOptionPane.showInputDialog("Ask The Magic 8 ball something or i'll find you.");
		JOptionPane.showMessageDialog(null, "no");
	}

	if(randy == 2) {
		String hi = JOptionPane.showInputDialog("Ask The Magic 8 ball something or i'll find you.");
		JOptionPane.showMessageDialog(null, "Maybe you should google that??????");
	}

	if(randy == 3) {
		String hi = JOptionPane.showInputDialog("Ask The Magic 8 ball something or i'll find you.");
		JOptionPane.showMessageDialog(null, "Bob the Bilder is always the anser");
	}



}
}