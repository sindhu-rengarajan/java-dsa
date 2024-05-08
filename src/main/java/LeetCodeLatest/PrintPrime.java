package LeetCodeLatest;

public class PrintPrime {

	static boolean isprime(int n) {

		int c = 2;
		while (c * c < n) {
			if (n % c == 0) {
				return false;
			}
			c++;

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isprime(1));

	}

}
