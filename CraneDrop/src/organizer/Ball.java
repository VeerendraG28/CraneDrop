package organizer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends CraneObject {
		
	public Ball(int x, int y, Type type) {
		
		super(x, y, type);
		
		if (Window.value == true) {
			speedY = randomInteger();
		}
		else {
			speedY = 0;
		}
	}
	
	public int randomInteger() {
		
		Random rand = new Random();
		
		int number = rand.nextInt(4) + 1;
		
		return number;
	}
	
	@Override
	public void tick() {
		x += speedX;
		y += speedY;

	}
	

	@Override
	public void render(Graphics graphic) {
		graphic.setColor(Color.red);
		graphic.fillOval(x, y, 20, 20);
		
	}
}
