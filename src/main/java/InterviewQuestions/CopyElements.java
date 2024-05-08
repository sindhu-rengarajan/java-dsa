package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyElements {
	
	public static List<String> copyEle(List<String> str, int n) {
		List<String> result1= null;
		result1 = new ArrayList<String> ();
		for(int i =0;i<n;i++) {
			if(str.get(i).length()>3) {
				result1.add(str.get(i));
			}
		}
		return result1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<String>(Arrays.asList("3","Apple","Boy","Netw"));
		System.out.println(copyEle(str,4));

	}

}
