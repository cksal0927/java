package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 코드를 작성하기 전 해야 할 일 - 문제 파악, 요구사항 도출
		 문자열 - "" 큰 따옴표로 표현하여 작성
		 문자열은 String 클래스 타입 사용
		 
		 문제 2.
		 직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 세금은 8%를 낸다.
		 실수령액은 얼마인가?
		 이름, 부서, 실수령액을 두 명의 직원에 대해 출력한다.
		*/
		float 세금 = 0.08f;
		
		String 이름1, 부서1;
		int 월급1;
		System.out.print("이름1 : ");
		이름1 = scan.next();
		System.out.print("부서1 : ");
		부서1 = scan.next();
		System.out.print("월급1 : ");
		월급1 = scan.nextInt();
		
		String 이름2, 부서2;
		int 월급2;
		System.out.print("이름2 : ");
		이름2 = scan.next();
		System.out.print("부서2 : ");
		부서2 = scan.next();
		System.out.print("월급2 : ");
		월급2 = scan.nextInt();
		
		float 실수령액1, 실수령액2;
		실수령액1 = 월급1 * (1-세금);
		실수령액2 = 월급2 * (1-세금);
		
		System.out.printf("직원1의 이름 : %s, 부서: %s, 실수령액: %.0f만 원 \n", 이름1, 부서1, 실수령액1);
		System.out.printf("직원2의 이름 : %s, 부서: %s, 실수령액: %.0f만 원", 이름2, 부서2, 실수령액2);
	}

}
