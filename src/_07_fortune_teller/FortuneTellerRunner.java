package _07_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
      	 SwingUtilities.invokeLater(new FortuneTeller());
      	 begin();
       }
    
    static void begin() {
    	JOptionPane.showMessageDialog(null, "Hello There, welcome to the creepy fortune teller she will tell you your fortune "
      			+ "its cool, just continue on and listen to her, or you die.  By the way crystal balls are nice for secret locations.  BYEE");
      	

    }
}
