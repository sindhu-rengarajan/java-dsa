package LeetCodeMustToSolve;

public class ConverRevStr {

	public static String convRevStr(String s1, String s2) {
		s1 = s1.concat(s2);
		int n = s1.length();
		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			sb.append(s1.charAt(i));
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Sindhu";
		System.out.println(convRevStr(s1, s2));

	}

}
