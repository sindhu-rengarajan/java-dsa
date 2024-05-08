package LeetCodeMustToSolve;

import java.util.Arrays;

public class MajorityElement {
	
	public static int majElement(int[] nums) {
		
		int n=nums.length;
		Arrays.sort(nums);
		return nums[n/2];
	}

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majElement(nums));

	}

}
