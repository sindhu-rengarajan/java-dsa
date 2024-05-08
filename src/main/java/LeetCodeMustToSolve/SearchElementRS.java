package LeetCodeMustToSolve;

public class SearchElementRS {
	
	static int find(int[] arr, int target, int n) {
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[low]<=arr[mid]) {
				if(arr[low] <= target && target <= arr[mid]) {
					high= mid-1;
				}
				else {
					low = mid+1;
				}
				
			}
			else{
				if(arr[mid]<=target && target<= arr[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
				
				
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {7,8,9,1,2,3,4,5,6};
		int n= 9;
		int x = find(arr,3,n);
		System.out.println(x);
		

	}

}
