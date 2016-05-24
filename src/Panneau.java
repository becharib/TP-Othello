import java.awt.Graphics;

import javax.swing.JPanel;



/**
 * 
 */

/**
 * @author becharib
 *It is all the content in the window
 */
public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g){
		 g.drawRect(10, 10, 360, 360);
		 g.drawString("1", 40, 20);
		 g.drawString("2", 80, 20);
		 g.drawString("3", 120, 20);
		 g.drawString("4", 160, 20);
		 g.drawString("5", 200, 20);
		 g.drawString("6", 240, 20);
		 g.drawString("7", 280, 20);
		 g.drawString("8", 320, 20);
	}

}
