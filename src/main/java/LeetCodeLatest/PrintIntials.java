package LeetCodeLatest;

public class PrintIntials {

	static void printShortFormName(String s) {
		String s1[] = s.split(" ");
		int n = s1.length;
		for (int i = 0; i < n - 1; i++) {
			String k = s1[i];
			char ch = k.charAt(0);
			System.out.print(ch + ".");
		}
		System.out.print(s1[n - 1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printShortFormName("Ram Kumar Paul Mani");
	}

}
