package LeetCodeMustToSolve;

import java.util.Arrays;

public class CountTypeOfChar {

	public static int[] countChar(String s) {
		int upper = 0;
		int lower = 0;
		int num = 0;
		int special = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upper++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lower++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num++;
			} else
				special++;
		}
		int[] a = { upper, lower, num, special };
		return a;

	}

	public static void main(String[] args) {
		String s = "#GeeKs01fOr@gEEks07";
		System.out.println((Arrays.toString(countChar(s))));

	}

}
