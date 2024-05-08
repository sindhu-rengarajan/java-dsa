package LeetCodeLatest;

import java.util.ArrayList;
import java.util.List;

public class NumberAppearsOnce1 {

	// [2, 3, -6, 2, 3, 3, 2, 3, -6]

	public static int printOddNumber(int[] a) {
		int n = a.length;
		List<Integer> temp = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if ((!temp.contains(a[i])) && a[i] == a[j]) {
					count++;
				}
			}
			if (!(count % 2 == 0)) {
				return a[i];
			}
			count = 0;
			temp.add(a[i]);

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, -6, 2, 3, 3, 2, 3, 1, -6, 2 };
		System.out.println(printOddNumber(a));

	}

}
