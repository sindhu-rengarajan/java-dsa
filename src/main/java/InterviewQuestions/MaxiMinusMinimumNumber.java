package InterviewQuestions;

public class MaxiMinusMinimumNumber {

	public static int printMaximumMinusMinimum(int[] a) {

		int n = a.length;
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < n; i++) {
			if (a[i] > a[maxIndex]) {
				maxIndex = i;
			}
			if (a[i] < a[minIndex]) {
				minIndex = i;
			}
		}

		return a[maxIndex] - a[minIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 7, 10, 1 };

		int ans = printMaximumMinusMinimum(a);
		System.out.println(ans);
	}

}
