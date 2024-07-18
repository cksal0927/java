package java_thread2;

public class Web extends Thread {
	
	public Web(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " thread 시작");
		Long before = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++) {
			for(int k=0; k<100000; k++) {
				for(int j=0; j<100000; j++) {
					
				}
			}
		}
		long after = System.currentTimeMillis();
		long diff = after - before;
		
		System.out.println(name + " thread 종료 (" + diff + ")");
	}
	
}
