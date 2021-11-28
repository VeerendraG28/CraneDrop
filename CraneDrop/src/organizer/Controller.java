package organizer;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 * 
 * @author Veerendra
 * Update and render all the objects with the project
 *
 */
public class Controller {
	LinkedList<CraneObject> object = new LinkedList<CraneObject>(); //creates a new LinkedList
	
	public void tick() {
		for (int i = 0; i < object.size(); i++) { //iterates through all the objects in the project
			CraneObject temporary = object.get(i); //lets us know what object we're currently at
			
			temporary.tick();
		}
	}
	
	public void render(Graphics graphic) {
		for (int i = 0; i < object.size(); i++) {
			CraneObject temporary = object.get(i);
			
			temporary.render(graphic);
		}
	}
	
	public void addObject(CraneObject object) {
		this.object.add(object);
	}
	
	public void removeObject(CraneObject object) {
		this.object.remove(object);
	}
}
