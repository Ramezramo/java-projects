package _6_35_prooo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon ICON = new ImageIcon("C:\\Users\\VEGA Laptop\\Downloads\\Download_icons8-button-50.png");
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		JButton button = new JButton(ICON);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusable(false);
		panel.add(button);
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true);

	}

}
