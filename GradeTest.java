
public class GradeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grade g = new Grade(87, "honors");
System.out.println(g.getEquivalent());
GPAA h = new GPAA(77, "honors", 60, "regular", 99, "regular", 32, "ap", 91, "ap");
System.out.println(h.getGPA());

	}

}
