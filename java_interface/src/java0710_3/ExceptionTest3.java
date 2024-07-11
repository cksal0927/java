package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Member member = new Member("이순신", 1999);
		System.out.println(member.name + " " + member.birth);
		try{
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(member.age);
		
//		try {
//			// 코드
//			if()
//				throw new NullPointerException("aa");
//			// 코드
//		}catch(Exception e) {
//			System.out.println("강제 오류 발생");
//		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	// setAge 메서드를 호출하여 age 변수 값 저장하는데
	// age 변수는 나이를 표현하기 위한 변수라 0보다 작은 값이 저장되면 안 된다.
	// 올해 연도에서 태어난 연도를 뺐을 때 0보다 작은 값이 나온다면 잘못된 값이다.
	// 이 문제는 birth 변수의 값이 잘못되었기에 발생한 문제이기에
	// setAge 메서드에서 처리하는 것이 아니라 상위 코드에서 해결해야 하므로
	// 예외를 발생시키고 넘겨 주기를 한다.
	
	void setAge() {
		this.age = 2024 - birth;
		if(age<0) 
		throw new RuntimeException("태어난 연도가 잘못되었습니다.");
	}
	
	// throw - 예외 발생시키기
	// throws - 예외 처리 미루기
	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age<0)
//				throw new RuntimeException("태어난 연도가 잘못되었습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
}