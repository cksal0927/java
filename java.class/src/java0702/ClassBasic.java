package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		// ���ǵ� Ŭ���� Ÿ���� ���� ����
		// ������ ������ ������ ����
		// Ŭ���� Ÿ������ ������ ���� : ��ü �Ǵ� �ν��Ͻ�
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name = "�̼���";
		member1.age = 23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name = "������";
		member2.age = 34;
		
		// java - 495p, �޸�����ȭ��� - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram) ũ�⿡ ����
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ��� �����Ͽ�
		// ���� �����ϰ� ����ϼ��� (����Ʈ�� 3��)
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.goods = "������ 8";
		phone1.manage = "iOS";
		phone1.ram = 64;
		
		phone2.goods = "��Ʈ�ø� 2";
		phone2.manage = "�ȵ���̵�";
		phone2.ram = 256;
		
		phone3.goods = "������ SE";
		phone3.manage = "iOS";
		phone3.ram = 128;
		
		System.out.println(phone1.goods);
		System.out.println(phone1.manage);
		System.out.println(phone1.ram);
		
		System.out.println(phone2.goods);
		System.out.println(phone2.manage);
		System.out.println(phone2.ram);
		
		System.out.println(phone3.goods);
		System.out.println(phone3.manage);
		System.out.println(phone3.ram);
	}

}

// å ����� �� ���������� �����ϱ� ���� Ŭ���� ����
class Book{
	String title;
	int page;
}

// Ŭ���� - ���赵, ��ü - ��ǰ
// Ŭ���� - �ؾ��, ��ü - �ؾ
// Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
class Member{  // Member ��� �̸��� Ŭ���� ����
	String name;  // �̸�
	int age;  // ����
}

class Phone{
	String goods;
	String manage;
	int ram;
}