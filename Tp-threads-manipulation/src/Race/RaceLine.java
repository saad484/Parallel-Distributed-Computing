package Race;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RaceLine extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		this.setOpaque(false);
		ImageIcon image = new ImageIcon("road.png");
		g.drawImage(image.getImage(), 0, 0, this);
	}

}
