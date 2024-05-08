package LeetCodeMustToSolve;
import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOne {

	public static int solve(int[] a, int k) {

		int l = 0, r = 0, maxlen = 0, zeros = 0;
		int n = a.length;

		while (r < n) {
			if (a[r] == 0) {
				zeros++;
			}
			if (zeros > k) {
				if (a[l] == 0) {
					zeros--;
				}
				l++;
			}
			if (zeros <= k) {
				int len = r - l + 1;
				maxlen = Math.max(len, maxlen);
			}
			r++;
		}
		return maxlen;

	}

	public static int solve1(int[] a, int k) {
		int l = 0, r = 0, maxlen = 0;
		int n = a.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		while (r < n) {
			if (map.containsKey(a[r])) {
				map.put(a[r], map.get(a[r]) + 1);

			}

			if (map.get(0) > k) {
				map.put(a[l], map.get(a[l]) - 1);
				if (map.get(a[l]) == 0) {
					map.remove(a[l]);
				}
				l++;
			}

			if (map.get(0) <= k) {
				int len = r - l + 1;
				maxlen = Math.max(maxlen, len);
			}
			map.put(a[r], 1);
			r++;
		}

		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		int a[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		int ans = solve1(a, k);
		System.out.println(ans);

	}

}
