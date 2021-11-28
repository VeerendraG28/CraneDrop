package organizer;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ball extends CraneObject {
		
	public Ball(int x, int y, Type type) {
		
		super(x, y, type);
		
		speedY = randomInteger();
	}
	
	public int randomInteger() {
		
		Random rand = new Random();
		
		int number = rand.nextInt(4) + 1;
		
		return number;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 20);
	}
	
	@Override
	public void tick() {
		x += speedX;
		y += speedY;
		
		if (y <= 0 || y >= Crane.HEIGHT - 53) {
			JOptionPane.showMessageDialog(null, "You missed the target", null, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	
	}
	
	@Override
	public void render(Graphics graphic) {

		graphic.setColor(Color.red);
		graphic.fillRect(x, y, 20, 30);
		
	}
}
