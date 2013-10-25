package keyano;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.jfugue.*;

public class Test implements KeyListener {

	private static Player player;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		player = new Player();
		
		//Works!
		player.play(new Pattern("C D E F G A B"));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//Doesn't work :(
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:
			player.play(new Pattern("B"));
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
