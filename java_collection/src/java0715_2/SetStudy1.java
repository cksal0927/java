package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add("¥���");
		����.add("������");
		����.add("������");
		����.add("�޲ٹ̺���");
		
		���.add("��ġ������");
		���.add("������");
		���.add("¥���");
		���.add("������");
		
		// ������ - �� �� �̻��� �׷쿡�� �������� ���� ����
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if(���.contains(����food)) {
				����.add(����food);
			}
		}
		System.out.println("����, ��� ������ : " + ����);
		
		// ������ - A���տ��� B���հ��� ������ �����͸� ������ ������ ����
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if(!���.contains(����food)) {
				������.add(����food);
			}
		}
		System.out.println("��ο� ���� ���� ������ : " + ������);
		
		// ������ - A���հ� B������ �� (�ߺ� ����)
		HashSet<String> ������ = new HashSet<>();
		������ = (HashSet<String>)����.clone();
		������.addAll(���);
		System.out.println("����, ����� ������ : " + ������);
		
		// ������ - addAll
		// ������ - retainAll   ����.retainAll(���);
		// ������ - removeAll   ����.removeAll(���);
		
		HashSet<Integer> num = new HashSet<>();
		
		while(num.size()<=10) {
			num.add(Integer.valueOf((int)(Math.random()*50)));
		}	
		
		// num1, num2, num3 �� ���� ������ ����� ���� 1~50 ������ ������ 15�� ����
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1, num2, num3�� ������
		
		HashSet<Integer> num1 = new HashSet<>();
		while(num1.size()<15) {
			num1.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		System.out.println(num1);
		
		HashSet<Integer> num2 = new HashSet<>();
		while(num2.size()<15) {
			num2.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		System.out.println(num2);
		
		HashSet<Integer> num3 = new HashSet<>();
		while(num3.size()<15) {
			num3.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		System.out.println(num3);
		
		// num1�� num3�� ������
		HashSet<Integer> ������1 = new HashSet<>();
		
		Iterator<Integer> �� = num1.iterator();
		while(��.hasNext()) {
			int ������1 = ��.next();
			if(num3.contains(������1)) {
				������1.add(������1);
			}
		}
		System.out.println("num1�� num3�� ������ : " + ������1);
		
		// num1�� num2�� ������
		HashSet<Integer> ������1 = new HashSet<>();
		
		�� = num1.iterator();
		while(��.hasNext()) {
			int ������1 = ��.next();
			if(!num2.contains(������1)) {
				������1.add(������1);
			}
		}
		System.out.println("num1�� num2�� ������ : " + ������1);
		
		// num2�� num3�� ������
		HashSet<Integer> ������2 = new HashSet<>();
		
		Iterator<Integer> ��2 = num2.iterator();
		while(��2.hasNext()) {
			int ������2 = ��2.next();
			if(num3.contains(������2)) {
				������2.add(������2);
			}
		}
		System.out.println("num2�� num3�� ������ : " + ������2);
		
		// num1, num2, num3�� ������
		HashSet<Integer> ������1 = new HashSet<>();
		������1 = (HashSet<Integer>)num1.clone();
		������1.addAll(num2);
		������1.addAll(num3);
		System.out.println("num1, num2, num3�� ������ : " + ������1);
		
		
		// ���� �Ͻ� ��
		HashSet<Integer> ������1_3, ������2_3, ��, ������2;
		
		������1_3 = (HashSet)num1.clone();
		������1_3.retainAll(num3);
		System.out.println(������1_3);
		
		������2_3 = (HashSet)num2.clone();
		������2_3.retainAll(num3);
		System.out.println(������2_3);
		
		�� = (HashSet)num1.clone();
		��.removeAll(num2);
		System.out.println(num1);
		
		������2 = (HashSet)num1.clone();
		������2.addAll(num2);
		������2.addAll(num3);
		System.out.println(������2);
		
//		HashSet<String> hash = new HashSet<>();
		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("���Į����");
//		hash.add("��������");
		
//		System.out.println(hash);
		
//		hash.remove("«��");
//		System.out.println(hash);
		
//		for(String food : hash) {
//			System.out.println(food);
//		}
		
//		ArrayList<String> list = new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3));
		
	}

}

/*
	Set �������̽�
	- HashSet, TreeSet
	- ������� ������� �ʴ´�.
	- �ߺ��� ������ �ʴ´�.
	- ���ؽ��� ����.
	- Set�� ����(�������� �׷�)�� �ٷ� �� ���ȴ�.
	- HashSet -> ������ ǥ��
	- TreeSet -> �˻��� Ưȭ
*/