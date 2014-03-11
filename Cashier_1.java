import java.io.IOError;

public class Cashier {
	private int pennies = 0;
	private int nickels = 0;
	private int dimes = 0;
	private int quarters = 0;
	private int dollars = 0;
	private double amtdue = 0;
	private double amtrec = 0;
	private int change = 0;

	public Cashier() {

	}

	public Cashier(double p, double c) {

		amtdue = p;
		amtrec = c;
	}

	public double setPrice(double x) {
		amtdue = x;
		return amtdue;

	}

	public double pay(double y) {

		amtrec = y;
		return amtrec;
	}

	public String giveChange() {
		change = (int) (Math.round(100 * (amtdue - amtrec)));

		dollars = change / 100;
		change = change % 100;

		while (change >= 25) {
			quarters++;
			change -= 25;
		}

		dimes = change / 10;
		pennies = change % 10;

		if (pennies >= 5) {
			nickels++;
			pennies -= 5;
		}

		return "You have " + dollars + " dollars left, " + quarters
				+ " quarters left, " + dimes + " dimes left, " + nickels
				+ " nickels left, and " + pennies + " pennies left.";


	}

}
