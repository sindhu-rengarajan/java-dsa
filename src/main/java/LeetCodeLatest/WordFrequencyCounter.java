package LeetCodeLatest;

public class WordFrequencyCounter {
	static void frequencyCount(String s, String f) {

		s = s + " ";
		int l = s.length();
		char a;
		int c = 0;
		String s1 = "";
		for (int i = 0; i < l; i++) {
			a = s.charAt(i);
			if (a != ' ') {

				s1 = s1 + a;
			} else {
				if (s1.equalsIgnoreCase(f) == true) {
					c++;
				}
				s1 = "";
			}
		}
		System.out.println("Frequency of the word " + f + " is " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sindhu sindhu sindhu";
		String f = "sindhu";
		frequencyCount(s, f);

	}

}
