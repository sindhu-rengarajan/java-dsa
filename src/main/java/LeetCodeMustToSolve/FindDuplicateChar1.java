package LeetCodeMustToSolve;

public class FindDuplicateChar1 {

	// sindhujaRengarajansindhujaRengarajan

	public static int findnthDuplicate(String s) {
		int n = s.length();
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s.charAt(i) == s.charAt(j) & j < index) {
					index = j;
					break;

				}

			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = findnthDuplicate("sindhujaRengarajansindhujaRengarajan");
		System.out.println(ans);

	}

}
