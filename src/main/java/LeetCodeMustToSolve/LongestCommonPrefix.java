package LeetCodeMustToSolve;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		//Arrays.sort(strs, Comparator.comparingInt(String::length));
		// int count =0;
		Arrays.sort(strs,Comparator.comparingInt(String::length));
		int j = 0;
		while (j < strs[0].length()) {
			for (int i = 1; i < strs.length; i++) {
				if (j == 0 && strs[i].charAt(j) != strs[i - 1].charAt(j)) {
					return "";
				}
				if(j>=1 && strs[i].charAt(j) != strs[i - 1].charAt(j)) {
					return strs[0].substring(0, j);
				}
			}
			j++;

		}
		return strs[0].substring(0, j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs[] = { "ab", "a" };
		System.out.println(longestCommonPrefix(strs));

	}

}
