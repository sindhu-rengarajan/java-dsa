package InterviewQuestions;

import java.util.HashSet;

public class LengthOfLongestSubstring12 {
	public static int lengthOfLongestSubstring(String s) {

		int n = s.length();
		int maxLength = 0;
		if (n <= 1) {
			return n;
		}

		for (int i = 0; i < n; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = i; j < n; j++) {
				if (set.contains(s.charAt(j))) {
					break;

				} else {
					set.add(s.charAt(j));
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}

		return maxLength;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = lengthOfLongestSubstring("abcabcdbb");
		System.out.println(ans);

	}

}
