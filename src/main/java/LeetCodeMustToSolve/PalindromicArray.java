package LeetCodeMustToSolve;

import java.util.Arrays;

public class PalindromicArray {

	public static int palinArray(int[] a, int n) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			int x = a[i];
			int rev = 0;
			while (x > 0) {
				int rem = x % 10;
				rev = rev * 10 + rem;
				x = x / 10;
			}
			b[i] = rev;
		}
		if (Arrays.equals(a, b)) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] a = { 111, 222, 333, 444, 421 };
		int n = 5;
		System.out.println(palinArray(a, n));
	}

}
