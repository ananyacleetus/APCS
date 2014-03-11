import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Dart{

	private Point2D pt;
	private static Ellipse2D board = new Ellipse2D.Double(0, 0, 1, 1);

	public Dart(double x, double y) {

		pt = new Point2D.Double(x, y);

	}

	public Dart() {
		pt = new Point2D.Double(Math.random(), Math.random());
	}

	public void throwDart() {
		pt = new Point2D.Double(Math.random(), Math.random());

	}

	public boolean checkDart() {
		return board.contains(pt);

	}
	
	public String toString(){
		if (checkDart()){
			return "The dart is at" + pt + "and has hit the board.";
		}
		else {
			return "The dart is at" + pt + "and has missed the board.";
		}
		
	}
}
