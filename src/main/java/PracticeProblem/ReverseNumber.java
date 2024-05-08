package PracticeProblem;

import java.util.Scanner;

public class ReverseNumber {

	public static int rev(int n) {
		int rem = 0;
		int temp = 0;

		while (n > 0) {
			rem = n % 10;
			temp = temp * 10 + rem;
			n = n / 10;
		}
		return temp;

	}

	public static StringBuffer usingBuffer(int n) {
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		return sb.reverse();

	}

	public static StringBuilder usingBuilder(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		return sb.reverse();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(usingBuilder(3267));

	}

}
