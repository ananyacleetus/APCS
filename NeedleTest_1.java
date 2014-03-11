public class NeedleTest {
	private int total;
	private int hits;
	 

	public NeedleTest() {
		total = 0;
		hits = 0;
		
	}

	public void run() {
		double ratio = 0;
				Needle n = new Needle();
				do {

	
			n.dropNeedle();

			if (n.checkState()) {
				
			
				
				hits++;
			}

			total++;
			
			
			if (hits == 0){
				ratio = 0;
			}
			
			else {
				ratio = (double) total/hits;
			}

		} while ((ratio) <= 3.140 || (ratio) >= 3.142);
	}

	public String toString() {
		return "" + total + " total and " + hits + " hits. Pi equals "
				+ ((double) total/hits);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NeedleTest nt = new NeedleTest();
		nt.run();
		System.out.println(nt);

	}

}
