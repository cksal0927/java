package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] gm = new Game[7];
		
		gm[0] = new Game("���۸�����", "�׼�", "���ٵ�");
		gm[1] = new Game("���׿��극����", "AOS, MOBA", "Windows, Mac");
		gm[2] = new Game("������ġ", "����� ����", "Windows, PS4, XBO, Switch");
		gm[3] = new Game("�������", "FPS", "Windows");
		gm[4] = new Game("��Ʋ�׶���", "�����̹� ����", "Windows, XBO, PS4");
		gm[5] = new Game("�������", "���̽�", "Windows");
		gm[6] = new Game("īƮ���̴�", "���̽�", "Windows, XBO, PS4, Android, iOS");
		
		for(int i=0; i<gm.length; i++) {
			System.out.println(gm[i]);
		}

	}

}

// 7���� ���� ������ ���� ��ü�� �����ϰ� ����ϱ�