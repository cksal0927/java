package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// �� ���� ������ ��ȯ�ϱ�
		int[] num = util.twoNum();
		
		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϱ�
		// ���̴� main �޼��忡�� ����ϱ�
		int square = util.area();
		System.out.println("�簢���� ���� : " + square);
		
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		// login �޼��带 �����Ͽ� �α��� ���� ����ϱ�
		// ���̵�, ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�ϸ� �α��� ���� ���
		// �α��� ���� ����� main����
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
		// ���� �� ���� Ű���带 ���� �Է¹ޱ�
		// �Է��� �� ������ ���� 100�� ������ 100 - ���� ����� ���
		// 100�� ���� ������ �� ������ �� ���
		// main �޼��忡�� ���
		int numTotal = util.sum();
		
		if(numTotal > 100) {
			System.out.println("100 - �� ������ �� : " + (100 - numTotal));
		}else {
			System.out.println("�� ������ �� : " + numTotal);
		}
		
	}

}

class MethodUtil{
	int[] twoNum() {
		int num1 = 20;
		int num2 = 50;
		// int[] temp = new int[] {num1, num2};
		return new int[] {num1, num2};
		// return���� ��ȯ��ų �� �ִ� ���� �ϳ�
	}
	
	int area() {
		int �ʺ� = 20;
		int ���� = 30;
		int ���� = �ʺ� * ���� / 2;
		return ����;
	}
	
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
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
		System.out.println("����1 : ");
		int one = sc.nextInt();
		System.out.println("����2 : ");
		int two = sc.nextInt();
		System.out.println("����3 : ");
		int three = sc.nextInt();
		
		int total = one + two + three;
		
		return total;
	}
}