package _6_42_proo;

import javax.swing.*;
import java.awt.*;

public class jlayeredpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		JLayeredPane layeredpane = new JLayeredPane();
		layeredpane.setBounds(0,0,500,500);
//		
		JFrame frame = new JFrame();
		frame.add(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
