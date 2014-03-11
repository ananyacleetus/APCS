import java.applet.Applet;
import java.awt.*;
import java.util.Stack;

public class Maaaaaaze extends Applet {
	private int height;
	private int width;
	private int startx;
	private int starty;
	private int map[][];
	private Stack<Point> stack;

	public Maaaaaaze() {

		EasyReader EZ = new EasyReader(
				"C:\\Users\\cleetusa\\Downloads\\maze1.txt");
		height = EZ.readInt();
		width = EZ.readInt();
		startx = EZ.readInt();
		starty = EZ.readInt();
		map = new int[height][width];
		for (int y = 0; y < height; y++)

			for (int x = 0; x < width; x++) {
				map[y][x] = EZ.readInt();

			}

		stack = new Stack<Point>();

	}

	public void drawMaze(Graphics g4) {

		for (int y = 0; y < height; y++)

			for (int x = 0; x < width; x++) {
				if (map[y][x] == 2) {
					g4.setColor(new Color(0, 0, 0));
				}

				else {
					g4.setColor(new Color((int) (Math.random() * 255),
							(int) (Math.random() * 255),
							(int) (Math.random() * 255)));

				}
				g4.fillRect(x * 10, y * 10, 10, 10);

			}
	}

	public void Move(Graphics g4) {
		Point start = new Point(starty, startx);
		g4.setColor(new Color(255, 255, 255));

		stack.push(start);

		g4.fillRect((int) start.getX() * 10, (int) start.getY() * 10, 10, 10);

		Point current = new Point(startx, starty);

		Rectangle r = new Rectangle(1, 1, width - 2, height - 2);

		while (r.contains(current)) {

			map[(int) current.getY()][(int) (current.getX())] = 4;

			if (map[(int) current.getY()][(int) (current.getX() + 1)] == 2) {

				g4.setColor(new Color(255, 255, 255));

				stack.push(new Point((int) current.getX() + 1, (int) (current
						.getY())));

				current.move((int) current.getX() + 1, (int) (current.getY()));

			}

			else if (map[(int) current.getY() + 1][(int) (current.getX())] == 2) {
				g4.setColor(new Color(255, 255, 255));

				stack.push(new Point((int) (current.getX()), (int) (current
						.getY() + 1)));

				current
						.move((int) (current.getX()),
								(int) (current.getY() + 1));

			}

			else if (map[(int) current.getY() - 1][(int) (current.getX())] == 2) {
				g4.setColor(new Color(255, 255, 255));

				stack.push(new Point((int) (current.getX()), (int) (current
						.getY() - 1)));

				current
						.move((int) (current.getX()),
								(int) (current.getY() - 1));

			}

			else if (map[(int) current.getY()][(int) (current.getX() - 1)] == 2) {
				g4.setColor(new Color(255, 255, 255));

				stack.push(new Point((int) (current.getX() - 1), (int) (current
						.getY())));

				current
						.move((int) (current.getX() - 1),
								(int) (current.getY()));

			}

			else {
				current = stack.pop();
				g4.setColor(Color.RED);
			}

			g4.fillRect((int) ((current.getX()) * 10),
					(int) (current.getY()) * 10, 10, 10);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void init() {
		this.setSize(1600, 900);
	}

	public void paint(Graphics g) {
		Graphics2D g4 = (Graphics2D) g;

		drawMaze(g4);
		Move(g4);

	}

}
