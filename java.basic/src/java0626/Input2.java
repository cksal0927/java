package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 �ڵ带 �ۼ��ϱ� �� �ؾ� �� �� - ���� �ľ�, �䱸���� ����
		 ���ڿ� - "" ū ����ǥ�� ǥ���Ͽ� �ۼ�
		 ���ڿ��� String Ŭ���� Ÿ�� ���
		 
		 ���� 2.
		 ���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
		 ������ 8%�� ����.
		 �Ǽ��ɾ��� ���ΰ�?
		 �̸�, �μ�, �Ǽ��ɾ��� �� ���� ������ ���� ����Ѵ�.
		*/
		float ���� = 0.08f;
		
		String �̸�1, �μ�1;
		int ����1;
		System.out.print("�̸�1 : ");
		�̸�1 = scan.next();
		System.out.print("�μ�1 : ");
		�μ�1 = scan.next();
		System.out.print("����1 : ");
		����1 = scan.nextInt();
		
		String �̸�2, �μ�2;
		int ����2;
		System.out.print("�̸�2 : ");
		�̸�2 = scan.next();
		System.out.print("�μ�2 : ");
		�μ�2 = scan.next();
		System.out.print("����2 : ");
		����2 = scan.nextInt();
		
		float �Ǽ��ɾ�1, �Ǽ��ɾ�2;
		�Ǽ��ɾ�1 = ����1 * (1-����);
		�Ǽ��ɾ�2 = ����2 * (1-����);
		
		System.out.printf("����1�� �̸� : %s, �μ�: %s, �Ǽ��ɾ�: %.0f�� �� \n", �̸�1, �μ�1, �Ǽ��ɾ�1);
		System.out.printf("����2�� �̸� : %s, �μ�: %s, �Ǽ��ɾ�: %.0f�� ��", �̸�2, �μ�2, �Ǽ��ɾ�2);
	}

}
