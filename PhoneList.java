import java.util.LinkedList;

public class PhoneList {
	private LinkedList<Contact> l;

	public PhoneList() {
		l = new LinkedList<Contact>();

	}

	public PhoneList(Contact c) {
		l = new LinkedList<Contact>();
		l.addFirst(c);

	}

	public PhoneList(String a, String b) {
		l = new LinkedList<Contact>();
		l.addFirst(new Contact(a, b));

	}

	public void addtoFront(Contact o) {
		Contact a = l.getFirst();

		l.addFirst(new Contact(o.getName(), o.getNumber(), a.getName()));

	}

	public void addtoFront(String r, String b) {
		if (l.size() != 0) {
			Contact a = l.getFirst();
			l.addFirst(new Contact(r, b, a.getName()));
		}

		else {
			l.addFirst(new Contact(r, b, "no contact to call"));

		}

	}

	public void addtoBack(String s, String f) {
		Contact t = new Contact(s, f);
		l.getLast().setCall(t);
		l.addLast(t);
	}

	public void addtoBack(Contact t) {
		l.getLast().setCall(t);

		l.addLast(t);

	}

	public int getLength() {
		return l.size();
	}

	public Contact getFirst() {
		return l.getFirst();
	}

	public Contact get(int r) {
		return l.get(r);
	}

}
