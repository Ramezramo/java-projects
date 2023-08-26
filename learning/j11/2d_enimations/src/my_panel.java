import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class my_panel extends JPanel implements ActionListener{
	
	final int p_width =500;
	final int p_hight =700;
	
	Image enemy;
	Image backg;
	Timer timer;
	
	int xvelocity = 1;
	int yvelocity = 1;
	int x = 0 ;
	int y = 0 ;
	
	
	my_panel() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(p_width,p_hight));
		
		enemy = new ImageIcon("D:\\programming\\java files\\learning\\j11\\2d_enimations\\src\\enemy.png").getImage();
		backg = new ImageIcon("D:\\programming\\java files\\learning\\j11\\2d_enimations\\src\\bg.png").getImage();
		timer = new Timer(10, this);
		timer.start();
		
	}

	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(backg, 0, 0,null);
		g2d.drawImage(enemy, x, y,null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
		if (x >= p_width-enemy.getWidth(null) || x < 0) {
			xvelocity = xvelocity * -1;
		}
		x = x + xvelocity;
		
		if (y >= p_hight-enemy.getHeight(null) || y < 0) {
			yvelocity = yvelocity * -1;
		}
		y = y + yvelocity;
		
		repaint();
	}
	
	

}
