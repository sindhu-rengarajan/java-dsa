package LeetCodeMustToSolve;
import java.util.Stack;

public class RemoveOuterParanthesis {

	public static String solve1(String s) {
		Stack<Character> st = new Stack<Character>();
		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				st.pop();
			}
			if (!st.isEmpty()) {
				ans = ans + s.charAt(i);
			}

			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));

			}
			System.out.println(st);

		}
		return ans;

	}

	static String solve3(String s) {
		int l = 0, r = 0;
		char[] arr = s.toCharArray();
		while (r < arr.length) {
			if (s.charAt(r) == ' ') {
				reverse(arr, l, r - 1);
				l = r + 1;

			}
			r++;
		}

		reverse(arr, l, r - 1);
		return new String(arr);

	}

	static void reverse(char[] arr, int l, int r) {
		while (l < r) {
			char temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
	}

	public static String solve2(String s) {
		int count = 0;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				count--;
			}
			if (count != 0) {
				ans = ans + s.charAt(i);
			}
			if (s.charAt(i) == '(') {
				count++;
			}

		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "((()))(()())";
		String ans = solve1(s);
		System.out.println(ans);
		String s1 = "Welcome to my box";
		System.out.println(solve3(s1));

	}

}
