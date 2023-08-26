package check_box;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class My_frame extends JFrame implements ActionListener {
	JCheckBox checkbox ;
	JButton button;
	ImageIcon true_icon;
	ImageIcon x_icon;
	
	My_frame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		x_icon = new ImageIcon("C:\\Users\\VEGA Laptop\\Desktop\\Untitled.png");
		true_icon = new ImageIcon("C:\\Users\\VEGA Laptop\\Desktop\\true.png");
		button = new JButton("submit");
		button.addActionListener(this);
		
		
		checkbox  = new JCheckBox();
		checkbox.setText("iam not robot");
		checkbox.setFocusable(false);
		checkbox.setIcon(x_icon);
		checkbox.setSelectedIcon(true_icon);
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println(checkbox.isSelected());
			
		}
		
	}

}
