package java_thread4;

public enum ThState {
	
	NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
	
//	String num;
//	ThState(String num){
//		this.num= num;
//	}
//	
//	String getNum() {
//		return this.getNum();
//	}
}

/*
	������� Ŭ����ó�� ����� �� �ִ� ��� - Enum
	
	final int num = 20;
	num = 30;  ����
	
	const num = 10;
	num = 30;  ����
	
	menu >> 1. ���Ͽ��� 2. �������� 3. �ٸ��̸����� 4. ȯ�漳�� 5. ����
	
	enum Menu{
		���Ͽ���, ��������, SAVEAS, SET, EXIT
	}
	
	int menu = scan.nextInt();
	
	switch(menu){
		case Menu.���Ͽ��� : 
		case Menu.�������� : 
		case Menu.SAVEAS : 
		case Menu.SET :
		case Menu.EXIT :
	}
*/