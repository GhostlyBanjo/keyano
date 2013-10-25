package keyano;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		// Create GUI
		JTextField textField = new JTextField();
		textField.addKeyListener(new KeyanoListener()); // Use our listener
		JFrame jframe = new JFrame();
		jframe.add(textField);
		jframe.setSize(400, 350);
		jframe.setVisible(true);
	}
}
