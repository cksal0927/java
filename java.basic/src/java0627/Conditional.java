package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// ���ǹ� - if, switch
		// �ݺ��� - for, while, do~while
		
		// if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		// ��, ���� ������ ���� �� �ִ� ��
		// Ű�� 150 �̻�  Ű >= 150
		// 10���� ���� ����  ��ü���⳯¥ �� == 10
		// 32000�� �̻��� ���� ����  ����� >= 32000
		// �Ǹ� ���� ��ǰ�鸸 ���  ��ǰ���� == �Ǹ�, ������ > 0
		
		int tall = 135;
		if( tall >= 150 ) {
			// Ű�� 150 �̻��� �´ٸ� ������ �� ������
		}else {
			// Ű�� 150 �̻��� �ƴ϶�� ������ �� ������
		}
		
		// ���� �հ� ���� - �հ�(60�� �̻�), ���հ�(60�� �̸�)
		int score = 72;
		if( score >= 60 ) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		// if ~ else - ���ǽ��� ��, ������ ���� ����Ǵ� ������ �ٸ� ���
		// �ϳ��� ���ǿ� �� ���� ������ �ִ� ��쿡 if ~ else ������ �ۼ�
		
		// ���� ���� ��� - A(90�� �̻�), B(80�� �̻�), C(70�� �̻�), D(������)
		score = 89;
		if( score >= 90 ) {
			System.out.println("A");
		}else if( score >= 80 ){
			System.out.println("B");
		}else if( score >= 70 ) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		// switch - ���� ������ case�� �����Ͽ�
		// case�� ��ġ�ϴ� ���� ��� �ڵ��Ǵ� ���ǹ�
		
		// ������ ������ �����.
		// ����� - w, a, s, d
		// �Ͻ����� - p 
		// ����ϱ� - o
		// ó������ �ٽ� ���� - i
		// ���� ���� - ctrl+s
		/*
		 switch(Ű���尪){
		 case 'a' : ���೻��
		 case 'w' : ���೻��
		 case 's' : ���೻��
		 case 'd' : ���೻��
		 case 'p' : ���೻��
		 case 'o' : ���೻��
		 case 'i' : ���೻��
		 case 'ctrl' : ���೻��
		 	switch(Ű2){
		 		case 's' : ���೻��
		 	}
		 }
		 
		 ���α׷��� �޴� ����
		 switch(menu){
		 	case 'open' :
		 	case 'save' : 
		 	case 'build' :
		 	case 'git' :
		 	case 'exit' :
		 }
		 
		 ���ǽ��� == �����ڰ� ���ȴٸ� switch���� �ۼ��ϴ� ���� ����غ���
		*/
		
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ض�
		String button = "����";
		
		switch( button ) {
			case "����" :
				System.out.println("���� ����");
				break;
			case "����" :
				System.out.println("���� ����");
				break;
			case "����" :
				System.out.println("���� ����");
		}
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���. (���� �Ű椤��)
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� ���簢�� ���
		// ���ο� ������ ���̰� ���ٸ� ���簢�� ���
		// switch�� ��� (if�� ����)
		System.out.println("������ ���� : ");
		int ���� = scan.nextInt();
		System.out.println("������ ���� : ");
		int ���� = scan.nextInt();
		
		int �簢�� = ���� - ����;
		switch(�簢��) {
			case 0 :
				System.out.println("���簢��");
				break;
			default :
				System.out.println("���簢��");
		}
		
		// switch������ default�� �� ���� ���
		// switch�� ���� ���� case�� ��ġ�ϴ� �� ���ٸ� default ����
		// �־��� case�� ��ġ�ϴ� �� �ϳ��� ������ default�� �����ϰ� ����
	}

}
