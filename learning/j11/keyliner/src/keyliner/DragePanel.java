package keyliner;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragePanel extends JPanel{
	
	ImageIcon icon = new ImageIcon("D:\\programming\\java files\\learning\\j11\\keyliner\\src\\keyliner\\smile.png");
	
	final int width = icon.getIconWidth();
	final int hight = icon.getIconHeight();
	Point imagecorner;
	Point prevpt;
	
	DragePanel(){
		
		imagecorner = new Point(0,0);
		Clicklistner clicklistner = new Clicklistner();
		Dragelistner dragelistner = new Dragelistner();
		this.addMouseListener(clicklistner);
		this.addMouseMotionListener(dragelistner);
		
		
	}
	
	public void printcomponent(Graphics g) {
		super.paintComponent(g);
		icon.paintIcon(this, g, (int)imagecorner.getX(), (int)imagecorner.getY());
	}
	private class Clicklistner extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevpt = e.getPoint();
		}
		
	}
	private class Dragelistner extends MouseMotionAdapter {
		
	}
}
