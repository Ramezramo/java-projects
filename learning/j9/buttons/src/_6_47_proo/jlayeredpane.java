 package _6_47_proo;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class jlayeredpane {
 
	public static void main(String[] args) {
		
//		System.out.println("hi");
		JLabel label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.red);
		label.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredpane = new JLayeredPane();
		layeredpane.setBounds(0,0,500,500);
		layeredpane.setBackground(Color.black);
		
		layeredpane.add(label,  Integer.valueOf(0));//TO CONTROLL ITS LOCATION OF THE LABEL
		
//		layeredpane.add(label2,  JLayeredPane.DEFAULT_LAYER);
		
		layeredpane.add(label3,  Integer.valueOf(1));
		layeredpane.add(label2,  Integer.valueOf(2));
		
		JFrame frame = new JFrame();
		frame.add(layeredpane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
