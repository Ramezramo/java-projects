package jprogres;

import java.awt.*;
import javax.swing.*;

public class The_content {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);
	
	
	The_content() {
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.green);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	public void fill() {
		int hi = 100;
		
			System.out.println(hi);
			for (int i = 0;1<100;i--) {
				if (hi < 101) {
				try {
					
					
					
					Thread.sleep(70);
				
					bar.setValue(hi);
					hi -= 1;
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("error 32_3256");
				}
				
					
				}else {
					break;
					
				}
//				System.out.println("running in back ground");
				}
				bar.setString("the end of the road");
		
	}

}
