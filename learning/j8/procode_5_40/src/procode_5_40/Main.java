package procode_5_40;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon image = new ImageIcon("D:\\programming\\java files\\learning\\j8\\procode_5_40\\src\\procode_5_40\\photo.png");
		
		
		JLabel label = new JLabel();
		label.setText("hello man");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);

	}

}
