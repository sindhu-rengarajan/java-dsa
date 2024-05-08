package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class SortArrayLexographically {
	// You are given an array of strings , with only two kind of values “apples” ,
	// “oranges” .
	// Sort the array lexicographically. e.g [“oranges”, “apples”, “apples”,
	// “oranges”, “apples”] ->
	// [“apples”, “apples”, “apples”, “oranges”, “oranges”]

	public static String[] sortString(String[] str) {
		// HashMap<String,Integer> map = new HashMap<>();
		
		
		Arrays.sort(str);
		int appleCount = 0;
		int orangeCount = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("apples")) {
				appleCount++;
			} else {
				orangeCount++;
			}

		}
		for (int i = 0; i < (appleCount + orangeCount); i++) {
			if (i < appleCount) {
				str[i] = "apples";
			} else {
				str[i] = "oranges";
			}
		}

		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "oranges", "apples", "apples", "oranges", "apples" };
		System.out.println(Arrays.toString(sortString(str)));

	}

}
