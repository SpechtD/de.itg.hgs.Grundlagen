package I2_MethodenUndGrafik;

import java.awt.Graphics;
import javax.swing.JPanel;


public class MeinPanel extends JPanel {

	@Override
    protected void paintComponent(Graphics g) {
	    
	    super.paintComponent(g);
	    
	    zeichneHaus(g,100,100);
	    
    }
	
	public void zeichneHaus(Graphics g, int posX, int posY){
		g.drawLine(posX,posY,200,200);
	}
	
	
}
