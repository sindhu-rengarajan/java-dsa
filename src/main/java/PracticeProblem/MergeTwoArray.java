package PracticeProblem;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1[] = { 1, 2, 9 };
		int num2[] = { 3, 5, 1 };

		int n = num1.length;
		int m = num2.length;

		int[] num3 = new int[m + n];
		for (int i = 0; i < n; i++) {
			num3[i] = num1[i];
		}

		for (int j = 0; j < m; j++) {
			num3[n + j] = num2[j];
		}

		Arrays.sort(num3);

		System.out.println(Arrays.toString(num3));

	}

}
