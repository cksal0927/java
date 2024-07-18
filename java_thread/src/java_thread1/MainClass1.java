package java_thread1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();  // thread 객체 생성
		th.start();  // thread 실행
		
		for(int i=1; i<=10; i++) {
			System.out.println("        나는 Main " + i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
	}

}

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("나 쓰레드야! " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
	프로세스 - cpu에 의해 메모리(ram)에 로드되어 있는 프로그램
			즉, 실행 중인 프로그램들이 프로세스
			102개의 프로세스가 있다는 말은 102의 프로그램이 실행 중이라는 뜻
			
			내 컴퓨터에 실행 중인 프로세스 확인하는 방법
			1. 하단에 작업표시줄에서 오른쪽 마우스 클릭하여 작업관리자 선택, 프로세스 탭
			2. 명령 프롬프트 창 열기 (돋보기에서 cmd 검색 / ctrl하고 cmd 입력 엔터)
				윈도우 - tasklist 명령어
				맥, 리눅스 - 터미널 열어서 ps -e
				
				프로세스 종료 - taskkill / pid[pid값]
				맥, 리눅스 - pkill -9 -k 프로세스이름
						- sudo kill 프로세스번호
						
	thread - 프로세스 안에서 실제 동작을 수행하는 단위
		   - thread를 추가하면 동시에 여러 개의 동작 수행 가능
		   
	자바 thread
	thread 생성자
	Thread() : 새로운 thread 객체 할당
	Thread("이름") : 새로운 thread 객체 할당하면서 이름 부여
*/