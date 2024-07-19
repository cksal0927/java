package java_thread4;

import java.lang.Thread.State;

public class ThreadState {
	
	private static Thread thread;
	private static Thread stateThread;

	public static void main(String[] args) {
		
		stateThread = new Thread(() -> {  // �͸� Ŭ���� ��ü ����
			while(true) {
				State state = thread.getState();  // thread ��ü ����
				System.out.println(thread.getName() + " - thread... ���� : " + state);
				
				if(state == State.NEW) {
					System.out.println("thread ���� �غ� �ܰ�");
					thread.start();
				}
				
				if(state == State.WAITING) {
					System.out.println("thread ��� �ܰ�");
					thread.interrupt();
				}
				
				if(state == State.TERMINATED) {
					System.out.println(thread.getName() + " - thread... ���� : " + state);
					break;  // terminated ���¶�� thread�� ����� ����
				}
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread = new My("  thread 1�� ", stateThread);
		thread.start();

	}

}
