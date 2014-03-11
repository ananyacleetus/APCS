import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PhoneApp extends Applet {
	public void init() {
		this.setSize(1500, 900);
	}

	public void paint(Graphics g) {
		Graphics2D g4 = (Graphics2D) g;

		PhoneList p = new PhoneList();

		p.addtoFront("Mike", "412-867-5309");

		Contact ananya = new Contact("Ananya", "1-800-998-2039");
		p.addtoFront(ananya);

		p.addtoBack("James", "999-999-9999");

		Contact kelly = new Contact("Kelly", "123-456-7890");
		p.addtoBack(kelly);

		Dimension appletSize = this.getSize();
		int appletHeight = this.getHeight();
		int appletWidth = this.getWidth();

		g4.setColor(new Color(175, 238, 238));

		g4.fillRect(0, 0, appletWidth, appletHeight);
		
		g4.setColor(new Color (0,0,0));
		
		g4.setFont(new Font("Times New Roman", Font.BOLD, 100));
		g4.drawString("Phone List", 400, 200);
		
		g4.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		
		for (int i = 0; i < p.getLength(); i++){
		
		g4.drawString(new String("" + p.get(i)), 150, 300 + (100*i));
		
		}
		
		
		

	}
}
