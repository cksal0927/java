package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {

		// 정수 두 개 입력 받아 합 출력하기
		Calc calc = new Calc();
		calc.sum(40, 10);
		
		// calc.sum();
		
		// 세 과목의 총점을 구하여 출력하기
		int kor=89, eng=74, mat=43;
		calc.object(kor, eng, mat);
		
		// 메서드 호출하여 "메서드 dog쉽네~" 출력하기
		calc.dog();
		
		calc.view();  // view 메서드 호출
		
		// 메서드를 호출하여 이름과 나이 출력하기
		// 매개변수 없는 메서드, 키보드를 입력 X
		calc.me();
		
		// 메서드를 호출하여 아래의 데이터 출력하기
		String animal = "골든리트리버";
		String 공고일 = "2024-07-01";
		
		TestMethod test = new TestMethod();
		test.golden(animal, 공고일);
		
		// 다음 날짜 중에서 월과 일만 출력하기
		// 문자열 메서드 substring 또는 split 사용
		String examDate = "2024-08-13";
		test.date(examDate);
		
		// 네 사람의 나이 평균값을 구하여 출력하기
		// 평균값은 정수
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		test.soccer(흥민, 강인, 희찬, 재범);
	}
}

// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스 변수는 클래스 이름으로 사용

class Calc{
	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("합 : " + result);
	}
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("합 : " + result);
	}
	
	void object(int k, int e, int m) {
		int total = k + e + m;
		System.out.println("세 과목의 총점 : " + total);
	}
	
	void dog() {
		System.out.println("메서드 dog쉽네~");
	}
	
	void view() {  // 변수 a, b의 값 출력하는 메서드
		int a=10, b=20;
		System.out.println(a + ", " + b);
	}
	
	void me() {
		String name = "박찬미";
		int age = 22;
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
}

class TestMethod{
	void golden(String dog, String date) {
		System.out.println("강아지 이름 : " + dog + "\n공고일 : " + date);
	}
	
	void date(String testDate) {
		System.out.println("월 : " + testDate.substring(5, 7) + "\n일 : " + testDate.substring(8, 10));
		
		// String[] current = testDate.split("-");
		// System.out.println("월 : " + current[1] + "\n일 : " + current[2]);
	}
	
	void soccer(int hm, int ki, int hc, int jb) {
		int ageAvg = (hm + ki + hc + jb)/4;
		System.out.println("나이 평균 : " + ageAvg);
	}
}