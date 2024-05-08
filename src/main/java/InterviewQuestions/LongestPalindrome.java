package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

	public static String longestPalindrome(String s) {
		int n = s.length();
		int maxlength = 0;
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String sub = "";
			for (int j = i; j < n; j++) {
				sub = sub + s.charAt(j);
				if (pal(sub)) {
					maxlength = Math.max(maxlength, sub.length());
					li.add(sub);
				}

			}
		}

		for (String s1 : li) {
			if (s1.length() == maxlength) {
				return s1;
			}
		}

		return "";
	}

	public static boolean pal(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l <= r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = longestPalindrome("ababad");
		System.out.println(ans);

	}

}
