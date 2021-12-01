package organizer;

import java.awt.Color;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ball extends CraneObject {
	
	public int number;
			
	public Ball(int x, int y, Type type) {
		
		super(x, y, type);
		
		String delayedTime;
		
		delayedTime = JOptionPane.showInputDialog("Please input your ejection time to hit the target in seconds.");
		
		if (delayedTime == null) {
			System.exit(0);
			throw new IllegalArgumentException("Please input a valid delayedTime");
		}
		
		try {
			int timing = Integer.parseInt(delayedTime);
			try {
				Thread.sleep(timing * 1000);
				speedY = Window.number; 
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		catch (NumberFormatException e) {
			System.exit(0);
			throw new IllegalArgumentException("Please input a number in seconds");
		}
													 
	}
		
	public int randomInteger() {
		
		Random rand = new Random();
		
		number = rand.nextInt(4) + 1;
		
		return number;

	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 20);
	}
	
	public void tick() {
		x += speedX;
		y += speedY;
		
		if (y <= 0 || y >= Crane.HEIGHT - 30) {
			JOptionPane.showMessageDialog(null, "You missed the target. Don't give up!", null, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	
	}
	
	public void render(Graphics graphic) {

		graphic.setColor(Color.red);
		graphic.fillRect(x, y, 20, 30);
		
	}
}
