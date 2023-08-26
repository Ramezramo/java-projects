package text_field_7_17_;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class My_frame_ extends JFrame implements ActionListener{
	JButton button ;
	JTextField textField;
	JLabel label;
	My_frame_(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		
		label = new JLabel();
		
		label.setBounds(0,30,10,50);
		label.setText("type your name");
		
		this.add(label);
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().equals("")) {
			JOptionPane .showMessageDialog(null, "there is no name :)","title",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
		if (e.getSource()==button) {
			
			button.setEnabled(false);
			textField.setEditable(false);
			JOptionPane .showMessageDialog(null, "welcome "+textField.getText(),"user welcome",JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
			
			
			
		}
		}
	}

}
