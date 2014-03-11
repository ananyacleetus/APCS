import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.LineMetrics;

public class FontsAndText4 extends Applet {
	// init method initializes anything that you may be using
	public void init() {
		this.setSize(1500, 900); // sets the size of the applet window

	}

	// paint method does the actual drawing.
	// hint - avoid loops in the paint method!
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; // A GRAPHICS WINDOW THAT SUPPORTS
		// DOUBLES

		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment
				.getLocalGraphicsEnvironment();

		Font anan = new Font("Times New Roman", Font.PLAIN, 60);
		g2.setFont(anan);

	

		FontMetrics fm = g.getFontMetrics(anan);
		
		String s = "Hello World";
		
		int h = fm.getHeight();
		int w = fm.stringWidth(s);
		
		 Dimension appletSize = this.getSize();
		    int appletHeight = appletSize.height;
		    int appletWidth = appletSize.width;
		
			g2.drawString(s, (appletWidth/2)-(w/2),(appletHeight/2)-(h/2) );
	}

}
