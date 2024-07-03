package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {

		// 메서드를 통하여 숫자 10을 받아 출력하기
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println(num);
		
		// 메서드로부터 두 정수의 더하기 결과 받아서 출력하기
		int 결과 = rm.sum();
		System.out.println(결과);
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이 출력하기
		String userName = rm.getName();
		int age = 34;
		System.out.println(userName + " " + age);
		
		// 국어(89), 영어(78), 수학(50) 세 과목의 총점을 구하는 메서드
		// 세 과목의 평균을 구하는 메서드
		// 총점과 평균 출력하기
		int 총점 = rm.total();
		System.out.println("총점 : " + 총점 + "점");
		
		int 평균 = rm.avg();
		System.out.println("평균 : " + 평균 + "점");
		
	}

}

class ReturnMth{
	int get() {
		return 10;
	}
	
	int sum() {
		int num1=30, num2=45;
		int result = num1 + num2;
		return result;
	}
	
	String getName(){
		String name = "이순신";
		return name;
	}
	
	int total() {
		int kor=89, eng=78, mat=50;
		int totalScore = kor + eng + mat;
		return totalScore;
	}
	
	int avg() {
		int kor=89, eng=78, mat=50;
		int avgScore = (kor + eng + mat)/3;
		return avgScore;
	}
}

/*
 	주사위 게임
 	
 	j형준과 s석완이가 주사위 게임을 한다.
 	주사위는 하나, 육면이다.
 	주사위의 값이 큰 사람이 이긴다.
 	
 	주사위 값을 구하는 메서드
 	
 	주사위 값 비교하여 누가 이겼는지 출력하는 메서드

*/