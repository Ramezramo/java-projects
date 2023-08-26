package working_with_jframe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class jframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		JFrame  frame = new JFrame();//creats a frame
		frame.setTitle("GTA IV");//window title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//what will do when close
		

		frame.setResizable(false);
		frame.setSize(420,420);
//		frame.getContentPane().setBackground(new Color(0,3,3));
		frame.getContentPane().setBackground(Color.darkGray);
		frame.setVisible(true);
		ImageIcon image = new ImageIcon("D:\\programming\\java files\\jframe\\jframe\\src\\working_with_jframe\\photo.png");
		frame.setIconImage(image.getImage());

		*/
		my_frame frame = new my_frame();
		
		System.out.println(frame.isActive());

	}

}
