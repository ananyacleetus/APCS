
public class TimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t = new Time(1235);
		
		System.out.println(t.getTime());
		System.out.println(t.getTotalMinutes());
		System.out.println(t.getHours());
		System.out.println(t.findDifference(new Time(705)));
		System.out.println(t);

	}

}
