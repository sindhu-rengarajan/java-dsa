package LeetCodeMustToSolve;

import java.util.Arrays;

public class plusOneLargeInteger {
	
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for(int i=n-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		digits = new int[n+1];
		digits[0]=1;
		return digits;
	}

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}

}
