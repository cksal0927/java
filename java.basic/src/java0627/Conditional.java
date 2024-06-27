package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 조건문 - if, switch
		// 반복문 - for, while, do~while
		
		// if문의 조건식 - 비교연산자와 논리연산자로 식을 만든다.
		// 즉, 참과 거짓이 나올 수 있는 식
		// 키가 150 이상  키 >= 150
		// 10월의 지출 내역  전체지출날짜 월 == 10
		// 32000원 이상의 지출 내역  지출금 >= 32000
		// 판매 중인 상품들만 출력  상품상태 == 판매, 재고수량 > 0
		
		int tall = 135;
		if( tall >= 150 ) {
			// 키가 150 이상이 맞다면 무엇을 할 것인지
		}else {
			// 키가 150 이상이 아니라면 무엇을 할 것인지
		}
		
		// 시험 합격 기준 - 합격(60점 이상), 불합격(60점 미만)
		int score = 72;
		if( score >= 60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// if ~ else - 조건식이 참, 거짓에 따라 실행되는 내용이 다른 경우
		// 하나의 조건에 두 개의 내용이 있는 경우에 if ~ else 구조로 작성
		
		// 시험 성적 등급 - A(90점 이상), B(80점 이상), C(70점 이상), D(나머지)
		score = 89;
		if( score >= 90 ) {
			System.out.println("A");
		}else if( score >= 80 ){
			System.out.println("B");
		}else if( score >= 70 ) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		// switch - 실행 조건을 case로 설정하여
		// case와 일치하는 값일 경우 박동되는 조건문
		
		// 지렁이 게임을 만든다.
		// 방향기 - w, a, s, d
		// 일시정지 - p 
		// 계속하기 - o
		// 처음부터 다시 지작 - i
		// 게임 시작 - ctrl+s
		/*
		 switch(키보드값){
		 case 'a' : 실행내용
		 case 'w' : 실행내용
		 case 's' : 실행내용
		 case 'd' : 실행내용
		 case 'p' : 실행내용
		 case 'o' : 실행내용
		 case 'i' : 실행내용
		 case 'ctrl' : 실행내용
		 	switch(키2){
		 		case 's' : 실행내용
		 	}
		 }
		 
		 프로그램의 메뉴 구성
		 switch(menu){
		 	case 'open' :
		 	case 'save' : 
		 	case 'build' :
		 	case 'git' :
		 	case 'exit' :
		 }
		 
		 조건식이 == 연산자가 사용된다면 switch으로 작성하는 것을 고려해보기
		*/
		
		// 시작 버튼을 클릭하면 게임을 시작하고
		// 종료 버튼을 클릭하면 게임을 종료하고
		// 저장 버튼을 클릭하면 게임을 저장해라
		String button = "종료";
		
		switch( button ) {
			case "시작" :
				System.out.println("게임 시작");
				break;
			case "저장" :
				System.out.println("게임 저장");
				break;
			case "종료" :
				System.out.println("게임 종료");
		}
		
		// 가로와 세로의 길이를 키보드로 입력하세요. (단위 신경ㄴㄴ)
		// 가로 또는 세로의 길이가 크다면 직사각형 출력
		// 가로와 세로의 길이가 같다면 정사각형 출력
		// switch문 사용 (if문 ㄴㄴ)
		System.out.println("가로의 길이 : ");
		int 가로 = scan.nextInt();
		System.out.println("세로의 길이 : ");
		int 세로 = scan.nextInt();
		
		int 사각형 = 가로 - 세로;
		switch(사각형) {
			case 0 :
				System.out.println("정사각형");
				break;
			default :
				System.out.println("직사각형");
		}
		
		// switch문에서 default는 한 번만 사용
		// switch에 들어온 값이 case에 일치하는 게 없다면 default 실행
		// 주어진 case와 일치하는 게 하나도 없으면 default만 실행하고 종료
	}

}
