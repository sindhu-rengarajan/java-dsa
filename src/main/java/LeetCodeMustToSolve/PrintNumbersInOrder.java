package LeetCodeMustToSolve;
import java.util.Arrays;

public class PrintNumbersInOrder {

	// 1,2,4,4,5,6,7,9,10,11,4

	static int[] solve(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				a[i] = i + 1;
			}
		}

		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 4, 5, 6, 7, 9, 10, 11, 4 };
		int[] ans = solve(a);
		System.out.println(Arrays.toString(ans));
	}

}
