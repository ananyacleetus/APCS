import java.util.ArrayList;

public class Dice {
	private int sides;
	private int number;
	

	private ArrayList<Counter> b;

	// default constructor sets die to 6 sides
	public Dice() {
		sides = 6;
		number = 0;

		b = new ArrayList<Counter>();

		for (int i = 0; i <= sides; i++) {
			b.add(i, new Counter());
		}

	}

	// other constructor sets dice to number of sides you give it
	public Dice(int n) {
		number = 0;
		sides = n;

		b = new ArrayList<Counter>();

		if (sides <= 1) {
			throw new IllegalArgumentException(
					"Dice must have more than 1 side");
		}

		for (int i = 0; i <= sides; i++) {
			b.add(i, new Counter());
		}

	}

	public void rollDie(int r) {
		for (int i = 0; i < r; i++) {

			number = (int) (Math.random() * sides) + 1;

			b.get(number).addOne();

		}
	}

	public String toString() {
		String s = "";

		for (int i = 1; i <= sides; i++) {
			s = s + " The dice rolled " + b.get(i) + " " + i + "s. ";
		}

		return s;
	}

	public static void main(String[] args) {

		Dice d = new Dice();
		d.rollDie(10000);
		System.out.println(d);
	}
}
