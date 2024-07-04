package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// 두 개의 정수를 반환하기
		int[] num = util.twoNum();
		
		// 사각형의 너비와 높이를 설정하고 넓이를 출력하기
		// 넓이는 main 메서드에서 출력하기
		int square = util.area();
		System.out.println("사각형의 넓이 : " + square);
		
		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		// login 메서드를 실행하여 로그인 여부 출력하기
		// 아이디, 비밀번호가 일치하면 로그인 성공 출력
		// 하나라도 불일치하면 로그인 실패 출력
		// 로그인 여부 출력은 main에서
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		// 정수 세 개를 키보드를 통해 입력받기
		// 입력한 세 정수의 합이 100을 넘으면 100 - 합의 결과를 출력
		// 100을 넘지 않으면 세 정수의 합 출력
		// main 메서드에서 출력
		int numTotal = util.sum();
		
		if(numTotal > 100) {
			System.out.println("100 - 세 정수의 합 : " + (100 - numTotal));
		}else {
			System.out.println("세 정수의 합 : " + numTotal);
		}
		
	}

}

class MethodUtil{
	int[] twoNum() {
		int num1 = 20;
		int num2 = 50;
		// int[] temp = new int[] {num1, num2};
		return new int[] {num1, num2};
		// return으로 반환시킬 수 있는 값은 하나
	}
	
	int area() {
		int 너비 = 20;
		int 높이 = 30;
		int 넓이 = 너비 * 높이 / 2;
		return 넓이;
	}
	
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		boolean isSuccess = true;
		if(id.equals("skyblue")) {
			if(password.equals("1234sea"))
				return isSuccess;
		}
		return isSuccess = false;
	}
	
	int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int one = sc.nextInt();
		System.out.println("정수2 : ");
		int two = sc.nextInt();
		System.out.println("정수3 : ");
		int three = sc.nextInt();
		
		int total = one + two + three;
		
		return total;
	}
}