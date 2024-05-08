package LeetCodeLatest;

public class NumberAppearsOnce {

	public static int findNumber(int[] a) {
		int n = a.length;
		int xorr = 0;
		for (int i = 0; i < n; i++) {
			xorr = xorr ^ a[i];
		}
		return xorr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 2, 3, 3, 3, 2 };
		System.out.println(findNumber(a));

	}

}
