package combobox;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;

public class My_frame extends JButton {
    
    private static final int WIDTH = 100;
    private static final int HEIGHT = 50;
    private static final Color BUTTON_COLOR = new Color(255, 153, 51);
    private static final Color BORDER_COLOR = new Color(204, 102, 0);
    private static final Color TEXT_COLOR = Color.WHITE;
    
    public My_frame(String text) {
    	
        super(text);
        System.out.println("hi");
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setForeground(TEXT_COLOR);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(BUTTON_COLOR.darker());
        } else if (getModel().isRollover()) {
            g.setColor(BUTTON_COLOR.brighter());
        } else {
            g.setColor(BUTTON_COLOR);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(BORDER_COLOR);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        super.paintComponent(g);
    }
    
}


//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import java.awt.Button;
//public class My_frame  extends JFrame implements ActionListener {
//	JComboBox combo;
//	My_frame(){
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(420,420);
//		this.setLayout(new FlowLayout());
//		
//		String[] animals = {"dog","cat","bird"};
//		
//		combo = new JComboBox(animals);
//		combo.addActionListener(this);
////		combo.setEditable(true);
////		combo.getItemCount();
////		combo.addItem("horse");
////		combo.insertItemAt("big",0);
////		combo.removeItemAt(0);
//		combo.removeAll();
//		
//		this.add(combo);
//		this.pack();
//		this.setVisible(true);
//
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getSource()==combo) {
//			System.out.println(combo.getSelectedIndex());
//		}
//		
//	}
//}
