package java_thread2;

public class DaemonTh extends Thread {

	@Override
	public void run() {
		
		System.out.println("���� thread ����");
		
		while(true) {
			System.out.println("�ڵ� ����");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

/*
	���� thread
	: �� thread�� �����ϴ� thread
		- �� thread�� ����Ǹ� ���� thread�� ����
		- �� thread�� ���� �����ؾ� ������ ���� thread�� �� thread�� ������ �ޱ⿡ ������ ��� ���� �ʾƵ� �ȴ�.
*/