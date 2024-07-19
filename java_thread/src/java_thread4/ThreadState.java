package java_thread4;

import java.lang.Thread.State;

public class ThreadState {
	
	private static Thread thread;
	private static Thread stateThread;

	public static void main(String[] args) {
		
		stateThread = new Thread(() -> {  // 익명 클래스 객체 생성
			while(true) {
				State state = thread.getState();  // thread 객체 상태
				System.out.println(thread.getName() + " - thread... 상태 : " + state);
				
				if(state == State.NEW) {
					System.out.println("thread 실행 준비 단계");
					thread.start();
				}
				
				if(state == State.WAITING) {
					System.out.println("thread 대기 단계");
					thread.interrupt();
				}
				
				if(state == State.TERMINATED) {
					System.out.println(thread.getName() + " - thread... 상태 : " + state);
					break;  // terminated 상태라면 thread가 종료된 상태
				}
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread = new My("  thread 1번 ", stateThread);
		thread.start();

	}

}
