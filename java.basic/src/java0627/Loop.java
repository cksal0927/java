package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		// �ݺ��� - for, while, do~while
		// for(�ʱⰪ; ���ǽ�; ������){ �ݺ����� }
		// ���ǽ��� ������ �� ������ �߰�ȣ ���� ������ ��� ����
		// �ʱⰪ -> ���ǽ� �� -> �� -> �߰�ȣ -> ������
		// -> ���ǽ� �� -> �� -> �߰�ȣ -> ������
		// -> ���ǽ� �� -> ���� -> ����
		
//		for(int i=0; i<=17; i++) {
//			if( i%2 == 1 ) {
//				System.out.println("��... �ݺ���..." + i);
//			}
//		}
		
//		int num = 1;
//		int a = 1;
//		num = num + a;
//		System.out.println(num);  // 2
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 7
//		a++;
		
//		int num = 1;
//		for(int a=1; a<=100; a++) {
//			num += a;
//			System.out.println(num);
//		}
		
		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("���� : " + sum);
	}
}
