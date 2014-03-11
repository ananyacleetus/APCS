import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	private List<Integer> a;

	public ListTest(int e) {
		a = new ArrayList<Integer>();

		for (int i = 0; i < e; i++) {

			a.add(i, new Integer ((int) (Math.random() * 10)));
		}

	}

	public void RemoveDuplicates() {
		ListIterator<Integer> t = a.listIterator();

		while (t.hasNext()) {
			System.out.print(t.next()+ " ");
		} 
		System.out.println();
		for (int i = 0; i < a.size(); i++) {

			ListIterator<Integer> m = a.listIterator();

			while (m.hasNext()) {
Integer d = m.next();
				if (a.get(i).equals(d) && a.get(i)!= d) {
					m.remove();
				}

			}
		}

		ListIterator<Integer> p = a.listIterator();

		while (p.hasNext()) {
			System.out.print(p.next() + " ");
		}

	}

	public void For() {
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {

			sum += a.get(i);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

	public void ForEach() {
		long start = System.nanoTime();
		int sum = 0;
		for (Integer i : a) {
			sum += i;

		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

	public void Iterator() {
		long start = System.nanoTime();
		int sum = 0;
		Iterator<Integer> m = a.iterator();
		while (m.hasNext()) {
			sum += m.next();
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

	public void ListIterator() {
		long start = System.nanoTime();
		int sum = 0;
		ListIterator<Integer> n = a.listIterator();
		while (n.hasNext()) {
			sum += n.next();
		}
		long end = System.nanoTime();
		System.out.println(end - start);

	}

	public static void main(String[] args) {

		ListTest l = new ListTest(10);
		l.RemoveDuplicates();

	}
}