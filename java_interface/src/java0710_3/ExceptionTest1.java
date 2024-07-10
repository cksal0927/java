package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		// NullpointerException 오류 : 객체 생성 안 해서
	
		
		
		try {
			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = null;
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println(10/0);
		}catch(NullPointerException n) {
			n.printStackTrace();  // 오류 메시지 확인 - 테스트용
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			System.out.println("문자열 입력해!");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼!");
		}
		
		System.out.println("여기가 프로그램 끝");
		
	}

}

/*
	예외 처리
	- 프로그램 실행 중에 에러 발생하면 즉시 프로그램 종료
	- 예외 처리를 해주면 에러가 발생해도 프로그램은 종료되지 않음
	- 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있음
	- 에러나 오류를 해결하는 방법은 아니고, 회피하는 방법
*/