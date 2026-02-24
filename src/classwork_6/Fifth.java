package classwork_6;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number from 1 to 9");
		int r = s.nextInt();
		System.out.println("Enter second number from 1 to 9");
		int n = s.nextInt();
		
		System.out.println(n * r);
	}
}
