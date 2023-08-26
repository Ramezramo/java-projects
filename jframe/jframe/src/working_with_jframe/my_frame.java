package working_with_jframe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class my_frame extends JFrame{
	
	my_frame(){

//		JFrame  frame = new JFrame();//creats a frame
		this.setTitle("GTA IV");//window title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//what will do when close
		

		this.setResizable(false);
		this.setSize(420,420);
//		frame.getContentPane().setBackground(new Color(0,3,3));
		this.getContentPane().setBackground(Color.darkGray);
		this.setVisible(true);
		ImageIcon image = new ImageIcon("D:\\programming\\java files\\jframe\\jframe\\src\\working_with_jframe\\photo.png");
		this.setIconImage(image.getImage());

		
	}

}
