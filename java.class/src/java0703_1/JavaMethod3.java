package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {

		// ���� �� �� �Է� �޾� �� ����ϱ�
		Calc calc = new Calc();
		calc.sum(40, 10);
		
		// calc.sum();
		
		// �� ������ ������ ���Ͽ� ����ϱ�
		int kor=89, eng=74, mat=43;
		calc.object(kor, eng, mat);
		
		// �޼��� ȣ���Ͽ� "�޼��� dog����~" ����ϱ�
		calc.dog();
		
		calc.view();  // view �޼��� ȣ��
		
		// �޼��带 ȣ���Ͽ� �̸��� ���� ����ϱ�
		// �Ű����� ���� �޼���, Ű���带 �Է� X
		calc.me();
		
		// �޼��带 ȣ���Ͽ� �Ʒ��� ������ ����ϱ�
		String animal = "��縮Ʈ����";
		String ������ = "2024-07-01";
		
		TestMethod test = new TestMethod();
		test.golden(animal, ������);
		
		// ���� ��¥ �߿��� ���� �ϸ� ����ϱ�
		// ���ڿ� �޼��� substring �Ǵ� split ���
		String examDate = "2024-08-13";
		test.date(examDate);
		
		// �� ����� ���� ��հ��� ���Ͽ� ����ϱ�
		// ��հ��� ����
		int ���=31, ����=23, ����=28, ���=37;
		test.soccer(���, ����, ����, ���);
	}
}

// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸����� ���

class Calc{
	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("�� : " + result);
	}
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("�� : " + result);
	}
	
	void object(int k, int e, int m) {
		int total = k + e + m;
		System.out.println("�� ������ ���� : " + total);
	}
	
	void dog() {
		System.out.println("�޼��� dog����~");
	}
	
	void view() {  // ���� a, b�� �� ����ϴ� �޼���
		int a=10, b=20;
		System.out.println(a + ", " + b);
	}
	
	void me() {
		String name = "������";
		int age = 22;
		System.out.println("�̸� : " + name + "\n���� : " + age);
	}
}

class TestMethod{
	void golden(String dog, String date) {
		System.out.println("������ �̸� : " + dog + "\n������ : " + date);
	}
	
	void date(String testDate) {
		System.out.println("�� : " + testDate.substring(5, 7) + "\n�� : " + testDate.substring(8, 10));
		
		// String[] current = testDate.split("-");
		// System.out.println("�� : " + current[1] + "\n�� : " + current[2]);
	}
	
	void soccer(int hm, int ki, int hc, int jb) {
		int ageAvg = (hm + ki + hc + jb)/4;
		System.out.println("���� ��� : " + ageAvg);
	}
}