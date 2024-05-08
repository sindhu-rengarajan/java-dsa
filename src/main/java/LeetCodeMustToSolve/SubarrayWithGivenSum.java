package LeetCodeMustToSolve;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		// Your code here
		int count = 0;
		int total = 0;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		while (count < n) {
			for (int i = count; i < n; i++) {
				if (total < s) {
					total += arr[i];
					if (total == s) {
						arr1.add(count + 1);
						arr1.add(i + 1);
						return arr1;
					}

				} else {
					total = 0;
					count++;
					break;
				}

			}

		}
		return arr1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		int n = 2;
		int s = 3;
		System.out.println(subarraySum(arr, n, s));

	}

}
