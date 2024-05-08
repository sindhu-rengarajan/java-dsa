package LeetCodeMustToSolve;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static int rmDuplicates(int[] nums) {
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[j]>nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
		System.out.println(Arrays.toString(nums));
		return i+1;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2};
		System.out.println(rmDuplicates(nums));

	}

}
