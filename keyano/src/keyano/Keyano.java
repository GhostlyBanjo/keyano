package keyano;

import org.jfugue.Pattern;
import org.jfugue.Player;

public class Keyano {

	public static void playNote(char Note) {
		switch (Note) {
		case 'B':
			new Player().play(new Pattern("B"));
			break;
		}
	}
}
