package LeetCodeLatest;

public class ShortestAndLongestWord {

	static void findSmallestLongestWord(String s) {
		String[] s1 = s.split(" ");
		int n = s1.length;
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;

		for (int i = 0; i < n; i++) {
			String k = s1[i];
			int x = k.length();
			if (x < min) {
				min = x;
				minIndex = i;
			}
			if (x > max) {
				max = x;
				maxIndex = i;
			}
		}

		System.out.println("min word: " + s1[minIndex]);
		System.out.println("max word: " + s1[maxIndex]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findSmallestLongestWord("My name isa Sindhuuu");

	}

}
