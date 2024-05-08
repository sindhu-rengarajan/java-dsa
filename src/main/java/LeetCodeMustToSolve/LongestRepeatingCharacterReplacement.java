package LeetCodeMustToSolve;

public class LongestRepeatingCharacterReplacement {

	public static int solve(String s, int k) {
		int[] arr = new int[26];
		int l = 0, r = 0, maxFreq = 0, res = 0;
		int n = s.length();
		while (r < n) {
			arr[s.charAt(r) - 'A']++;
			maxFreq = Math.max(maxFreq, arr[s.charAt(r) - 'A']);
			int len = r - l + 1;
			if (len - maxFreq > k) {
				arr[s.charAt(l) - 'A']--;
				l++;
			}
			res = Math.max(res, len);
			r++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAABBCCD";
		int k = 2;
		System.out.println(solve(s, k));

	}

}
