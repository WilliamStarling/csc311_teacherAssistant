package ui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.*;

/**
 * 
 * @author Savannah
 */
public class LinePanel extends JPanel{
	
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawLine(125, 0, 125, 768);
		g.drawLine(145, 150, 2000, 150);
	}
}
