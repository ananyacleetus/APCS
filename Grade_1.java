public class Grade {
	private double grade;
	private String letter;
	private String type;
	private double equivalent;


	public Grade(double g, String t) {
		grade = g;
		type = t;
		letter = getLetter();
		equivalent = getEquivalent();
		

	}

	public double getGrade() {
		return grade;

	}

	public String getLetter() {

		if (grade <= 100 && grade >= 89.5) {
			letter = "A";
		} else if (grade <= 89 && grade >= 79.5) {
			letter = "B";
		} else if (grade <= 79 &&  grade >= 69.5) {
			letter = "C";
		} else if (grade <= 69 && grade >= 59.5) {
			letter = "D";
		} else {
			letter = "F";
		}
		return letter;

	}

	public double getEquivalent() {
		if (type.charAt(0) == 'r') {

			switch (letter.charAt(0)) {
			case 'A':
				equivalent = 4;
				break;
			case 'B':
				equivalent = 3;
				break;
			case 'C':
				equivalent = 2;
				break;
			case 'D':
				equivalent = 1;
				break;
			case 'F':
				equivalent = 0;
				break;
			}

		}

		else if (type.charAt(0) == 'h') {

			switch (letter.charAt(0)) {
			case 'A':
				equivalent = 4.5;
				break;
			case 'B':
				equivalent = 3.5;
				break;
			case 'C':
				equivalent = 2;
				break;
			case 'D':
				equivalent = 1;
				break;
			case 'F':
				equivalent = 0;
				break;
			}
		}

		else if (type.charAt(0) == 'a') {

			switch (letter.charAt(0)) {
			case 'A':
				equivalent = 5;
				break;
			case 'B':
				equivalent = 4;
				break;
			case 'C':
				equivalent = 2;
				break;
			case 'D':
				equivalent = 1;
				break;
			case 'F':
				equivalent = 0;
				break;
			}

		}
		return equivalent;
	}

}
