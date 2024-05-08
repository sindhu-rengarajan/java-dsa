package LeetCodeMustToSolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int[][] merge(int[][] intervals) {
	        
	        
	        if(intervals.length<=1){
	            return intervals;
	        }
	        
	        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
	        List<int[]> result = new ArrayList<>();
	        int[] newInterval = intervals[0];
	        result.add(newInterval);
	        
	        for(int[] i:intervals){
	            if(newInterval[1]>=i[0]){
	                newInterval[1]=Math.max(newInterval[1],i[1]);
	            }
	            else{
	            newInterval=i;
	            result.add(newInterval);
	            }
	        }
	        return result.toArray(new int[result.size()][]);
	        
	    }
	    
	}


