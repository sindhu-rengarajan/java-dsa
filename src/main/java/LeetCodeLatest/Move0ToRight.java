package LeetCodeLatest;

import java.util.Arrays;

public class Move0ToRight {

	public static int[] moveZero(int[] a) {
		int j = -1;
		int n = a.length;

		for (int i = 0; i < n; i++) {

			if (a[i] == 0) {
				j = i;
				break;
			}

		}

		for (int i = j + 1; i < n; i++) {

			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}

		}
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		System.out.println(Arrays.toString(moveZero(a)));

	}

}
