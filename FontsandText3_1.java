import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.LineMetrics;

public class FontsandText3 extends Applet {
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
		//Font jm = new Font("Times New Roman", Font.PLAIN, 50);

//		LineMetrics lm = jm.getLineMetrics("Test", g2.getFontRenderContext());
//		System.out.println(lm.getAscent());
		
		
			
			
				Font jm = new Font("Times New Roman", Font.PLAIN, 100);
				g2.setFont(jm);
				g2.drawString("Plain" ,20,200);
				
	
			jm = new Font("Times New Roman", Font.BOLD, 100);
			g2.setFont(jm);
				g2.drawString("Bold",20, 400);
				
				
				jm = new Font("Times New Roman", Font.ITALIC, 100);
				g2.setFont(jm);
				g2.drawString("Italic",20, 600);
				
				
		
		
		
		
		
	

		

	
			}
		
	
}
