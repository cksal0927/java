package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 음료를 검색하여 음료 이름과 금액이 출력되게 하세요.
		// 카페 배열에 없는 음료 검색시 "죄송합니다. 준비 중입니다." 라고 출력
		String[] 카페 = new String[] {
				"아메리카노 : 2000원", "화이트 아메리카노 : 2800원", "카페라떼 : 3000원",
				"돌체라떼 : 3800원", "카메모카 : 3800원", "수박주스 : 4000원",
				"써머 아이스티 : 2900원", "복숭아 아이스티 : 2800원", "자두 아이스티 : 2800원",
				"유자에이드 : 3500원", "레몬에이드 : 3500원", "청포도에이드 : 3500원"
		};
		
		System.out.print("음료 검색 : ");
		String cafe = scan.nextLine();
		
		boolean isDrink = true;
		for( int i=0; i<카페.length; i++ ) {
			if(카페[i].contains(cafe)) {
				System.out.println(카페[i]);
				isDrink = false;
			}
		}
		
		if(isDrink) {
			System.out.println("죄송합니다. 준비 중입니다.");
		}
		
//		String[] name = new String[] {
//				"김유신", "한석봉", "양만춘", "김춘추", "정도전",
//				"정약용", "이순신", "이사부", "이사람", "한가인"
//		};
//		
//		System.out.print("이름 검색 : ");
//		String search = scan.nextLine();
//		
//		for( int i=0; i<name.length; i++ ) {
//			if( name[i].contains(search) ) {
//				System.out.println("검색 결과 : " + name[i]);
//			}
//		}
		
//		String word = "I like banana";
		
		// 문자열에서 특정 문자나 문자열의 위치 찾기 - indexOf
//		System.out.println( word.indexOf("like") );
		
		// 문자열에서 특정 문자나 문자열의 존재 유무 - true, false
//		System.out.println( word.contains("ba") );
//		String[] a = new String[] {"banana", "orange"};
//		
//		a[0].indexOf("na");  // 2
//		a[1].contains("ge");
		
		// name 배열의 문자열 중에서 이성계, 문익점, 정도전, 최영을
		// 선발대 배열에 저장하고 출력하세요.
//		String[] name = new String[] {
//				"이순신", "김유신", "장보고", "이성계", "문익점", "정도전", "최영", "양만춘"
//		};
//		
//		String 선발대[] = new String[4];
//		
//		System.arraycopy( name, 3, 선발대, 0, 4 );
//		
//		System.out.println(Arrays.toString(선발대));
		
		// 6명의 키를 tall 배열에 저장하였다.
		// 키 175 미만을 출력하세요.
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		for( int i=0; i<tall.length; i++ ) {
//			if( tall[i] < 175 )
//				System.out.println("175 미만 : " + tall[i]);
//		}
		
		// 과자 배열에 좋아하는 과자의 판매 가격을 입력하여 저장
		// 과자 배열에 저장된 판매 가격들의 총합과 평균을 구하세요.
//		int[] 과자 = new int[5];
//		System.out.println("첫 번째 과자의 판매 가격 : ");
//		과자[0] = scan.nextInt();
//		System.out.println("두 번째 과자의 판매 가격 : ");
//		과자[1] = scan.nextInt();
//		System.out.println("세 번째 과자의 판매 가격 : ");
//		과자[2] = scan.nextInt();
//		System.out.println("네 번째 과자의 판매 가격 : ");
//		과자[3] = scan.nextInt();
//		System.out.println("다섯 번째 과자의 판매 가격 : ");
//		과자[4] = scan.nextInt();
//
//		int 총합 = 과자[0] + 과자[1] + 과자[2] + 과자[3] + 과자[4];
//		int 평균 = 총합/5;
//		
//		System.out.println("과자 판매 가격의 총합은 : " + 총합 + "\n과자 판매 가격의 평균은 : " + 평균);
		
		
//		int[] 과자 = new int[5];
//		
//		for( int i=0; i<과자.length; i++ ) {
//			System.out.println("과자 " + (i+1) + " 가격 : ");
//			과자[i] = scan.nextInt();
//		}
//		
//		int total = 0;
//		int avg = 0;
//		for( int i=0; i<과자.length; i++ ) {
//			total = total + 과자[i];
//		}
//		avg = total/과자.length;
//		
//		System.out.println("총합 : " + total + " 평균 : " + avg);
	}

}
