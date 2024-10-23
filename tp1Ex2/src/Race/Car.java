package Race;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.reflect.Array;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Car extends Thread{
	
	private JLabel label; 
	private int x;
	private int speed;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	public Car(String image) {
		label = new JLabel();
		label.setIcon(new ImageIcon(image));
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < screenSize.width; i++) {
			if (label.getX() > screenSize.width) {
				x = 0;
			}else {
				x = x+speed;
				try {
					sleep(1000/speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}// end else<<
			label.setLocation(x, (int) label.getLocation().getY());
		}//end for
		
		
	}
	
	
	
}
