package java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.play();

	}

}

class Game{  // rock-paper-scissors ����
	String user;  // ���� ����������
	String com;  // ��ǻ�� ����������
	
	void result() {
		if(user.equals(com)) {
			System.out.println("���º�");
		}else if((user.equals("����") && com.equals("��")) ||
				 (user.equals("����") && com.equals("����")) ||
				 (user.equals("��") && com.equals("����"))) {
			System.out.println("���� ��, ��ǻ�� ��");
		}else {
			System.out.println("���� ��, ��ǻ�� ��");
		}
	}
	
	void userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������� : ");
		this.user = scan.nextLine();
	}
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0 : this.com = "����"; break;
			case 1 : this.com = "����"; break;
			case 2 : this.com = "��"; break;
		}
	}
	
	void play() {
		comInput();
		userInput();
		result();
	}
}