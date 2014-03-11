public class FloorPlan implements Measurable {
	private double area;
	private double l1;
	private double w1;
	private double n1;
	private double l2;
	private double w2;
	private double n2;
	private double l3;
	private double w3;
	private double n3;

	/**
	 * L1 and W1 are the length and width of the first model room, and N1 is how
	 * many of that room there are in the house. L2, W2, N2, and so on, are the
	 * respective lengths, widths, and numbers of the other rooms. There are
	 * three model rooms in this class, but each model can have multiple rooms
	 * made from that model.
	 */

	private FloorPlan(double a1, double a2, double a3, double b1, double b2,
			double b3, double c1, double c2, double c3) {
		l1 = a1;
		w1 = a2;
		n1 = a3;
		l2 = b1;
		w2 = b2;
		n2 = b3;
		l3 = c1;
		w3 = c2;
		n3 = c3;

	}

	public double getArea() {

		double area1 = n1 * (l1 * w1);
		double area2 = n2 * (l2 * w2);
		double area3 = n3 * (l3 * w3);

		area = area1 + area2 + area3;

		return area;
	}

	public String toString() {
		return "There are " + (int) n1 + " room(s) with the size " + l1 + " by " + w1
				+ ", " + (int) n2 + " room(s) with the size " + l2 + " by " + w2 + ", "
				+ (int) n3 + " room(s) with the size " + l3 + " by " + w3
				+ " and the total area is " + area;

	}

	public static void main(String[] args) {

		FloorPlan fp = new FloorPlan(5, 5, 3, 10, 8, 1, 12, 2, 10);
		fp.getArea();
		System.out.println(fp);

	}
}