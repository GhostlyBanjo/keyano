package keyano;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Listens for key presses and translates them into Keyano calls.
 * See Keyano.java for handling. No library-specific code here.
 */
public class KeyanoListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
		case KeyEvent.VK_A:
			Keyano.playNote('B');
			break;
		}
	}
}
