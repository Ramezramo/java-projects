import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Menu_bar extends JFrame implements ActionListener{
	JMenuItem exit;
	Menu_bar(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menu = new JMenuBar();
		
		JMenu filemenu = new JMenu("File");
		JMenuItem loaditem = new JMenuItem("load");

		
		
		JMenu editmenu = new JMenu("Edit");
		exit = new JMenuItem("exit");
		exit.addActionListener(this);
		filemenu.setMnemonic(KeyEvent.VK_A);
		exit.setMnemonic(KeyEvent.VK_X);
		
		JMenu helpmenu = new JMenu("Help");
		JMenuItem save = new JMenuItem("save");
		
		filemenu.add(loaditem);
		filemenu.add(save);
		filemenu.add(exit);
		
		menu.add(filemenu);
		menu.add(helpmenu);
		menu.add(editmenu);
		
		
		this.setJMenuBar(menu);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == exit ) {
			System.exit(0);
			
		}
		
	}
}
