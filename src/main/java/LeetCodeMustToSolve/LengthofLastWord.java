package LeetCodeMustToSolve;

public class LengthofLastWord {
	
	public static int lastWordlength(String s) {
		String s1[] = s.split(" ");
		int n=s1.length;
		
		return s1[n-1].length();
	}

	public static void main(String[] args) {
		System.out.println(lastWordlength("Hello world"));

	}

}
