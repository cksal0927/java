package java0702_2;

public class ClassObject {

	public static void main(String[] args) {
		
		System.out.println(Car.������);

		Car car1;
		
		car1 = new Car();  // carName, ��ⷮ, ���� ���� ����
		car1.carName= "�ҳ�Ÿ";
		car1.���� = "�ֹ���";
		car1.������ = "���";
		
		System.out.println(Car.������);
		
		Car car2 = new Car("�׷���", 3000, "�ֹ���");
		
		
		/*
		 	������ : �̸�, ����Ʈ, ����
		 		   ��ǿ�, 4580, 4.3
		 		   �����, 3485, 4.1
		 		   �����, 90930, 2.7
		 		   ������, 19200, 3.1
		 		   
		 	���Ҽ� �۰����� ������ ������ �Ҽ� ��ȸ���� ���� ����Ʈ �����̴�.
		 	�� ������ ������ �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ����ض�.
		 	(�Ű������� �ִ� ������ �޼���� �� �� �̻� ������ ��.)
		*/
		
		WebNovel author1 = new WebNovel("��ǿ�", 4580, 4.3f);
		WebNovel author2 = new WebNovel("�����", 3485, 4.1f);
		
		System.out.println(author1.name + " " + author1.rating);
		System.out.println(author2.point);
	}

}

// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ����
// Ŭ���� ����, �ν��Ͻ� ����
// �ν��Ͻ� ������ Ŭ���� ��ü ������ �޸� �Ҵ��� �ȴ�.
// Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
// Ŭ���� ������ ���α׷��� ������ �� �޸𸮿� �ε��ϸ鼭 �����ȴ�.

// ������ �޼��� - ��ü(�ν��Ͻ�) ������ ������ �� ���� �ʱ�ȭ ���ִ� �޼���
// ������ �޼��� - return�� �������� �ʴ´�.
//             ������ �޼��忡�� return Ÿ�� ������ �� �Ǳ� �����̴�.
// �����ε� ���� ����
// 		1. ���� Ŭ���������� ����
// 		2. �޼����� �̸� ����
// 		3. �Ű������� Ÿ�� �ٸ��� ����
//		4. �Ű������� ���� �ٸ�

class Car{
	static String ������ = "����";  // Ŭ���� ����
	
	String carName;  // �ν��Ͻ� ����
	int ��ⷮ;  // �ν��Ͻ� ����
	String ����;  // �ν��Ͻ� ����
	
	// ������ �޼���
	Car(){
		// ������ �޼����� ���� - �ν��Ͻ� ������ �ʱⰪ ����
		���� = "�ֹ���";  // new �����ڿ� ���� ��ü ������ ���� ������ �ֹ����� ����ȴ�.
	}
	
	// �Ű������� �ִ� ������ �޼���
	Car(String ����){
		this.���� = ����;
	}
	
	Car(String name, int cc, String fuel){
		this.carName = carName;
		��ⷮ = cc;
		this.���� = fuel;
	}
}

class WebNovel{
	String name;  // �̸� - �ν��Ͻ� ����
	int point;  // ����Ʈ ���� - �ν��Ͻ� ����
	float rating;  // ���� - �ν��Ͻ� ����
	
	WebNovel(){
		
	}
	
	WebNovel(String name){
		this.name = name;
	}
	
	WebNovel(String name, int point, float rating){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	public String toString() {
		return name + " " + point + "��  " + rating;
	}
}