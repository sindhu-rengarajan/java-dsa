package LeetCodeMustToSolve;

import java.util.Arrays;

public class FindSubsetOfArray {

	public static String isSubset(int[] a1, int[] a2, int m, int n) {
		int count = 0;
		Arrays.sort(a1);
		Arrays.sort(a2);
		for (int i = 0; i < m; i++) {
			if (a1[i] == a2[count]) {
				count++;
			}
			if (count == n) {
				return "Yes";
			}
		}
		return "No";
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 4, 5, 7, 8 };
		int[] a2 = { 5, 2, 7 };

		System.out.println(isSubset(a1, a2, 6, 3));
	}

}
