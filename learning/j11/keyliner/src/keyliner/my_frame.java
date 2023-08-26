package keyliner;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class my_frame extends JFrame implements KeyListener,MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	JLabel speedlabel;
	JLabel speedlabeltext;
	DragePanel dragepanel = new DragePanel();
	int speed = 1;

	my_frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.addKeyListener(this);
		this.setLayout(null);
		
		
		speedlabel = new JLabel();
		speedlabel.setBounds(443, 18, 50,30);
		speedlabel.setFont(new Font("Ink Free",Font.BOLD,25));
		speedlabel.setText(String.valueOf(speed));
		
		
		speedlabeltext = new JLabel();
		speedlabeltext.setBounds(320, 10, 150,50);
		speedlabeltext.setFont(new Font("Ink Free",Font.BOLD,20));
		speedlabeltext.setText("your speed is ");
		
		label = new JLabel();
		label.setBounds(0,0,50,50);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(speedlabel);
		this.add(speedlabeltext);
		this.add(label);
		this.add(dragepanel);
		this.setVisible(true);
		 
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(speed);
		if (speed <= 100 ) {
			
		
		if (e.getKeyChar() == ' ') {
			if (speed < 100 ){
				speed += 1;

			}else {
			
			
//			JOptionPane optionPane = new JOptionPane();
			JOptionPane.showMessageDialog(null, "the speed cannot be greater than 100","warning",JOptionPane.WARNING_MESSAGE);
//			speed -= 1;
			}
		}
		if (e.getKeyChar() == 'c') {
			if (speed != 1) {
			speed -= 1;
			}
		}}
		
		speedlabel.setText(String.valueOf(speed));
		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX()-speed, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY()-speed);
			break;
		case 's':
			label.setLocation(label.getX(), label.getY()+speed);
			break;
		case 'd':
			label.setLocation(label.getX()+speed, label.getY());
			break;

		default:
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed "+e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyreleased "+e.getKeyChar());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you pressed me ");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you are in it");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you are out of it");
	}

}
