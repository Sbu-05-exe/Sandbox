public class Countdown {

	public static void countDown (int n) {
		if (n < 1) {
			System.out.println("Blast off");
		} else {
			System.out.println(n);
			countDown(n-1);
		}
	}

	public static void main (String[] args) {

		countDown(5);

	}
}