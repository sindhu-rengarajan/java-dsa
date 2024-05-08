package LeetCodeMustToSolve;

public class LongestSubstring_Method1 {

	static int printLongestSubstring(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int max_length = -1;
		int count = 0;
		int j = 0;

		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] == ch2[j]) {
				count++;
			}

			if (j == ch2.length - 1 && ch1[i] != ch2[j]) {
				Math.max(max_length, count);
				count = 0;
			}

			if (j == ch2.length - 1) {
				j = 0;
			}
			j++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = printLongestSubstring("abcdefacbccbagfacbacer", "abc");
		System.out.println(count);

	}

}
