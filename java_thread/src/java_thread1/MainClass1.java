package java_thread1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();  // thread ��ü ����
		th.start();  // thread ����
		
		for(int i=1; i<=10; i++) {
			System.out.println("        ���� Main " + i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է� : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
	}

}

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("�� �������! " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
	���μ��� - cpu�� ���� �޸�(ram)�� �ε�Ǿ� �ִ� ���α׷�
			��, ���� ���� ���α׷����� ���μ���
			102���� ���μ����� �ִٴ� ���� 102�� ���α׷��� ���� ���̶�� ��
			
			�� ��ǻ�Ϳ� ���� ���� ���μ��� Ȯ���ϴ� ���
			1. �ϴܿ� �۾�ǥ���ٿ��� ������ ���콺 Ŭ���Ͽ� �۾������� ����, ���μ��� ��
			2. ��� ������Ʈ â ���� (�����⿡�� cmd �˻� / ctrl�ϰ� cmd �Է� ����)
				������ - tasklist ��ɾ�
				��, ������ - �͹̳� ��� ps -e
				
				���μ��� ���� - taskkill / pid[pid��]
				��, ������ - pkill -9 -k ���μ����̸�
						- sudo kill ���μ�����ȣ
						
	thread - ���μ��� �ȿ��� ���� ������ �����ϴ� ����
		   - thread�� �߰��ϸ� ���ÿ� ���� ���� ���� ���� ����
		   
	�ڹ� thread
	thread ������
	Thread() : ���ο� thread ��ü �Ҵ�
	Thread("�̸�") : ���ο� thread ��ü �Ҵ��ϸ鼭 �̸� �ο�
*/