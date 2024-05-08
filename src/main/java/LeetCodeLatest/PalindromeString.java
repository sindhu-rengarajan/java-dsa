package LeetCodeLatest;

public class PalindromeString {
	
	static boolean isPalindrome(String s) {
		
		int n = s.length();
		int l= 0;
		int r=n-1;
		while(l<=r) {
			if(!(s.charAt(l)==(s.charAt(r)))){
				return false;
			}
			l++;
			r--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("madamm"));

	}

}
