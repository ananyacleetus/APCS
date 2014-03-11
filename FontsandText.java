import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.LineMetrics;
import java.awt.geom.Ellipse2D;

public class FontsandText extends Applet {
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
//	Font jm = new Font("Jokerman", Font.PLAIN, 12);
//	
//		LineMetrics lm = jm.getLineMetrics("Test", g2.getFontRenderContext());
//		System.out.println(lm.getAscent());
		
		String fontNames[] = graphicsEnvironment.getAvailableFontFamilyNames();
	int y = 20;
		int x =0;
		for (int i = 0; i <fontNames.length; i++) {
			// print font names
			
			Font testfont = new Font(fontNames[i], Font.PLAIN, 12);
		g2.setFont(testfont);
	
	
	
			g.drawString(fontNames[i], x, y);
			y += 15;
			if (y>this.getHeight()){
				y=20;
				x +=200;
			}
		} 
	
		

//		g2.setColor(new Color(250, 10, 100));
//		g2.drawString("Test", 250, 250);
//		System.out.println(g2.getFont());
//
//		g2.setColor(new Color(0, 0, 0));
//		g2.draw(new Ellipse2D.Double(25, 5, 100, 100));
//		g2.drawString("Default Circle", 35, 125);
//		g2.setColor(new Color(0, 155, 0));
//		g2.draw(new Ellipse2D.Double(200, 5, 100, 100));
//		g2.drawString("Circle with setColor", 200, 125);
//		GradientPaint gradient = new GradientPaint(25, 200,
//				new Color(255, 0, 0), 125, 300, new Color(0, 0, 255));
//		g2.setPaint(gradient);
//		g2.fill(new Ellipse2D.Double(25, 200, 100, 100));
//		g2.drawString("Circle with gradient", 23, 322);
	}
}

