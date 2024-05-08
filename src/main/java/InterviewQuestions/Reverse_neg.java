package InterviewQuestions;

public class Reverse_neg {

	public static int reverse(int x) {
		long rev = 0;
		int temp = x;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		
		if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
			return 0;
		}
		return (int)rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = reverse(-2132145);
		System.out.println(ans);

	}

}
