package Bronze_V;

// https://www.acmicpc.net/problem/1001
import java.util.Scanner;

public class Ex_1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,result;
		
		A = sc.nextInt();
		B = sc.nextInt();
		result = A-B;
		
		System.out.println(result);
		
		sc.close();
	}
}
