package LeetCodeMustToSolve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestNumber {

	// "My name is sindhu"

	static void reverseString(String s) {
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	static int printThirdHighest(int[] a) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.println(i);

			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];
				System.out.println("first ele = " + first);
			}

			else if (a[i] > second && a[i] < first) {
				third = second;
				second = a[i];
				System.out.println("second ele = " + second);
			}

			else {
				third = Math.max(third, a[i]);
				System.out.println("third ele = " + third);
			}

		}
		return third;

	}

	static int print(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		return a[n-3];
	}

	public static void main(String[] args) {

		int[] a = { 12, 4, 42, 1, 2, 56, 100, 2, 23 };
		int ans = print(a);
		System.out.println(ans);

	}

}
