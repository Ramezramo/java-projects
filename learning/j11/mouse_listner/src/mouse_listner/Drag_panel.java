package mouse_listner;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Drag_panel extends JPanel {
	ImageIcon icon = new ImageIcon("D:\\programming\\java files\\learning\\j11\\mouse_listner\\smile.png");
	
	int width = icon.getIconWidth();
	int hight = icon.getIconHeight();
	
	Point imagecorner;
	Point prevpt;
	
	Drag_panel(){
		imagecorner = new Point(0,0);
		
		Clicklistner clicklistner = new Clicklistner();
		Draglistner draglistner = new Draglistner();
		this.addMouseListener(clicklistner);
		this.addMouseMotionListener(draglistner);
		
		
		
	}
	public void paintcomponent (Graphics g) {
		super.paintComponent(g);
		icon.paintIcon(this, g, (int)imagecorner.getX(), (int)imagecorner.getY());
		
	}

	private class Clicklistner extends MouseAdapter{
		public void mousepressed(MouseEvent e) {
			prevpt = e.getPoint();
			
		}
	}
	private class Draglistner extends MouseMotionAdapter{
	
	}
}
