public class LuhnAlgorithm {

	public static void main(String[] args) {

		String cardNum = "377956570944726";

		int[] num = new int[cardNum.length()];

		int a = 0;

		while (a < num.length) {

			num[num.length - a-1] = Integer.parseInt(cardNum.substring(a, a + 1));
			a++;

		}

		int b = 1;

		while (b < num.length) {
			num[b] = num[b] * 2;
			
			
			if (num[b] >= 10) {
				num[b] -= 9;
			}
			
			b += 2;
		}

		int sum = 0;
		int c = 0;

		while (c < num.length) {
			System.out.print(num[c] + " ");

			sum = num[c] + sum;
			c++;

		}

		System.out.println(sum);

	}
}
