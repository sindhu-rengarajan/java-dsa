package LeetCodeMustToSolve;

import java.util.Arrays;

public class SumZero {
	
	public static int[] smZero1(int n) {
		int m=-(n/2);
		int arr[] =new int[n];
		if(n/2!=0) {
			for(int i=0;i<n;i++) {
				arr[i]=m;
				m++;
			}
		}
		else{
				for(int i=0;i<n;i++) {
					if(m==0) {
						m++;
					}
					arr[i]=m;
					m++;
					
				}
		}
			
		return arr;
		
	}
	
	public static int[] smZero2(int n) {
		
		int arr1[] =new int[n];
		
		for(int i=0;i<n;++i) {
			System.out.println(i);
		arr1[i] = i*2-n+1;
			
		}
		return arr1;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(smZero2(4)));
		int g = 3;
		 System.out.print(++g * 8);

	}

}
