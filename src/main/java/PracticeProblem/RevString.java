package PracticeProblem;

public class RevString {

	public static StringBuilder revString(String str) {
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			char c = str.charAt(i);
			sb.append(c);

		}
		return sb;
	}
	
	public static String revStringWithoutsb(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revStringWithoutsb("sfsfssrerq"));

	}

}
