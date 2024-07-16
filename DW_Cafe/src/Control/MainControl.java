package Control;

import java.util.TreeMap;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree);
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(12));  // 입력한 값을 찾거나 없으면 가장 가까운 작은 값
		System.out.println(tree.floorEntry(12));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));  // 입력한 값에서 가장 가까운 작은 값
		System.out.println(tree.higherKey(40));  // 입력한 값에서 가장 가까운 큰 값
		
//		System.out.println("=== DW 카페 주문 키오스크 ===\n");
//		System.out.println("=== 화면을 터치하지 마세요 ===\n");
//		Kiosk kiosk = new SelectDrink();
//		
//		kiosk.action();

	}

}
