public class Contact {
	private String name;
	private String number;
	private String call;

	public Contact(String s, String m, String r) {
		name = s;
		number = m;
		call = r;

	}

	public Contact(String s, String m) {
		name = s;
		number = m;
		call = null;

	}

	public void setCall(Contact b) {
		call = b.name;

	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getCall() {
		if (this.call != null) {
			return call;
		} else {
			return "null";
		}
	}

	public String toString() {
		if (this.call != null) {
			return "" + this.getName() + " " + this.getNumber() + " calls "
					+ this.getCall();
		}

		else {
			return "" + this.getName() + " " + this.getNumber()
					+ " calls nobody";
		}

	}

}
