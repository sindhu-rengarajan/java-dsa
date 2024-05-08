package InterviewQuestions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class TopNKeys {
	
	public static List<Entry<String, Integer>> topNKeys(Map<String, Integer> map, int n) {
		  Set<Integer> topValues = getTopValues(map, n);
		  return getEntriesWithTopValues(map, topValues);
		}
	
	private static Set<Integer> getTopValues(Map<String,Integer> map, int n) {
		TreeSet<Integer> values = new TreeSet<Integer>(map.values());
		Set<Integer> topNValues = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			Integer v= values.pollLast();
			System.out.println(v);
			if(v!=null)
				topNValues.add(v);
					
			else
				break;
						
		}
		System.out.println(topNValues);
		return topNValues;
		
		
	}
	
	private static List<Entry<String, Integer>> getEntriesWithTopValues(Map<String, Integer> map, Set<Integer> topValues) {
		  List<Entry<String, Integer>> result = new ArrayList<> ();
		  for (Entry<String, Integer> e : map.entrySet()) {
		    if (topValues.contains(e.getValue())) result.add(e);
		  }

		  Collections.sort(result, new Comparator<Entry<String, Integer>>() {
		    @Override
		    public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		      return e1.getValue().compareTo(e2.getValue());
		    }
		  });

		  return result;
		}

	

public static void main(String[] args) {
	Map<String,Integer> m = new HashMap<>();
	m.put("zip000", 1234);
	m.put("zip001", 1555);
	m.put("zip002", 5555);
	m.put("zip003", 2344);
	m.put("zip004", 4453);
	m.put("zip005", 5632);
	m.put("zip006", 9754);
	
	
	
	System.out.println(topNKeys(m,3));
	
}
}
	
	

