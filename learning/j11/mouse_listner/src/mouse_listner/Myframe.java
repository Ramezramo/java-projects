package mouse_listner;

import javax.swing.JFrame;

public class Myframe extends JFrame {
	
	Drag_panel drager = new Drag_panel();
	
	Myframe(){
		
		
		this.setTitle("Drage drop");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(drager);
		this.setVisible(true);
		
	}

}
