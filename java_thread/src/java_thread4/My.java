package java_thread4;

public class My extends Thread {

	private Thread target;
	
	public My(String name, Thread target) {
		super(name);
		this.target = target;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=200000000; i++);
		for(int i=0; i<=200000000; i++);
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			target.join();  // target의 thread가 종료될 때까지 다른 thread는 대기
		}catch(InterruptedException e) {
			for(int i=0; i<=200000000; i++);
			for(int i=0; i<=200000000; i++);
		}
	}
	
}
