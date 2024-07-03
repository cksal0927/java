package java0703_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("�̼���", 31, "����");
		Member member2 = new Member("������", 29, "�����������");
		Member member3 = new Member("�念��", 45, "�߸�");
		
		member1.birth(member1);
		member2.birth(member2);
		member3.birth(member3);
		
		// ���� - 20���ΰ�? 30���ΰ�? 40���ΰ�?
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		// ���� �з� - �������� �з��� ���� ǥ��
		// ��� ���� - �̼��� : 0.5����
		DataIdenti jobIdenti = new DataIdenti();
		jobIdenti.jobCode(member1.name, member1.job);
		jobIdenti.jobCode(member2.name, member2.job);
		jobIdenti.jobCode(member3.name, member3.job);
		
//		System.out.println(today.getMonthValue());
		
		// ���� -> .getYear();
		// �� -> .getMonthValue();
		// �� -> .getDayOfMonth();
		// ���� ->.getDayOfWeek().getValue();
		// 1(������), 2(ȭ����), ..., 7(�Ͽ���)
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int week = cal.get(Calendar.DAY_OF_WEEK);
		
//		System.out.println(year);
		
//		Date today = new Date();
//		System.out.println(today.get);

	}

}

// �޼��峪 �Լ��� ����ϴ� ����
// �迭, ���, �ܼ� ��� - �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ��������.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.

class Member{
	String name;  // �̸�
	int age;  // ����
	String job;  // ����

	// �⺻ ������ �޼���
	Member(){	}
	
	// �Ű������� �ִ� ������ �޼���
	Member(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// �¾ ���� ����ϴ� �޼���
	void birth(Member member) {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
					
		// ȭ�� ��� - �̼��� �¾ ���� : 0000��
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s �¾ ���� : %d�� \n", this.name, birthYear1);
	}
}

class Cat{
	
}

// ��Ʈ�ѿ� Ŭ����, ���� ����� ���� Ŭ����, ������ Ŭ����
// Controller, Service, DTO(VO)

class DataIdenti{  // ���ɴ�, ���� �з� �� ������ �з��� ���� Ŭ����
	void ageGroup(String name, int age) {
		String group = null;
		group = (age/10) + "0��";
		System.out.println(name + " : " + group);
	}
	
	// ���� ���� �з�
	// ���� - 05.����
	// �߸� - 04.��ȸ����
	// ����������� - 18.�����Ǻ�
	void jobCode(String name, String job) {
		String code = null;
		
		// if(job.equals("����"))
		switch(job) {
		case "����" : code = "05.����";
			break;
		case "�߸�" : code = "04.��ȸ����";
			break;
		case "�����������" : code = "18.�����Ǻ�";
		}
		
		System.out.println(name + " ���� : " + code);
	}
}