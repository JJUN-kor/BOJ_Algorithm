package Bronze_V;
// https://www.acmicpc.net/problem/2475

import java.util.Scanner;
import java.math.*;


public class Ex_2475 {
	public static void main(String[] args) {
		int num = (int) (Math.random()*99999); // 0~99999 난수 (고유번호) 생성
		System.out.println(num);
		String tmp = Integer.toString(num); // 정수 -> 문자열
		
		int powNum = 0; 
		
		for (int i=0; i<tmp.length(); i++) {
			//System.out.println(tmp.charAt(i) - '0'); //Char to Int (1)
			//Character.getNumericValue(tmp.charAt(i)); // char to Int (2)
			powNum += (tmp.charAt(i)-'0')*(tmp.charAt(i)-'0');
			System.out.println(powNum);
		}
		
		int auth_num = powNum%10; // 검증수
		
		System.out.println(auth_num);
		
		
	}
}
