import java.util.ArrayList;

public class FunWithArrays1 {
	private ArrayList<String> a;
	private ArrayList<Integer> i;
	

	public FunWithArrays1(String s, String r, String q, String p) {
		a = new ArrayList<String>();
		a.add(s);
		a.add(r);
		a.add(q);
		a.add(p);

	}

	public FunWithArrays1(int j, int k, int l, int m, int n) {
		i = new ArrayList<Integer>();
		i.add(j);
		i.add(k);
		i.add(l);
		i.add(m);
		i.add(n);
	}
	
	


	public ArrayList<String> reverseArray() {
		ArrayList<String> b = new ArrayList<String>();
		int c = 0;
		System.out.println(a);
		for (int i = (a.size() - 1); i >= 0; i--) {

			b.add((a.get(i)));

			c++;

		}

		return b;
	}

	public ArrayList<Integer> findSmallest() {

		int a = i.get(0);
		int x =0;
		
		for (int w = 1; w < i.size();) {

			a = Math.min(a, i.get(w));

			if (a == i.get(w)) {
				x = w;

			}

			w++;

					
		}

		i.remove(x);

		return i;

	}

	public static void main(String[] args) {

		FunWithArrays1 f = new FunWithArrays1("hi", "how", "are", "you?");

		System.out.println(f.reverseArray());

		FunWithArrays1 g = new FunWithArrays1(5, 8, -2, 13, 0);

		System.out.print(g.findSmallest());

	}
}