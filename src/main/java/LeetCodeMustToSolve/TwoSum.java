package LeetCodeMustToSolve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums,int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			if(map.containsKey(complement)) {
				return new int[] {i,map.get(complement)};
			}
			map.put(nums[i], i);
		}
		
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,11,15,7};
		
		System.out.println(Arrays.toString(twoSum(nums,9)));

	}

}
