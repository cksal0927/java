package java_thread1;

public class MainClass3 {

	public static void main(String[] args) throws InterruptedException {

		MeThread th1 = new MeThread(2000, "��õ");
		MeThread th2 = new MeThread(3000, "��õ");
		
		// ���������� thread ����
		th1.start();
		
		th1.join();
		
		th2.start();

	}

}

/*
	sleep(�и�������) - ������ �ð���ŭ ���
	start() - thread ����, run �޼��� ȣ��
	join() - �ش� thread�� ���� ������ ���� thread ���
	run() - thread�� �����ϴ� �޼���
	stop() - thread �ߴ� (����� �������� ����)
	interrupt() - thread �ߴ�
	setPriority(������) - thread�� �켱����
	getPriority() - ������ thread �켱������
	isAlive() - ���� thread�� ����ִٸ� true, ���� �Ǿ����� false
	
	suspend() - thread �Ͻ����� (����� �������� ����)
	resume() - �Ͻ������� thread ���� (����� �������� ����)
	
	yield() - �ٸ� thread���� ���� ���¸� �纸�ϰ� ���
*/