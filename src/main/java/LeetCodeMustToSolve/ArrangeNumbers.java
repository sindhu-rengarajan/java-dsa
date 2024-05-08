package LeetCodeMustToSolve;

import java.util.Arrays;

public class ArrangeNumbers {

	public static int[] arrangenum(int[] nums) {
		
		Arrays.sort(nums);
		//int temp[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == i) {
					nums[i] = i;
					break;
				} else {
					nums[i] = -1;
				}
			}

		}

		return nums;

	}

	public static void main(String[] args) {
		int nums[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		System.out.println(Arrays.toString(arrangenum(nums)));

	}

}
