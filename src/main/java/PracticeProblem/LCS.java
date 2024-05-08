package PracticeProblem;



public class LCS {

	static int lcs(int nums[], int n) {
		int sum1 = 0;
		int sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < nums.length; i++) {
			sum1 = sum1 + nums[i];
		}
		return sum - sum1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 5 };
		int N = arr.length;
		System.out.println(lcs(arr, N));

	}

}
