package LeetCodeLatest;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {

	public static int printLongestSubLength(String s, int k) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int n = s.length();
		int max_length = 0;
		for (int i = 0; i < n; i++) {
			map.clear();
			for (int j = i; j < n; j++) {
				if (map.size() <= k) {
					max_length = Math.max(max_length, j - i);
					//fSystem.out.println(max_length);
				} else if (map.size() > k) {
					break;
				}
				if (map.containsKey(s.charAt(j))) {
					//System.out.println(map);
					map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
				} else {
					map.put(s.charAt(j), 1);
				}
			}
		}
		return max_length;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbccd";
		int ans = printLongestSubLength(s, 2);
		System.out.println(ans);

	}

}
