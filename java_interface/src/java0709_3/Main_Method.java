package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
		
		move c = new cat();
		move d = new dog();
		c.moving();
		d.moving();

	}

}

class cat implements move{
	@Override
	public void moving() {
		System.out.println("��ӻ�� �̵��Ѵ�.");
	}
}

class dog implements move{
	@Override
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}

interface move{
	static int a=10;
	public void moving();
}

/*
	�������̽� : �߻�Ŭ������ �� ����
	- �߻� �޼��常 ����
	- �ν��Ͻ� ���� �Ұ�
	- static ����, static �޼��� ���� ����
	- ��ü ���� �Ұ�
	- Ŭ�����鿡 ����Ǿ� ���
	- ������ ������ ���� ���
	- ���α׷��� �⺻Ʋ ���� ����
	
	�������� Ŭ���̾�Ʈ���� ������ ����
	Ŭ���̾�Ʈ�� ��û�� �޾��ִ� �޼���
	Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼���
*/