package LeetCodeMustToSolve;
import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

	public static int solve(int[] a, int k) {
		int l = 0, r = 0, maxlen = 0;
		int n = a.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		while (r < n) {
			if (map.containsKey(a[r])) {
				map.put(a[r], map.get(a[r]) + 1);

			}
			else {
				map.put(a[r], 1);
			}

			if (map.size() > k) {
				map.put(a[l], map.get(a[l]) - 1);
				if (map.get(a[l]) == 0) {
					map.remove(a[l]);
				}
				l++;
			}

			if (map.size() <= k) {
				int len = r - l + 1;
				maxlen = Math.max(maxlen, len);
			}
			
			r++;
		}

		return maxlen;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
		int k = 2;
		int ans = solve(a, k);
		System.out.println(ans);
	}

}
