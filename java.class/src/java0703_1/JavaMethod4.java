package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {

		// �޼��带 ���Ͽ� ���� 10�� �޾� ����ϱ�
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println(num);
		
		// �޼���κ��� �� ������ ���ϱ� ��� �޾Ƽ� ����ϱ�
		int ��� = rm.sum();
		System.out.println(���);
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���� ����ϱ�
		String userName = rm.getName();
		int age = 34;
		System.out.println(userName + " " + age);
		
		// ����(89), ����(78), ����(50) �� ������ ������ ���ϴ� �޼���
		// �� ������ ����� ���ϴ� �޼���
		// ������ ��� ����ϱ�
		int ���� = rm.total();
		System.out.println("���� : " + ���� + "��");
		
		int ��� = rm.avg();
		System.out.println("��� : " + ��� + "��");
		
	}

}

class ReturnMth{
	int get() {
		return 10;
	}
	
	int sum() {
		int num1=30, num2=45;
		int result = num1 + num2;
		return result;
	}
	
	String getName(){
		String name = "�̼���";
		return name;
	}
	
	int total() {
		int kor=89, eng=78, mat=50;
		int totalScore = kor + eng + mat;
		return totalScore;
	}
	
	int avg() {
		int kor=89, eng=78, mat=50;
		int avgScore = (kor + eng + mat)/3;
		return avgScore;
	}
}

/*
 	�ֻ��� ����
 	
 	j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
 	�ֻ����� �ϳ�, �����̴�.
 	�ֻ����� ���� ū ����� �̱��.
 	
 	�ֻ��� ���� ���ϴ� �޼���
 	
 	�ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���

*/