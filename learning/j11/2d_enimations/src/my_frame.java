import javax.swing.*;
import java.awt.*;

public class my_frame extends JFrame{
	
	my_panel panel;
	
	my_frame(){
		panel = new my_panel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
