package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] gm = new Game[7];
		
		gm[0] = new Game("슈퍼마리오", "액션", "닌텐도");
		gm[1] = new Game("리그오브레전드", "AOS, MOBA", "Windows, Mac");
		gm[2] = new Game("오버워치", "히어로 슈팅", "Windows, PS4, XBO, Switch");
		gm[3] = new Game("서든어택", "FPS", "Windows");
		gm[4] = new Game("배틀그라운드", "서바이벌 슈팅", "Windows, XBO, PS4");
		gm[5] = new Game("테일즈런너", "레이싱", "Windows");
		gm[6] = new Game("카트라이더", "레이싱", "Windows, XBO, PS4, Android, iOS");
		
		for(int i=0; i<gm.length; i++) {
			System.out.println(gm[i]);
		}

	}

}

// 7개의 게임 정보를 가진 객체를 생성하고 출력하기