public class Month {

	private int days;
	private int month;
	public Year year;

	public Month(int m, Year y) {
		month = m;
		year = y;
	}

	public Month(int m, int y) {
		month = m;
		year = new Year(y);

	}

	public int findDays() {

		switch (month) {

		case 1:
			days = 31;
			break;

		case 2:

			if (year.isLeapYear()) {
				days = 29;
			} else {
				days = 28;
			}
			break;

		case 3:
			days = 31;
			break;

		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;

		case 6:
			days = 30;
			break;

		case 7:
			days = 31;
			break;

		case 8:
			days = 31;
			break;

		case 9:
			days = 30;
			break;

		case 10:
			days = 31;
			break;

		case 11:
			days = 30;
			break;

		case 12:
			days = 31;
			break;

		}

		
		
		return days;

	}

}
