package LeetCodeMustToSolve;
import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

	public static String solve(String s, String t) {
		int l = 0, r = 0, count = 0, sIndex = -1;
		int minlen = Integer.MAX_VALUE;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
		}

		while (r < s.length()) {
			if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) > 0) {
				count++;
			}
			map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) - 1);
			while (count == t.length()) {
				map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
				if (r - l + 1 < minlen) {
					minlen = r - l + 1;
					sIndex = l;
				}
				if (map.get(s.charAt(l)) > 0) {
					count--;
				}
				l++;
			}
			r++;
		}
		return sIndex == -1 ? "" : s.substring(sIndex, minlen + sIndex);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "daaaabbbbcaf";
		String t = "abc";
		System.out.println(solve(s, t));

	}

}
