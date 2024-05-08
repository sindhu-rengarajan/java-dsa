package LeetCodeMustToSolve;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		int temp=x;
		int rem=0;
		int rev=0;
		while(temp!=0) {
			rem= temp%10;
			rev= rev*10+rem;
			temp=temp/10;
		}
		return match(rev,x);
	}
	
	public static boolean match(int rev,int orig) {
		return orig == rev?true:false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1112111));

	}

}
