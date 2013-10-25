package keyano;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
