package buttons;
//package testing;package newtst;

import java.awt.Color;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
////import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class My_frame extends JFrame implements ActionListener{
	JButton button;
	ImageIcon icon = new ImageIcon("C:\\Users\\VEGA Laptop\\Downloads\\Download_icons8-button-50.png");
	ImageIcon icon2 = new ImageIcon("C:\\Users\\VEGA Laptop\\Downloads\\Download_icons8-button-24.png");
	JLabel label;
	JButton button2;
	boolean true_false ;
	My_frame(){
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(225,150,150,150);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(0,0,107,30);
		button.addActionListener(this);
//		button.addActionListener(e -> System.out.println("hi1"));
		button.setText("view like");
		button.setFocusable(false);
		button.setForeground(Color.WHITE);
		button.setIcon(icon);
		button.setBackground(new Color (68,75,87));
		button.setHorizontalTextPosition(JButton.RIGHT);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		button2 = new JButton();
		button2.setBounds(350,0,107,30);
		button2.addActionListener(this);
//		button.addActionListener(e -> System.out.println("hi1"));
		button2.setText("hide like");
		button2.setFocusable(false);
		button2.setForeground(Color.WHITE);
		button2.setIcon(icon);
		button2.setBackground(new Color (68,75,87));
		button2.setHorizontalTextPosition(JButton.RIGHT);
		button2.setBorder(BorderFactory.createEtchedBorder());
		
		this.getContentPane().setBackground(new Color (68,75,87));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setBackground(new Color(ABORT));
		this.add(button);
		this.add(label);
		this.add(button2);
		System.out.println("hihi");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==button) {
//			System.out.println("hi");
			label.setVisible(true);
		}
		if (e.getSource()==button2) {
//			System.out.println("hi");
			label.setVisible(false);
		}
		
	}


	
}