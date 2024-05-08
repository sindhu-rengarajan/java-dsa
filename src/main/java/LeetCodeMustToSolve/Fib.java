package LeetCodeMustToSolve;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fibo(4);
		System.out.println(ans);

	}
	
	static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
