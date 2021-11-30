package organizer;

import java.awt.Color;


import java.awt.Graphics;
import java.awt.Rectangle;

public class BallImaginary extends CraneObject {
	
	public BallImaginary(int x, int y, Type type) {
		
		super(x, y, type);
		
	}

	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 20);
	}
	
	public void tick() {
		
		x += speedX;
		y += speedY;
		
	}
	
	public void render(Graphics graphic) {

		graphic.setColor(Color.red);
		graphic.fillRect(x, y, 20, 30);
		
	}
}
