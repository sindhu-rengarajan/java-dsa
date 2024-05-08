package LeetCodeMustToSolve;

public class BinarySubarrays {

	public static int solve(int[] a, int goal) {
		int l = 0;
		int r = 0;
		int sum = 0;
		int count = 0;
		int n = a.length;

		while (r < n) {

			sum = sum + a[r];
			while (sum > goal) {
				sum = sum - a[l];
				l++;
			}

			count = count + (r - l + 1);

			r++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 0, 0, 1, 1, 0 };
		int k = 2;
		int ans = solve(a, k) - solve(a, k - 1);
		System.out.println(ans);

	}

}
