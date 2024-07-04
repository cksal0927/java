package java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.play();

	}

}

class Game{  // rock-paper-scissors 게임
	String user;  // 유저 가위바위보
	String com;  // 컴퓨터 가위바위보
	
	void result() {
		if(user.equals(com)) {
			System.out.println("무승부");
		}else if((user.equals("가위") && com.equals("보")) ||
				 (user.equals("바위") && com.equals("가위")) ||
				 (user.equals("보") && com.equals("바위"))) {
			System.out.println("유저 승, 컴퓨터 패");
		}else {
			System.out.println("유저 패, 컴퓨터 승");
		}
	}
	
	void userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("가위바위보 : ");
		this.user = scan.nextLine();
	}
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0 : this.com = "가위"; break;
			case 1 : this.com = "바위"; break;
			case 2 : this.com = "보"; break;
		}
	}
	
	void play() {
		comInput();
		userInput();
		result();
	}
}