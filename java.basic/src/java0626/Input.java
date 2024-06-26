package java0626;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
//		System.out.println("자바 출력");
		// System.in - 입력
		// 입력 받을 수 있는 내장 클래스 - Scanner
		Scanner scan = new Scanner(System.in);
		
		// float 타입 - nextFloat(), double = nextDouble()
		// byte - nextType(), short - nextShort()
		// char는 없다. (문자열)
		// 문자열 입력 - nextLine(), next()
		
//		System.out.print("정수 입력 : ");
//		int a = scan.nextInt();
//		System.out.println(a);
		
		// 철수가 점심을 먹기 위해 편의점에 갔다.
		// 대게라면과 삼각김밥, 바나나우유를 먹었다.
		// 철수가 점심값으로 지불한 금액은 얼마인가?
//		System.out.print("대게라면 금액 : ");
//		int 대게라면 = scan.nextInt();
//		System.out.print("삼각김밥 금액 : ");
//		int 삼각김밥 = scan.nextInt();
//		System.out.print("바나나우유 금액 : ");
//		int 바나나우유 = scan.nextInt();
//		int 점심값 = 대게라면 + 삼각김밥 + 바나나우유;
//		System.out.println("점심값으로 지불한 금액 : " + 점심값 + "원");
		// System.out.printf("점심값 : %d원 \n", 점심값);

		// 민수가 친구들을 만나기 위해 나왔다.
		// 나와서 보니 지갑을 놓고 와서 집에 갔다 왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다 왔더.
		// 민수의 집은 5층이다.
		// 민수가 한 층 올라가거나 내려오는 데에 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는 데 걸린 총 시간은?
		int 층 = 4;
		float 시간 = 3.4f;
		int 편도횟수 = 4;
		float 편도시간 = 층 * 시간;
		float 총시간 = 편도횟수 * 편도시간;
		System.out.println("총 시간 : " + 총시간 + "초");
		
		// 프로그램 코드는 기본 순차적으로 진행된다.
		// if, 함수(메서드), 반복문
		
		/*
		 데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓)
		 데이터 타입
		 	정수 - byte, short, int, long
		 	문자 - char
		 	실수 - float, double
		 	참거짓 - boolean
		 
		 변수 선언 방법
		 int num;  정수 타입 변수 선언
		 double dnum;  실수 차입 변수 선언
		 char ch;  문자 타입 변수 선언
		 boolean bool;  참거짓 번수 선언
		 
		 변수의 초기화
		 int num= 10;  변수 선언과 함게 데이터를 저장
		 
		 출력 방법
		 System.out.println( 출력내용 );
		 System.out.print( 출력내용 );
		 System.out.printf( 출력내용 );
		 
		 printf 사용시 함께 사용하는 형식 지정자
		 	%d, %u - 정수
		 	%f - 실수
		 	%c - 문자
		 	%s - 문자열
		 	
		 int age = 28;
		 System.out.printf("%s 마을의 나이가 %d살인 폭군 지도자 %c씨", "코딩빌", age, '박');
		 
		 입력 방법
		 Scanner 클래스 객체 필요
		 Scanner 변수 = new Scanner(System.in);
		 	*Scanner 클래스는 내장 외부 클래스이므로 import 해야 한다.
		 	
		 변수.nextInt();  int 타입 정수만 입력
		 변수.nextByte();  byte 타입 정수만 입력
		 변수.nextShort();  short 타입 정수만 입력
		 변수.nextLong();  long 타입 정수만 입력
		 변수.nextFloat();  float 타입 실수만 입력
		 변수.nextDouble();  double 타입 실수만 입력
		 변수.next();  문자열 입력
		 변수.nextLine();  문자열 입력
		*/
		
		 // c언어, 자바, 건축학개론 시험 성적을 입력하세요.
		 // 세 과목의 총점과 평균을 각각 출력하세요
		 System.out.print("c언어 성적 : ");
		 int c언어 = scan.nextInt();
		 System.out.print("자바 성적 : ");
		 int 자바 = scan.nextInt();
		 System.out.print("건축학개론 성적 : ");
		 int 건축학개론 = scan.nextInt();
		 
		 int 총점 = c언어 + 자바 + 건축학개론;
		 int 평균 = 총점/3;
		 
		 System.out.printf("총점 : %d점, 평균 : %d점 \n", 총점, 평균);
		
	}

}
