package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		// 반복문 - for, while, do~while
		// for(초기값; 조건식; 증감식){ 반복내용 }
		// 조건식이 거짓이 될 때까지 중괄호 안의 내용이 계속 실행
		// 초기값 -> 조건식 비교 -> 참 -> 중괄호 -> 증감식
		// -> 조건식 비교 -> 참 -> 중괄호 -> 증감식
		// -> 조건식 비교 -> 거짓 -> 종료
		
//		for(int i=0; i<=17; i++) {
//			if( i%2 == 1 ) {
//				System.out.println("아... 반복문..." + i);
//			}
//		}
		
//		int num = 1;
//		int a = 1;
//		num = num + a;
//		System.out.println(num);  // 2
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 7
//		a++;
		
//		int num = 1;
//		for(int a=1; a<=100; a++) {
//			num += a;
//			System.out.println(num);
//		}
		
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("총합 : " + sum);
	}
}
