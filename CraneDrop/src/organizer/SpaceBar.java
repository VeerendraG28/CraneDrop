package organizer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SpaceBar extends KeyAdapter {
	
	private Controller controller;
	
	public void barPressed(KeyEvent e) {
		int bar = e.getKeyCode();
	}
	
	public void barReleased(KeyEvent e) {
		int bar = e.getKeyCode();
	}
	
}
