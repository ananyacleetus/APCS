import java.awt.geom.Point2D;

public class Needle {
	private Point2D start;
	private double angle;
	private Point2D end;

	

	public Needle() {
		start = new Point2D.Double(0, (Math.random()*2));
		angle = (Math.random()*180);
	}
	
	
	public void dropNeedle(){
		start = new Point2D.Double(0, (Math.random()*2));
		angle = (Math.random()*180);
		double changeiny = Math.sin(Math.toRadians(angle));
		double changeinx = Math.cos(Math.toRadians(angle));
		end = new Point2D.Double((start.getX()+changeinx), (start.getY()+ changeiny));
	}
	
	
	public Point2D getEnd(){
		return end;
	}
	
	
	public boolean checkState(){
		if (end.getY()>2){
			return true;
		}
		
		else {
			return false;
		}
	}

}
