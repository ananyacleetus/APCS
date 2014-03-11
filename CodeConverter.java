import java.util.HashMap;
import java.util.Map;

public class CodeConverter {
	private int i;
	public String b;
	private static String[] a = { "||'''", "'''||", "''|'|", "''||'", "'|''|",
			"'|'|'", "'||''", "|'''|", "|''|'", "|'|''" };
	private static String[] y = {"zero", "one", "two", "three", "four", "five", "six",
			"seven", "eight", "nine" };

	private static HashMap h = new HashMap();
	private static HashMap r = new HashMap();

	public CodeConverter(int g) {
		i = g;
		fillMap();
		
	}

	public CodeConverter(char m) {
		i = (int) (m - '0');
		fillMap();
	}

	public CodeConverter(String d) {
		b = d;
		fillMap();

	}

	private void fillMap() {

		for (int i = 0; i < a.length; i++) {
			h.put(new Integer(i), a[i]);
			h.put(a[i], new Integer(i));

		}

		for (int i = 0; i < y.length; i++) {
			r.put(new Integer(i), y[i]);
		}

	}

	public int toInt() {

		int j = ((Integer) h.get(b)).intValue();

		if (h.containsKey(b)) {
			return j;

		} else {
			throw new IllegalArgumentException("No number found for barcode.");
		}
	}

	public String toBars() {

		String e = (String) h.get(new Integer(i));

		if (h.containsKey(new Integer(i))) {
			return e;
		} else {
			throw new IllegalArgumentException("No barcode found for number.");
		}

	}

	public String toName() {
		String l = (String) (r.get(new Integer(i)));

		if (r.containsKey(new Integer(i))) {
			return l;
		} else {
			throw new IllegalArgumentException("No name found for digit.");
		}

	}
}
