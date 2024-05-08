package LeetCodeMustToSolve;

public class SubstringContain3Character {

	public static int solve(String s) {

		int n = s.length();
		int count = 0;
		int[] lastseen = { -1, -1, -1 };

		for (int i = 0; i < n; i++) {
			lastseen[s.charAt(i) - 'a'] = i;
			if (lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1) {
				count = count + (1 + min(lastseen[0], lastseen[1], lastseen[2]));
			}
		}
		return count;

	}

	public static int min(int a, int b, int c) {
		int ans = Math.min(a, b);
		ans = Math.min(ans, c);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="aabcbba";
		int ans = solve(s);
		System.out.println(ans);

	}

}
