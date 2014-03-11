import java.awt.geom.Point2D;

public class LineTest{
	
	
	
	
	public static void main (String[] args){
		
		SimpleLine test = new SimpleLine(0,5,3,-8);
	
		System.out.println(test.gethDist());
		
		System.out.println(test.getvDist());
		System.out.println(test.getsDist());
		System.out.println(test.getMidpoint());
//		System.out.println(test.getSlope());
		System.out.println(test.getEquation());



	}
}