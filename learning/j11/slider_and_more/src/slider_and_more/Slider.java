package slider_and_more;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	Slider() {
		
		frame = new JFrame("slider demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100);
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true); //this will add the mark
		slider.setMinorTickSpacing(25);//will make a mark while we increase 25
		slider.setPaintLabels(true); //will view the num of the mark
		slider.setOrientation(SwingConstants.VERTICAL);
//		slider.setOrientation(SwingConstants.HORIZONTAL);"
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		label.setText("c = "+slider.getValue());
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("c = "+slider.getValue());
		
	}

}
