package Bronze_V;

// https://www.acmicpc.net/problem/1550
// Hex to Decimal

import java.util.Scanner;

public class Ex_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int output = Integer.parseInt(input, 16); // Hex to Decimal
		
		System.out.println(output);
		
		sc.close();
		
	}
}
