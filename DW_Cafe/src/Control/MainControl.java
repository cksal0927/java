package Control;

import java.util.TreeMap;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree);
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(12));  // �Է��� ���� ã�ų� ������ ���� ����� ���� ��
		System.out.println(tree.floorEntry(12));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));  // �Է��� ������ ���� ����� ���� ��
		System.out.println(tree.higherKey(40));  // �Է��� ������ ���� ����� ū ��
		
//		System.out.println("=== DW ī�� �ֹ� Ű����ũ ===\n");
//		System.out.println("=== ȭ���� ��ġ���� ������ ===\n");
//		Kiosk kiosk = new SelectDrink();
//		
//		kiosk.action();

	}

}