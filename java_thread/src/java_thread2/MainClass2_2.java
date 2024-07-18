package java_thread2;

public class MainClass2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh th = new NormalTh("일반");
		th.start();
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//		
//		dm.start();
		 
		Thread.sleep(6000);
		
		System.out.println("main 메서드 종료");

	}

}
