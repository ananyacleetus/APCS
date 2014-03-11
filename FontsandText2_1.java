import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.geom.Ellipse2D;

public class FontsandText2 extends Applet {
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
		
		int ys = 50;
		int xs = 0;
		int size = 10;
		int yc = 60;
		int xc = 0;
	
			
			
			while(size< 160){
		
			Font f = new Font("Times New Roman", Font.PLAIN, size);
		g2.setFont(f);
		g.drawString("Font Size " + size, xs, ys);
		size+=10;
		ys+=yc;
		yc+=5;
		
		
		
		if (size >100){
		xs+=xc;
		xc+=25;
		}
		
		if (ys>this.getHeight()){
			ys=100;
			xs +=135;
		
		}
			}
			
			
	}
}
		
		