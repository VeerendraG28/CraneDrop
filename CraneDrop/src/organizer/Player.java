package organizer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Player extends CraneObject {
	
	Controller controller;
	Ball ball;
	
	public Player(int x, int y, Type type, Controller controller, Ball ball) {
		super(x, y, type);
		this.controller = controller;
		this.ball = ball;
		speedX = 2;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 40, 12);
	}

	@Override
	public void tick() {
		x += speedX;
		y += speedY;
		
		if (x <= 0 || x >= Crane.WIDTH - 53) {
			speedX *= -1;
		}
		
		collision();
	}

	private void collision() {
		for (int i = 0; i < controller.object.size(); i++) {
			CraneObject temporary = controller.object.get(i);
			
			if (temporary.getType() == Type.Ball) {
				if (getBounds().intersects(temporary.getBounds())) {
					JOptionPane.showMessageDialog(null, "You hit the target. Nice!", null, JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			}
		}
		
	}

	@Override
	public void render(Graphics graphic) {
		graphic.setColor(Color.white);
		graphic.fillRect(x, y, 40, 12);
		
	}

}
