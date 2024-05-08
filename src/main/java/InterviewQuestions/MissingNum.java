package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MissingNum {

	public static void test(int[] a, int[] b) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer> ();
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i:a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			map.put(i, 1);
		}
		
		for(int i:b) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)-1);
				if(map.get(i)==0) {
					map.remove(i);
				}
			}
		}
		
		for(Map.Entry<Integer,Integer> eset: map.entrySet()) {
			while(eset.getValue()>0) {
				arr.add(eset.getKey());
				map.put(eset.getKey(),eset.getValue()-1);
			}
			
		}
		System.out.println(arr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 2, 5, 4, 6, 3, 5, 3 };
		int[] b = { 7, 2, 4, 6 };

		test(a, b);

	}

}
