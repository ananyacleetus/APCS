
public class YearMonthTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Year y = new Year(2001);
Month m = new Month(2, y);
System.out.println(y.toString());
System.out.println(m.findDays());


	}

}
