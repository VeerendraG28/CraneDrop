package organizer;

import java.awt.Color;
import java.awt.Graphics;

public class CraneStructure extends CraneObject {
	public CraneStructure(int x, int y, Type type) {
		super(x, y, type);
	
		//speedX = 2;
		
	}

	@Override
	public void tick() {
		x += speedX;
		y += speedY;
		
	}

	@Override
	public void render(Graphics graphic) {
		graphic.setColor(Color.white);
		graphic.fillRect(x, y, 4, 33);
		
	}
}
