package Bronze_V;

//https://www.acmicpc.net/problem/2338

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex_2338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in_A = sc.next();
		String in_B = sc.next();
		
		//BigDecimal ��ü ������ double�� �����ڿ� ������ X
		//double���� String ���ڿ��� ������ O
		BigDecimal A = new BigDecimal(in_A);
		BigDecimal B = new BigDecimal(in_B);
		
		
		System.out.println(A.add(B)); //A+B
		System.out.println(A.subtract(B)); //A-B
		System.out.println(A.multiply(B)); //A*B

		sc.close();
	}
}
