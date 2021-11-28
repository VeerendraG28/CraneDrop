package organizer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends Canvas {
		
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 3282742541605325000L;
	
	static JButton button2;
	
	static boolean value = false;
	
	private static Random random = new Random();

	public Window(int width, int height, String title, Crane crane) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button = new JButton("Instructions");
		button.setSize(100,30);
		button.setBackground(Color.magenta);
		button.setVisible(true);
		frame.add(button);
		button.addActionListener(new Action());
				
		button2 = new JButton("" + randomInteger());
		button2.setSize(100,30);
		button2.setBackground(Color.white);
		button2.setVisible(true);
		button2.setBounds(580, 0, 50, 45);
		frame.add(button2);
		button2.addActionListener(new ActionTwo());
		System.out.println(Window.value);
				
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(crane);
		frame.setVisible(true);
		crane.start();	
	
	}
	
	public static class Action implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			JFrame frame2 = new JFrame("Clicked");
			frame2.setVisible(true);
			frame2.setSize(900,85);
			JLabel label = new JLabel("Welcome to CraneDrop!");
			JLabel label2 = new JLabel("There on the top right of your screen, you will see a white button which serves to eject the ball from the craned structure.");
			JLabel label3 = new JLabel("Your goal is to time the ball to hit the sliding target with the given speed which can range from 1-5. Good Luck!");
			JPanel panel = new JPanel();
			frame2.add(panel);
			panel.add(label);
			panel.add(label2);
			panel.add(label3);
		}
	}
	
	public static class ActionTwo implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == button2) {
			    Window.value = true;
			}
		}
	}
	
	
	public static int randomInteger() {
	
		return random.nextInt(4) + 1;
	}

}
