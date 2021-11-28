package organizer;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends CraneObject {
	
	public Player(int x, int y, Type type) {
		super(x, y, type);
	
		speedX = 2;
		
	}

	@Override
	public void tick() {
		x += speedX;
		y += speedY;
		
		if (x <= 0 || x >= Crane.WIDTH - 53) {
			speedX *= -1;
		}
	}

	@Override
	public void render(Graphics graphic) {
		graphic.setColor(Color.white);
		graphic.fillRect(x, y, 40, 12);
		
	}

}
