public class Time {

	private int time;
	private int totalminutes;
	private int hours;

	public Time() {
		time = 0;

	}

	public Time(int t1) {
		time = t1;
		// if (time > 2359 || time < 0){
		// System.out.println("Time is invalid.");

	}

	public Time(Time t1) {
		this.time = t1.time;
	}

	public int getTime() {
		return time;
	}

	public int getTotalMinutes() {
		totalminutes = ((int) (time / 100) * 60) + time % 100;
		return totalminutes;
	}

	public String findDifference(Time t2) {
		int diffm = Math.abs(this.getTotalMinutes() - t2.getTotalMinutes());
		int diffhm = ((int) diffm / 60) * 100 + diffm % 100;

		Time diff = new Time(diffhm);
		return "The difference is " + diff.getHours() + ":" + diffhm % 100 + ".";

	}

	public int getHours() {
		hours = (int) (time / 100);

		if (hours == 0) {
			hours = 12;
		}

		if (hours > 12) {
			hours = -12;
		}
		return hours;

	}

	public String toString() {

		if (this.getHours() < 12) {
			return "The time is " + hours + ":" + time % 100 + " AM.";

		} else {
			return "The time is " + hours + ":" + time % 100 + " PM.";
		}

	}

}