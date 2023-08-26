package cool_button;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;

public class Cool_button_main extends JButton {
    
    private static final int WIDTH = 100;
    private static final int HEIGHT = 50;
    private static final Color BUTTON_COLOR = new Color(255, 153, 51);
    private static final Color BORDER_COLOR = new Color(204, 102, 0);
    private static final Color TEXT_COLOR = Color.WHITE;
    
    public Cool_button_main(String text) {
        super(text);
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