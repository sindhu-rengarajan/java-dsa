package LeetCodeLatest;

import java.util.Collections;
import java.util.List;

public class NextLexPermutation {
	
	public static void set(List<Integer> a) {
		int n =a.size();
		int ind =-1;
		for(int i=n-2;i>=0;i--) {
			if(a.get(i)<a.get(i+1)) {
				ind = i;
				break;
			}
		}
		
		if(ind == -1) {
			Collections.reverse(a);
		}
		
		for(int i=n-1;i>ind;i--) {
			if(a.get(i)>a.get(ind)) {
				int temp =a.get(i);
				a.set(i, a.get(ind));
				a.set(ind, temp);
			}
		}
		
		List<Integer> b = a.subList(ind+1, n);
		Collections.reverse(b);
		
	}

}
