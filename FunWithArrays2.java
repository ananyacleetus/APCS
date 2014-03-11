import java.util.ArrayList;

public class FunWithArrays2 {
	private ArrayList<String> a;
	private ArrayList<Integer> i;

	public FunWithArrays2(String s, String r, String q, String p, String n) {
		a = new ArrayList<String>();
		a.add(s);
		a.add(r);
		a.add(q);
		a.add(p);
		a.add(n);

	}

	public FunWithArrays2(int j, int k, int l, int m, int n) {
		i = new ArrayList<Integer>();
		i.add(j);
		i.add(k);
		i.add(l);
		i.add(m);
		i.add(n);
	}

	public void filter(ArrayList<Integer> m, ArrayList<Integer> n) {

		for (int w = 0; w < (n.size()); w++) {

			for (int v = 0; v < m.size(); v++) {
				if (m.get(v).equals(n.get(w))) {
					m.remove(v);
					v--;
				}

			}
		}

	}

	public void removeDuplicates(ArrayList<String> p, ArrayList<String> r) {

		for (int w = 0; w < (r.size()); w++) {

			for (int v = 0; v < p.size(); v++) {
				if (p.get(v).equals(r.get(w))) {
					p.remove(v);
					v--;
				}

			}
		}

	}

	public ArrayList<Integer> makeIntArray() {

		return i;

	}

	public ArrayList<String> makeStringArray() {

		return a;

	}

	public static void main(String[] args) {

		FunWithArrays2 list1 = new FunWithArrays2(128, 127, 3646, 4, 5060);
		FunWithArrays2 list2 = new FunWithArrays2(128, 127, 3, 4, 500);

		list1.filter(list1.makeIntArray(), list2.makeIntArray());
		System.out.println(list1.makeIntArray());

		FunWithArrays2 list3 = new FunWithArrays2("foxtrot", "romeo", "alpha",
				"vacuum", "zebra");
		FunWithArrays2 list4 = new FunWithArrays2("zebra", "gamma", "umbrella",
				"vacuum", "romeo");

		list1
				.removeDuplicates(list3.makeStringArray(), list4
						.makeStringArray());
		System.out.println(list3.makeStringArray());

	}
}