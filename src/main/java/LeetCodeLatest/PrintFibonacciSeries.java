package LeetCodeLatest;

public class PrintFibonacciSeries {

//print fib series of 10
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < 10; i++) {
			int sum = n1 + n2;
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = sum;

		}

	}

}
