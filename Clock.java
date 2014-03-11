import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.*;
import java.text.DateFormat;
import java.applet.Applet;

public class Clock extends Applet implements Runnable {
	private Thread clockThread = null;
	Image offScrImg;

	public void init() {
		this.setSize(1500, 900); // sets the size of the applet window

	}

	public void start() {

		if (clockThread == null) {
			clockThread = new Thread(this, "Clock");
			clockThread.start();
		}
	}

	public void run() {
		Thread myThread = Thread.currentThread();
		while (clockThread == myThread) {
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// the VM doesn't want us to sleep anymore,
				// so get back to work
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		// get applet height and width
		Dimension appletSize = this.getSize();
		int appletHeight = this.getHeight();
		int appletWidth = this.getWidth();

		// get the time and convert it to a date
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();

		// format it and display it
		DateFormat dateFormatter = DateFormat.getTimeInstance();
		g2.drawString(dateFormatter.format(date), 5, 10);

		// find center
		Point center = new Point(appletWidth / 2, appletHeight / 2);
		int x = (int) center.getX();
		int y = (int) center.getY();

		g2.setColor(new Color((int) (Math.random() * 255),
				(int) (Math.random() * 255), (int) (Math.random() * 255)));
		g2.fillRect(0, 0, appletWidth, appletHeight);

		g2.setColor(new Color(241, 204, 255));
		// draw cardinal direction hours
		g2.setStroke(new BasicStroke(4));
		g2.draw(new Ellipse2D.Double(x - 400, y - 400, 800, 800));
		g2.drawLine(x, y + 300, x, y + 350);
		g2.drawLine(x, y - 300, x, y - 350);
		g2.drawLine(x + 300, y, x + 350, y);
		g2.drawLine(x - 300, y, x - 350, y);

		int d = 30;
		int c = 0;

		// draw hour marks
		while (d < 360) {

			g2.draw(new Line2D.Double(x + 300 * Math.cos(Math.toRadians(d)), y
					+ 300 * Math.sin(Math.toRadians(d)), x + 350
					* Math.cos(Math.toRadians(d)), y + 350
					* Math.sin(Math.toRadians(d))));
			d += 30;
		}
		// draw 5 minute marks (unbolded)
		while (c < 360) {
			g2.setStroke(new BasicStroke(1));
			g2.draw(new Line2D.Double(x + 330 * Math.cos(Math.toRadians(c)), y
					+ 330 * Math.sin(Math.toRadians(c)), x + 350
					* Math.cos(Math.toRadians(c)), y + 350
					* Math.sin(Math.toRadians(c))));

			c += 6;

		}

		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int h = cal.get(Calendar.HOUR);
		double l = cal.get(Calendar.MILLISECOND);

		h = (h * 30) - 90;
		m = (m * 6) - 90;
		s = (s * 6) - 90;

		l = (l * 6) / 1000.0;

		g2.setStroke(new BasicStroke(5));
		g2.draw(new Line2D.Double(x, y, x + 120 * Math.cos(Math.toRadians(h)),
				y + 120 * Math.sin(Math.toRadians(h))));

		g2.setStroke(new BasicStroke(5));
		g2.draw(new Line2D.Double(x, y, x + 280 * Math.cos(Math.toRadians(m)),
				y + 280 * Math.sin(Math.toRadians(m))));

		g2.setStroke(new BasicStroke(2));
		g2.draw(new Line2D.Double(x, y, x + 280
				* Math.cos(Math.toRadians(s + l)), y + 280
				* Math.sin(Math.toRadians(s + l))));

		// g2.draw(new Line2D.Double(x, y, x + 290 *
		// Math.cos(Math.toRadians(m)),
		// y + 290 * Math.sin(Math.toRadians(m))));
		//
		// g2.setStroke(new BasicStroke(1));
		// g2.draw(new Line2D.Double(x, y, x + 300 *
		// Math.cos(Math.toRadians(s)),
		// y + 300 * Math.sin(Math.toRadians(s))));

		// g2.draw(new Ellipse2D.Double(x - 300, y - 300, 600, 600));
		// g2.draw(new Ellipse2D.Double(x - 350, y - 350, 700, 700));

	}

	public void update(Graphics g) {
		// Create an offscreen image and then get its
		// graphics context
		if (offScrImg == null)
			offScrImg = createImage(getSize().width, getSize().height);

		Graphics og = offScrImg.getGraphics();

		// Now draw on the offscreen image.
		paint(og);

		// Don't bother to call paint,
		// just draw the offscreen image
		// to the screen.
		g.drawImage(offScrImg, 0, 0, this);

		// Get rid of the offscreen graphics context.
		// Can't unclip a graphics context so have
		// to get a new one next time around.
		og.dispose();
	}

	// overrides Applet's stop method, not Thread's
	public void stop() {
		clockThread = null;
	}
}
