public class CodeConverterTest2 {
	private int d1;
	private int d2;
	private int d3;
	private int d4;
	private int d5;

	/**
	 * @param args
	 */

	public CodeConverterTest2(int c) {
		d1 = 25;
		d2 = 25;
		d3 = 25;
		d4 = 25;
		d5 = 25;
		int n = 10000;
		int z = 1;

		int v = 0;

		while (c > 0) {
			v = c / n;
			c = c % n;
			if (z == 1) {
				d1 = v;

			}
			if (z == 2) {
				d2 = v;

			}
			if (z == 3) {
				d3 = v;

			}
			if (z == 4) {
				d4 = v;

			}
			if (z == 5) {
				d5 = v;

			}

			n = n / 10;
			z++;
		}

		if (d1 == 25 || d2 == 25 || d3 == 25 || d4 == 25 || d5 == 25) {
			throw new IllegalArgumentException(
					"Wasn't able to recognize seperate digits from number");
		}

	}

	public String toNames() {
		
	

		CodeConverter c1 = new CodeConverter(d1);
		CodeConverter c2 = new CodeConverter(d2);
		CodeConverter c3 = new CodeConverter(d3);
		CodeConverter c4 = new CodeConverter(d4);
		CodeConverter c5 = new CodeConverter(d5);
		
			
		return "The number reads " + c1.toName() + " " + c2.toName() + " " +  c3.toName() + " " +  c4.toName() + " " +  c5.toName() + ".";

	}

	public static void main(String[] args) {
		
		CodeConverterTest2 k = new CodeConverterTest2(15241);
		System.out.println(k.toNames());
		// TODO Auto-generated method stub

	}

}
