package LeetCodeMustToSolve;

public class Print_LastName_FirstName {

	// Sachin Tendulkar

	public static void reverseString(String s) {
		String s1[] = s.split(" ");
		int n = s1.length;
		System.out.print(s1[n - 1] + " , ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(s1[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseString("Sachin Ramesh Tendulkar");

	}

}
