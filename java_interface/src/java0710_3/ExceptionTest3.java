package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Member member = new Member("�̼���", 1999);
		System.out.println(member.name + " " + member.birth);
		try{
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(member.age);
		
//		try {
//			// �ڵ�
//			if()
//				throw new NullPointerException("aa");
//			// �ڵ�
//		}catch(Exception e) {
//			System.out.println("���� ���� �߻�");
//		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	// setAge �޼��带 ȣ���Ͽ� age ���� �� �����ϴµ�
	// age ������ ���̸� ǥ���ϱ� ���� ������ 0���� ���� ���� ����Ǹ� �� �ȴ�.
	// ���� �������� �¾ ������ ���� �� 0���� ���� ���� ���´ٸ� �߸��� ���̴�.
	// �� ������ birth ������ ���� �߸��Ǿ��⿡ �߻��� �����̱⿡
	// setAge �޼��忡�� ó���ϴ� ���� �ƴ϶� ���� �ڵ忡�� �ذ��ؾ� �ϹǷ�
	// ���ܸ� �߻���Ű�� �Ѱ� �ֱ⸦ �Ѵ�.
	
	void setAge() {
		this.age = 2024 - birth;
		if(age<0) 
		throw new RuntimeException("�¾ ������ �߸��Ǿ����ϴ�.");
	}
	
	// throw - ���� �߻���Ű��
	// throws - ���� ó�� �̷��
	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age<0)
//				throw new RuntimeException("�¾ ������ �߸��Ǿ����ϴ�.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
}