package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		// NullpointerException ���� : ��ü ���� �� �ؼ�
	
		
		
		try {
			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = null;
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println(10/0);
		}catch(NullPointerException n) {
			n.printStackTrace();  // ���� �޽��� Ȯ�� - �׽�Ʈ��
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			System.out.println("���ڿ� �Է���!");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�!");
		}
		
		System.out.println("���Ⱑ ���α׷� ��");
		
	}

}

/*
	���� ó��
	- ���α׷� ���� �߿� ���� �߻��ϸ� ��� ���α׷� ����
	- ���� ó���� ���ָ� ������ �߻��ص� ���α׷��� ������� ����
	- ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� ����
	- ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ���
*/