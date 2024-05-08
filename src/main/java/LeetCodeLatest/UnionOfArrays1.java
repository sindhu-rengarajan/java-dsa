package LeetCodeLatest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UnionOfArrays1 {
	public static List<Integer> union(int[] a1, int[] a2) {
		List<Integer> arr = new ArrayList<Integer>();

		Set<Integer> st = new HashSet<Integer>();
		int n1 = a1.length;
		int n2 = a2.length;
		for (int i = 0; i < n1; i++) {
			st.add(a1[i]);
		}
		for (int i = 0; i < n2; i++) {
			st.add(a2[i]);
		}

		for (int i : st) {
			arr.add(i);
		}

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a2[] = { 2, 3, 4, 4, 5, 11, 12 };
		List<Integer> arr1 = union(a1, a2);
		System.out.println(arr1);

	}

}
