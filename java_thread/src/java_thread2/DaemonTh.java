package java_thread2;

public class DaemonTh extends Thread {

	@Override
	public void run() {
		
		System.out.println("데몬 thread 실행");
		
		while(true) {
			System.out.println("자동 저장");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

/*
	데몬 thread
	: 주 thread를 보조하는 thread
		- 주 thread가 종료되면 데몬 thread도 종료
		- 주 thread는 직접 제어해야 하지만 데몬 thread는 주 thread의 영향을 받기에 별도의 제어를 하지 않아도 된다.
*/