public class Backyard implements Measurable {

	private double area;
	private double bigwidth;
	private double biglength;
	private double smallwidth;
	private double smalllength;

	public Backyard(double a, double b, double c, double d) {
		bigwidth = a;
		biglength = b;
		smallwidth = c;
		smalllength = d;
	}

	public Backyard() {
		bigwidth = 100;
		biglength = 100;
		smallwidth = 25;
		smalllength = 25;
	}

	public double getArea() {
		area = ((biglength * bigwidth) - (smalllength * smallwidth));

		return area;
	}

	public String toString() {
		return "With an outside length of " + biglength
				+ ", an outside width of " + bigwidth + ", an inner length of "
				+ smalllength + " and an inner width of " + smallwidth
				+ ", the area is " + area + " units squared.";
	}

	public static void main(String[] args) {

		Backyard b = new Backyard(300, 200, 50, 50);
		b.getArea();
		System.out.println(b);

	}

}
