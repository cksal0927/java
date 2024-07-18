package java_thread1;

public class MainClass3 {

	public static void main(String[] args) throws InterruptedException {

		MeThread th1 = new MeThread(2000, "이천");
		MeThread th2 = new MeThread(3000, "삼천");
		
		// 순차적으로 thread 실행
		th1.start();
		
		th1.join();
		
		th2.start();

	}

}

/*
	sleep(밀리세컨드) - 지정된 시간만큼 대기
	start() - thread 시작, run 메서드 호출
	join() - 해당 thread가 끝날 때까지 다음 thread 대기
	run() - thread가 실행하는 메서드
	stop() - thread 중단 (사용을 권장하지 않음)
	interrupt() - thread 중단
	setPriority(정수값) - thread의 우선순위
	getPriority() - 설정된 thread 우선순위값
	isAlive() - 현재 thread가 살아있다면 true, 종료 되었으면 false
	
	suspend() - thread 일시정지 (사용을 권장하지 않음)
	resume() - 일시정지된 thread 실행 (사용을 권장하지 않음)
	
	yield() - 다른 thread에게 실행 상태를 양보하고 대기
*/