package LeetCodeLatest;

import java.util.ArrayList;
import java.util.List;

public class ReturnStringArrayIncreasingOrder {
	
	static void solve(String s) {
		
		char[] ch = s.toCharArray();
		int n = s.length();
		List<String> l1 = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n-1;i++) {
			if(ch[i+1]-ch[i]!=1) {
				sb.append(ch[i]);
				l1.add(sb.toString());
				sb.delete(0,i+1);
			}

			if(ch[i+1]-ch[i]==1) {
				sb.append(ch[i]);
			}
			
		}
		sb.append(ch[n-1]);
		l1.add(sb.toString());
		System.out.println(l1);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABCDDefgAFDhijk";
		solve(s);

	}

}
