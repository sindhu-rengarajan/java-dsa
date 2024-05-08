package LeetCodeMustToSolve;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,6,8,9,12,34,67,89,90};
		int target = 12;
		int ans = binSearch(arr,target,0,arr.length-1);
		System.out.println(ans);

	}
	
	static int binSearch(int[] arr, int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int m = (s+e)/2;
		if(target==arr[m]) {
			return m;
		}
		else if(target <arr[m]) {
			return binSearch(arr,target,s,m-1);
		}
	
		return binSearch(arr,target,m+1,e);
	
		
	}

}
