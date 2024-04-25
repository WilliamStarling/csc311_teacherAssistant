package ui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.*;

public class LinePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawLine(145, 0, 145, 768);
		//g.drawLine(160, 95, 1300, 95);
	}
}
