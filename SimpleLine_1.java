import java.awt.geom.Point2D;

public class SimpleLine {

	private Point2D x;
	private Point2D y;
	private double hDist;
	private double vDist;
	private double sDist;
	private double slope;
	private Point2D midpoint;
	private String equation;
private double yintercept;

	public SimpleLine(Point2D x, Point2D y) {
		this.x = x;
		this.y = y;
	}
	
	public SimpleLine (double x1, double x2, double y1, double y2){
		
		x = new Point2D.Double(x1,x2);
		y = new Point2D.Double(y1, y2);
	}

	public double gethDist() {

		hDist = Math.abs(x.getX() - y.getX());
		return hDist;

	}

	public double getvDist() {

		vDist = Math.abs(x.getY() - y.getY());
		return vDist;
	}

	public double getsDist() {
		sDist = x.distance(y);

		return sDist;

	}

	public double getSlope() {
		slope = ((y.getY() - x.getY()) / (y.getX() - x.getY()));

		return slope;
	}

	public Point2D getMidpoint() {
		midpoint = new Point2D.Double((x.getX() + y.getX()) / 2, x.getY()
				+ y.getY() / 2);
		

		return midpoint;
	}
	
	public String getEquation(){
		yintercept = x.getY()-getSlope()*x.getX();
		equation = "y = "+ slope+ " x + " + yintercept;
		return equation;
	}
}
