
//
//public class My_frame {
//
//}


package testing;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
////import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
public class My_frame extends JFrame implements ActionListener{
	JButton button;
	My_frame(){
		JButton button = new JButton();
		button.setBounds(200,100,100,50);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button ) {
			System.out.println("hi");
		}
		
		
	}


	
}