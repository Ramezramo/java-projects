package file_browser;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Browser_frame extends JFrame implements ActionListener{
	JButton button;
	Browser_frame(){
		this.setSize(420,900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select file");
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JFileChooser filechoser = new JFileChooser();
			filechoser.setSize(420,900);
//			filechoser.showOpenDialog(null);
			
//			int response = filechoser.showOpenDialog(null);
			filechoser.setCurrentDirectory(new File("C:\\Users\\VEGA Laptop\\Desktop"));
			int response = filechoser.showSaveDialog(null);
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(filechoser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
				
				
				
			}
			
		}
	}

}
