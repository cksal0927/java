package java0627;

public class Bitop {

	public static void main(String[] args) {

		// 연산자
		// 정수와 정수를 연산하면 결과는 정수
		// 정수와 실수를 연산하면 결과는 실수
		
		// 산술연산자 : +, -, *, /(몫), %(나머지)
		
		System.out.println(10/(float)4);
		System.out.println(10%4);

		// 증감연산자 : ++, --
		// 대입연산자 : =
		// 복합대입연산자 : +=, -=, *=, /=, %=
		int a = 10;
		a += 3;  // a = a + 3
		
		// 비교연산자 : >, <, >=, <=, ==, !=
		// 비교연산자는 숫자만 가능
		System.out.println(10==20);
		System.out.println(10==3.4);
		String name1 = "이순신";
		String name2 = "김유신";
		System.out.println(name1.equals(name2));
		
		// 논리연산자 : &&, ||, !
		// 조건연산자 : (조건식) ? 참내용 : 거짓내용 ;
		
		// 비트연산자
		// 비트 논리연산자 - &, |, ~, ^
		// 비트 시프트연산자 - >>, <<
		
		// << 2의 n승 구할 때
		System.out.println(1<<20);
		
		// >> 2의 n승만큼 나눌 때
		System.out.println(1024>>3);  // 1024에 2의 3승 나누기
		
		int red = 188;
		int green = 229;
		int blue = 92;
		int color = (red<<16) | (green<<8) | blue;
		
		System.out.printf("#%06X \n", color);
		// rgb 값을 헥사코드로 변환
	}

}
