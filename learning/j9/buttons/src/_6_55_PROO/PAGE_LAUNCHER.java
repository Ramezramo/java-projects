package _6_55_PROO;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class PAGE_LAUNCHER implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("view new window");
	
	
	PAGE_LAUNCHER(){
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			frame.dispose();//this will close any page 
			NEW_PAGE new_page = new NEW_PAGE();
		}
		
	}

}
