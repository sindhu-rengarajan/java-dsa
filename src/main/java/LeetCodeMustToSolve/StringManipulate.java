package LeetCodeMustToSolve;

//input string = aabbbcccca
//output a2b3c4a1
public class StringManipulate {

	static void solve(String s) {
		char[] ch = s.toCharArray();
		int n = ch.length;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (ch[i - 1] == ch[i]) {
				count++;

			} else if (ch[i - 1] != ch[i]) {
				System.out.print(ch[i - 1]);
				System.out.print(count);
				count = 1;
			}
			if (i == n - 1) {
				System.out.print(ch[n - 1]);
				System.out.print(count);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve("aabbbcccca");

	}

}
