package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// �ڹ� �⺻ ���� - ������Ʈ - ��Ű�� - Ŭ����
		
		System.out.println("�ڹ��׽�Ʈ");  // ���
		// �ڵ���� - ����ctrl + f11
		// �ڹ� ���� ����
		// -> ������Ÿ�� ���� �̸� = ������;
		// �������� �������� ����, �Ǽ�, ����
		// ���� - byte, short, int, long
		// ���� - char
		// �Ǽ� - float, double, longdouble
		
		byte num = 10;  // 1byte
		short num1 = 200;  // 2byte
		int num2 = 2323;  // 4byte
		long num3 = 234L;  // 8byte
		
		char ch = 'a';  // ''���� ����ǥ - ����, ""ū ����ǥ - ���ڿ�

		float fnum = 3.14f;
		double dnum = 12.3434;
		fnum = 35;
		
		boolean isTrue = false;
		
		String word = "�̼���";  // String�� Ŭ�����̴�.
		// Ŭ���� : ����� ���� Ÿ��
		
		// �簢���� ���̸� ���Ͻÿ�. (�غ��� ���̴� ����)
		int width = 15;
		int height = 20;
		int area = width * height;
		System.out.println("���� : " + area);
		
		// Ű���带 30�� �����ؾ� �Ѵ�.
		// hp ���̹� Ű������ ������ 8,000���̶�� �� ���� �ݾ��� ���ΰ�?
		int keyNum = 30;
		int keyPrice = 8000;
		int total = keyNum * keyPrice;
		System.out.println("�� ���� �ݾ� : " + total);
		System.out.print("java ��� ��� print");
		System.out.print(" �� �ٲ� �� �ȴ�.");
		System.out.printf(" print \n���");
		// ���� ���� - ���� ���� ����
		System.out.printf("�� �ݾ� : %d ", total);
		// %d - 10���� ����
		// %u - 10���� ����
		// %f - 10���� �Ǽ�
		// %c - ����
		// %s - ���ڿ�
		// %b - boolean(true, false)
		// %o - 8���� ����
		// %x - 16���� ����

		System.out.printf("���� : %d��, ���� : %d�� \n", 80, 90);
		
		System.out.printf(" ���� : %d, Ű : %f", 34, 172.3);
		System.out.println(172.315);
		System.out.print(172.315);
		System.out.printf("\n %.1f\n", 172.315);
		System.out.println(3);
		System.out.printf("%5d", 3);
		
		// num = 3.14;
		// num = "�̼���";
	}

}
