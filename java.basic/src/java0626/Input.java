package java0626;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
//		System.out.println("�ڹ� ���");
		// System.in - �Է�
		// �Է� ���� �� �ִ� ���� Ŭ���� - Scanner
		Scanner scan = new Scanner(System.in);
		
		// float Ÿ�� - nextFloat(), double = nextDouble()
		// byte - nextType(), short - nextShort()
		// char�� ����. (���ڿ�)
		// ���ڿ� �Է� - nextLine(), next()
		
//		System.out.print("���� �Է� : ");
//		int a = scan.nextInt();
//		System.out.println(a);
		
		// ö���� ������ �Ա� ���� �������� ����.
		// ��Զ��� �ﰢ���, �ٳ��������� �Ծ���.
		// ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
//		System.out.print("��Զ�� �ݾ� : ");
//		int ��Զ�� = scan.nextInt();
//		System.out.print("�ﰢ��� �ݾ� : ");
//		int �ﰢ��� = scan.nextInt();
//		System.out.print("�ٳ������� �ݾ� : ");
//		int �ٳ������� = scan.nextInt();
//		int ���ɰ� = ��Զ�� + �ﰢ��� + �ٳ�������;
//		System.out.println("���ɰ����� ������ �ݾ� : " + ���ɰ� + "��");
		// System.out.printf("���ɰ� : %d�� \n", ���ɰ�);

		// �μ��� ģ������ ������ ���� ���Դ�.
		// ���ͼ� ���� ������ ���� �ͼ� ���� ���� �Դ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���� �Դ�.
		// �μ��� ���� 5���̴�.
		// �μ��� �� �� �ö󰡰ų� �������� ���� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴ� �� �ɸ� �� �ð���?
		int �� = 4;
		float �ð� = 3.4f;
		int ��Ƚ�� = 4;
		float ���ð� = �� * �ð�;
		float �ѽð� = ��Ƚ�� * ���ð�;
		System.out.println("�� �ð� : " + �ѽð� + "��");
		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
		// if, �Լ�(�޼���), �ݺ���
		
		/*
		 �������� ������ ����, �Ǽ�, ����, boolean(��, ����)
		 ������ Ÿ��
		 	���� - byte, short, int, long
		 	���� - char
		 	�Ǽ� - float, double
		 	������ - boolean
		 
		 ���� ���� ���
		 int num;  ���� Ÿ�� ���� ����
		 double dnum;  �Ǽ� ���� ���� ����
		 char ch;  ���� Ÿ�� ���� ����
		 boolean bool;  ������ ���� ����
		 
		 ������ �ʱ�ȭ
		 int num= 10;  ���� ����� �԰� �����͸� ����
		 
		 ��� ���
		 System.out.println( ��³��� );
		 System.out.print( ��³��� );
		 System.out.printf( ��³��� );
		 
		 printf ���� �Բ� ����ϴ� ���� ������
		 	%d, %u - ����
		 	%f - �Ǽ�
		 	%c - ����
		 	%s - ���ڿ�
		 	
		 int age = 28;
		 System.out.printf("%s ������ ���̰� %d���� ���� ������ %c��", "�ڵ���", age, '��');
		 
		 �Է� ���
		 Scanner Ŭ���� ��ü �ʿ�
		 Scanner ���� = new Scanner(System.in);
		 	*Scanner Ŭ������ ���� �ܺ� Ŭ�����̹Ƿ� import �ؾ� �Ѵ�.
		 	
		 ����.nextInt();  int Ÿ�� ������ �Է�
		 ����.nextByte();  byte Ÿ�� ������ �Է�
		 ����.nextShort();  short Ÿ�� ������ �Է�
		 ����.nextLong();  long Ÿ�� ������ �Է�
		 ����.nextFloat();  float Ÿ�� �Ǽ��� �Է�
		 ����.nextDouble();  double Ÿ�� �Ǽ��� �Է�
		 ����.next();  ���ڿ� �Է�
		 ����.nextLine();  ���ڿ� �Է�
		*/
		
		 // c���, �ڹ�, �����а��� ���� ������ �Է��ϼ���.
		 // �� ������ ������ ����� ���� ����ϼ���
		 System.out.print("c��� ���� : ");
		 int c��� = scan.nextInt();
		 System.out.print("�ڹ� ���� : ");
		 int �ڹ� = scan.nextInt();
		 System.out.print("�����а��� ���� : ");
		 int �����а��� = scan.nextInt();
		 
		 int ���� = c��� + �ڹ� + �����а���;
		 int ��� = ����/3;
		 
		 System.out.printf("���� : %d��, ��� : %d�� \n", ����, ���);
		
	}

}
