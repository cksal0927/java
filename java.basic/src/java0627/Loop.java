package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan = new Scanner(System.in);

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
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("���� : ");
//		int num = scan.nextInt();
//		
//		int sum = 0;
//		for(int i=1; i<=num; i++) {
//			sum = sum + i;
//		}
//		System.out.println("���� : " + sum);
//		
//		for(int i=1; true; i++) {
//			if(i>10000) break;
//			System.out.println("i");
//		}
		
		// �ݺ����� �ۼ��Ϸ��� �� �� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ���� ������ ���ؼ� ���� �����ؾ� �Ѵ�.
		// for��, while��, do~while�� ��� ���� �ݺ��� ������ �ϴ°���
		// ã�� �� �ϸ� �ۼ��� �� ����. (���ѷ����̵� n�� �ݺ��̵�)
		
//		Scanner scan = new Scanner(System.in);
//		
//		for( ;true; ) {
//			System.out.println("���� �Է� : ");
//			int num = scan.nextInt();
//			if( num == 0 ) break;
//		}
		
		// ���ѷ��� �����Ű�� ���
		// 1. if���� ���ǽ��� ���� �Ǹ� break ����
		// 2. for(;���ǽ�;)
		// 3. return;  - �ݺ��� �ڵ尡 �ִ� �޼��带 �����Ű�� ������ �ݺ����� ����
		// break;  - �ݺ���, switch ��� ����
		//         - if�� �ܵ����� break ��� �Ұ�
		// if(10>5) break;  �̰� ����!
		
		// continue;
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+"��° �ݺ� ����");
//			if(i%3 == 0) continue;
//			System.out.println(i+"��° �ݺ� ���� ��");
//			System.out.println(i+"��° �ݺ� ������ ����");
//		}
		
		// �ڹ��� ����
		// int random = (int)Math.floor( Math.random()*10 ) + 1;
		
		// ������ ���� (1~50)
		// ������ ��� ���
		// �������� 11�� ����� ��� �ݺ��� ����
//		for(;true;) {
//			int num = (int)Math.floor( Math.random()*50 ) + 1;
//			int num = (int)( Math.random()*50 ) + 1;
//			if(num%11 == 0) break;
//			System.out.println(num);
//		}
		
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ������
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� �������� (���� ���� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74���
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//		int com = (int)Math.floor( Math.random()*81 ) + 20;
//		for(;;) {
//			System.out.println("���� �Է� : ");
//			int user = scan.nextInt();
//			if(user > com) {
//				System.out.println("down");
//			}else if(user < com) {
//				System.out.println("up");
//			}else {
//				System.out.println("������! ���ڴ� " + com + "�̾����ϴ�!");
//				break;
//			}
//		}
		
		// �̸��� �ִ� �ݺ���
		
		int sum = 0;
		���ϱ� : for(int i=1; i<=10; i++) {
			for(int k=1; k<=4; k++) {
				if(sum + k >= 40) break;
				sum = sum + k;
				System.out.println(i + " " + k);
			}
				System.out.println(i);
				sum = sum + i;
			}
		if(sum < 40) {
			System.out.println("sum ��� : " + sum);
		}
		
		// �轺Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�. 
		// �� ���� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
		
		int num = 1;
		
		�轺Ų:
		for(;;) {  // while(true)
			System.out.print("���� �� �� : ");
			int user = scan.nextInt();
			System.out.print("�� : ");
			for(int u=1; u<=user; u++) {
				System.out.print(num + " ");
				if(num == 31) break �轺Ų;
				num++;
			}
			System.out.println();
			
			int com = (int)(Math.random()*3) + 1;
			System.out.println("��ǻ�� : ");
			for(int c=1; c<=com; c++) {
				System.out.print(num + " ");
				if(num == 31) break �轺Ų;
				num++;
			}
			System.out.println();
		}
	}
}
