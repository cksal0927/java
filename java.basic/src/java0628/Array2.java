package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// ���Ḧ �˻��Ͽ� ���� �̸��� �ݾ��� ��µǰ� �ϼ���.
		// ī�� �迭�� ���� ���� �˻��� "�˼��մϴ�. �غ� ���Դϴ�." ��� ���
		String[] ī�� = new String[] {
				"�Ƹ޸�ī�� : 2000��", "ȭ��Ʈ �Ƹ޸�ī�� : 2800��", "ī��� : 3000��",
				"��ü�� : 3800��", "ī�޸�ī : 3800��", "�����ֽ� : 4000��",
				"��� ���̽�Ƽ : 2900��", "������ ���̽�Ƽ : 2800��", "�ڵ� ���̽�Ƽ : 2800��",
				"���ڿ��̵� : 3500��", "�����̵� : 3500��", "û�������̵� : 3500��"
		};
		
		System.out.print("���� �˻� : ");
		String cafe = scan.nextLine();
		
		boolean isDrink = true;
		for( int i=0; i<ī��.length; i++ ) {
			if(ī��[i].contains(cafe)) {
				System.out.println(ī��[i]);
				isDrink = false;
			}
		}
		
		if(isDrink) {
			System.out.println("�˼��մϴ�. �غ� ���Դϴ�.");
		}
		
//		String[] name = new String[] {
//				"������", "�Ѽ���", "�縸��", "������", "������",
//				"�����", "�̼���", "�̻��", "�̻��", "�Ѱ���"
//		};
//		
//		System.out.print("�̸� �˻� : ");
//		String search = scan.nextLine();
//		
//		for( int i=0; i<name.length; i++ ) {
//			if( name[i].contains(search) ) {
//				System.out.println("�˻� ��� : " + name[i]);
//			}
//		}
		
//		String word = "I like banana";
		
		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġ ã�� - indexOf
//		System.out.println( word.indexOf("like") );
		
		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ���� ���� - true, false
//		System.out.println( word.contains("ba") );
//		String[] a = new String[] {"banana", "orange"};
//		
//		a[0].indexOf("na");  // 2
//		a[1].contains("ge");
		
		// name �迭�� ���ڿ� �߿��� �̼���, ������, ������, �ֿ���
		// ���ߴ� �迭�� �����ϰ� ����ϼ���.
//		String[] name = new String[] {
//				"�̼���", "������", "�庸��", "�̼���", "������", "������", "�ֿ�", "�縸��"
//		};
//		
//		String ���ߴ�[] = new String[4];
//		
//		System.arraycopy( name, 3, ���ߴ�, 0, 4 );
//		
//		System.out.println(Arrays.toString(���ߴ�));
		
		// 6���� Ű�� tall �迭�� �����Ͽ���.
		// Ű 175 �̸��� ����ϼ���.
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		for( int i=0; i<tall.length; i++ ) {
//			if( tall[i] < 175 )
//				System.out.println("175 �̸� : " + tall[i]);
//		}
		
		// ���� �迭�� �����ϴ� ������ �Ǹ� ������ �Է��Ͽ� ����
		// ���� �迭�� ����� �Ǹ� ���ݵ��� ���հ� ����� ���ϼ���.
//		int[] ���� = new int[5];
//		System.out.println("ù ��° ������ �Ǹ� ���� : ");
//		����[0] = scan.nextInt();
//		System.out.println("�� ��° ������ �Ǹ� ���� : ");
//		����[1] = scan.nextInt();
//		System.out.println("�� ��° ������ �Ǹ� ���� : ");
//		����[2] = scan.nextInt();
//		System.out.println("�� ��° ������ �Ǹ� ���� : ");
//		����[3] = scan.nextInt();
//		System.out.println("�ټ� ��° ������ �Ǹ� ���� : ");
//		����[4] = scan.nextInt();
//
//		int ���� = ����[0] + ����[1] + ����[2] + ����[3] + ����[4];
//		int ��� = ����/5;
//		
//		System.out.println("���� �Ǹ� ������ ������ : " + ���� + "\n���� �Ǹ� ������ ����� : " + ���);
		
		
//		int[] ���� = new int[5];
//		
//		for( int i=0; i<����.length; i++ ) {
//			System.out.println("���� " + (i+1) + " ���� : ");
//			����[i] = scan.nextInt();
//		}
//		
//		int total = 0;
//		int avg = 0;
//		for( int i=0; i<����.length; i++ ) {
//			total = total + ����[i];
//		}
//		avg = total/����.length;
//		
//		System.out.println("���� : " + total + " ��� : " + avg);
	}

}
