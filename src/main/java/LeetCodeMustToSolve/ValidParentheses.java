package LeetCodeMustToSolve;

import java.util.Stack;

public class ValidParentheses {

	public static boolean validBraces(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.peek();

				if ((c == '}' && top == '{') || (c == ']' && top == '[') || (c == ')' && top == '(')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "({{}}))";
		System.out.println(validBraces(s));

	}

}
