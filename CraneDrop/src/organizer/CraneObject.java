package organizer;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * 
 * @author Veerendra Gottiveeti
 * Demonstrates what we refer to for all our objects
 * Including Crane, Ball, Target
 *
 */
public abstract class CraneObject {
	
	protected int x, y;
	protected Type type;
	
	/**
	 * speed in the x and y direction
	 */
	protected int speedX, speedY;
	
	/**
	 * Constructor for CraneObject to set the variables within the constructer needed for each object
	 * @param x
	 * @param y
	 * @param type
	 */
	public CraneObject(int x, int y, Type type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public abstract void tick();
	public abstract void render(Graphics graphic);
	public abstract Rectangle getBounds();
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	
	public int getSpeedX() {
		return speedX;
	}
	
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	public int getSpeedY() {
		return speedY;
	}

}
