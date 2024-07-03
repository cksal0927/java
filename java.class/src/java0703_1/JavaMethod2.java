package java0703_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("이순신", 31, "군인");
		Member member2 = new Member("문익점", 29, "섬유공장사장");
		Member member3 = new Member("장영실", 45, "발명가");
		
		member1.birth(member1);
		member2.birth(member2);
		member3.birth(member3);
		
		// 나이 - 20대인가? 30대인가? 40대인가?
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		// 직업 분류 - 국가직무 분류에 따라 표기
		// 출력 내용 - 이순신 : 0.5국방
		DataIdenti jobIdenti = new DataIdenti();
		jobIdenti.jobCode(member1.name, member1.job);
		jobIdenti.jobCode(member2.name, member2.job);
		jobIdenti.jobCode(member3.name, member3.job);
		
//		System.out.println(today.getMonthValue());
		
		// 연도 -> .getYear();
		// 월 -> .getMonthValue();
		// 일 -> .getDayOfMonth();
		// 요일 ->.getDayOfWeek().getValue();
		// 1(월요일), 2(화요일), ..., 7(일요일)
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int week = cal.get(Calendar.DAY_OF_WEEK);
		
//		System.out.println(year);
		
//		Date today = new Date();
//		System.out.println(today.get);

	}

}

// 메서드나 함수를 사용하는 이유
// 배열, 계산, 단순 출력 - 반복문
// 메서드를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아진다.
// 메서드를 사용하면 구조화된 프로그래밍이 가능하다.

class Member{
	String name;  // 이름
	int age;  // 나이
	String job;  // 직업

	// 기본 생성자 메서드
	Member(){	}
	
	// 매개변수가 있는 생성자 메서드
	Member(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// 태어난 연도 출력하는 메서드
	void birth(Member member) {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
					
		// 화면 출력 - 이순신 태어난 연도 : 0000년
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s 태어난 연도 : %d년 \n", this.name, birthYear1);
	}
}

class Cat{
	
}

// 컨트롤용 클래스, 실제 기능의 동작 클래스, 데이터 클래스
// Controller, Service, DTO(VO)

class DataIdenti{  // 연령대, 직업 분류 등 데이터 분류를 위한 클래스
	void ageGroup(String name, int age) {
		String group = null;
		group = (age/10) + "0대";
		System.out.println(name + " : " + group);
	}
	
	// 국가 직무 분류
	// 군인 - 05.국방
	// 발명가 - 04.사회과학
	// 섬유공장사장 - 18.섬유의복
	void jobCode(String name, String job) {
		String code = null;
		
		// if(job.equals("군인"))
		switch(job) {
		case "군인" : code = "05.국방";
			break;
		case "발명가" : code = "04.사회과학";
			break;
		case "섬유공장사장" : code = "18.섬유의복";
		}
		
		System.out.println(name + " 직업 : " + code);
	}
}