package LeetCodeMustToSolve;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

	static int solve(String s) {
		int n = s.length();
		int max_length = -1;

		for (int i = 0; i < n; i++) {
			Set<Character> set = new HashSet<Character>();
			for (int j = i; j < n; j++) {
				if (set.contains(s.charAt(j))) {

					max_length = Math.max(max_length, j - i);
					break;
				}
				set.add(s.charAt(j));

			}
		}

		return max_length;
	}

	static int longestSubstringWithoutRepeatingCharacter(String s) {
		if (s.length() == 0) {
			return 0;
		}

		int l = 0, r = 0, maxlen = 0;
		int n = s.length();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		while (r < n) {
			if (map.containsKey(s.charAt(r))) {
				l = Math.max(l, map.get(s.charAt(r)) + 1);
			}

			maxlen = Math.max(maxlen, r - l + 1);
			map.put(s.charAt(r), r);
			r++;

		}

		return maxlen;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cadbzabcd";
		int ans = longestSubstringWithoutRepeatingCharacter(s);
		System.out.println(ans);
	}

}
