package LeetCodeMustToSolve;

public class ReverseString {
	public static String reverseWord(String str) {
		int n = str.length();
		char[] a = str.toCharArray();
		char[] b = new char[n];
		for (int i = n - 1; i >= 0; i--) {
			b[(n - 1) - i] = a[i];
		}

		String x = String.valueOf(b);
		return x;
	}

	public static void main(String[] args) {
		System.out.println(reverseWord("eewrqg"));

	}

}
