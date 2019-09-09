import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield = new JTextField();
	JButton button = new JButton();
	JTextField textfield1 = new JTextField();

	public void runner() {
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		panel.add(textfield1);
		textfield.setPreferredSize(new Dimension(200, 20));
		textfield1.setPreferredSize(new Dimension(200, 20));
		button.addActionListener(this);
		button.setText("translate");
		frame.setVisible(true);
		frame.pack();

	}

	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if (button == pressed) {
			
			
			String field = textfield.getText();
			String hi = PigLatinTranslator.pigWord(field);
			textfield1.setText(hi);
		}
	}
}

class PigLatinTranslator {

	/**
	 * Method to test whether a character is a letter or not.
	 * 
	 * @param c The character to test
	 * @return True if it's a letter
	 */
	private static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	/**
	 * Method to translate one word into pig latin.
	 * 
	 * @param word The word in english
	 * @return The pig latin version
	 */
	static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split) + "-" + word.substring(0, split) + "ay";
	}

	/**
	 * Method to translate a sentence word by word.
	 * 
	 * @param s The sentence in English
	 * @return The pig latin version
	 */
	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {

			// Take care of punctuation and spaces
			while (i < s.length() && !isLetter(s.charAt(i))) {
				latin = latin + s.charAt(i);
				i++;
			}

			// If there aren't any words left, stop.
			if (i >= s.length())
				break;

			// Otherwise we're at the beginning of a word.
			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
				i++;
			}
			// Now we're at the end of a word, so translate it.
			int end = i;
			latin = latin + pigWord(s.substring(begin, end));
		}
		return latin;
	}

	/**
	 * Method to find the index of the first vowel in a word.
	 * 
	 * @param word The word to search
	 * @return The index of the first vowel
	 */
	static int firstVowel(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				return i;
		return 0;
	}
}
