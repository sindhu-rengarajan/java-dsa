package LeetCodeMustToSolve;

import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int nums[], int val) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("i value is "+i);
			System.out.println("count= "+ count+",count value is "+nums[count]);
			if (nums[i] == val) {
				nums[count] = nums[i + 1];
			}
			else {
			nums[++count] = nums[i + 1];}
		}
		//System.out.println(Arrays.toString(nums));
		if (nums[count] == val) {
			count--;
		}
		return count+1;

	}

	public static void main(String[] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val =2;
		System.out.println(removeElement(nums,val));
	}

}
