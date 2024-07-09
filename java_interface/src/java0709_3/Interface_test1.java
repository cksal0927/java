package java0709_3;

interface RestCustomer{  // �Ĵ翡 ã�ƿ��� �մ�
	public void setCustomer(String customer);
	public void food();
}

class ReserveCustomerA implements RestCustomer{  // ���� �մ� A
	String customer;  // ���� �մ�
	
	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " û���� �ش�"
	}
	
}

class ReserveCustomerB implements RestCustomer{  // ���� �մ� B
String customer;  // ���� �մ�
	
	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@Override
	public String food() {
		return customer + " ������ �ش�"
	}
}

class Owner{  // ����
	
}

public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReserveCustomerA a = new ReserveCustomerA();
		ReserveCustomerB b = new ReserveCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
		
	}

}

// ����
// �ʵ��л�, ���л�, ����л�, ���л�

// ��ȣ��, �˻�, �ҹ��, �ǻ�, ��ȭ��
// �̸�, ����, �ٹ���, ����, ����

// ����� ��û ó�� Ŭ����  - ��Ʈ�� Ŭ����
// ����� ��û�� �ʿ��� ������ ���� �� ���� ���� Ŭ����  - ���� Ŭ����
// �����͸� �����ϴ� Ŭ����  - ����ڿ��� ������ ������ Ŭ���� (VO, DTO)
//                    - ������ ���̽��� ������ ������ Ŭ���� (Entity)
// ������ ���̽� ó�� �������̽�  - repository