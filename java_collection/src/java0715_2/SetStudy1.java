package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> 재학 = new HashSet<>();
		HashSet<String> 상민 = new HashSet<>();
		
		재학.add("짜장면");
		재학.add("볶음밥");
		재학.add("돈가스");
		재학.add("쭈꾸미볶음");
		
		상민.add("김치볶음밥");
		상민.add("떡볶이");
		상민.add("짜장면");
		상민.add("돈가스");
		
		// 교집합 - 두 개 이상의 그룹에서 공통적인 값의 집합
		HashSet<String> 공통 = new HashSet<>();
		
		Iterator<String> it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food = it.next();
			if(상민.contains(재학food)) {
				공통.add(재학food);
			}
		}
		System.out.println("재학, 상민 교집합 : " + 공통);
		
		// 차집합 - A집합에서 B집합과의 교집합 데이터를 제외한 데이터 집합
		HashSet<String> 차집합 = new HashSet<>();
		it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food = it.next();
			if(!상민.contains(재학food)) {
				차집합.add(재학food);
			}
		}
		System.out.println("상민에 대한 재학 차집합 : " + 차집합);
		
		// 합집합 - A집합과 B집합의 합 (중복 없이)
		HashSet<String> 합집합 = new HashSet<>();
		합집합 = (HashSet<String>)재학.clone();
		합집합.addAll(상민);
		System.out.println("재학, 상민의 합집합 : " + 합집합);
		
		// 합집합 - addAll
		// 교집합 - retainAll   재학.retainAll(상민);
		// 차집합 - removeAll   재학.removeAll(상민);
		
		HashSet<Integer> num = new HashSet<>();
		
		while(num.size()<=10) {
			num.add(Integer.valueOf((int)(Math.random()*50)));
		}	
		
		// num1, num2, num3 세 개의 집합을 만들고 각각 1~50 범위의 랜덤값 15개 저장
		// num1과 num3의 교집합
		// num1과 num2의 차집합
		// num2과 num3의 교집합
		// num1, num2, num3의 합집합
		
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
		
		// num1과 num3의 교집합
		HashSet<Integer> 교집합1 = new HashSet<>();
		
		Iterator<Integer> 넘 = num1.iterator();
		while(넘.hasNext()) {
			int 교지팝1 = 넘.next();
			if(num3.contains(교지팝1)) {
				교집합1.add(교지팝1);
			}
		}
		System.out.println("num1과 num3의 교집합 : " + 교집합1);
		
		// num1과 num2의 차집합
		HashSet<Integer> 차집합1 = new HashSet<>();
		
		넘 = num1.iterator();
		while(넘.hasNext()) {
			int 차지팝1 = 넘.next();
			if(!num2.contains(차지팝1)) {
				차집합1.add(차지팝1);
			}
		}
		System.out.println("num1과 num2의 차집합 : " + 차집합1);
		
		// num2과 num3의 교집합
		HashSet<Integer> 교집합2 = new HashSet<>();
		
		Iterator<Integer> 넘2 = num2.iterator();
		while(넘2.hasNext()) {
			int 교지팝2 = 넘2.next();
			if(num3.contains(교지팝2)) {
				교집합2.add(교지팝2);
			}
		}
		System.out.println("num2과 num3의 교집합 : " + 교집합2);
		
		// num1, num2, num3의 합집합
		HashSet<Integer> 합집합1 = new HashSet<>();
		합집합1 = (HashSet<Integer>)num1.clone();
		합집합1.addAll(num2);
		합집합1.addAll(num3);
		System.out.println("num1, num2, num3의 합집합 : " + 합집합1);
		
		
		// 쌤이 하신 거
		HashSet<Integer> 교집합1_3, 교집합2_3, 차, 합집합2;
		
		교집합1_3 = (HashSet)num1.clone();
		교집합1_3.retainAll(num3);
		System.out.println(교집합1_3);
		
		교집합2_3 = (HashSet)num2.clone();
		교집합2_3.retainAll(num3);
		System.out.println(교집합2_3);
		
		차 = (HashSet)num1.clone();
		차.removeAll(num2);
		System.out.println(num1);
		
		합집합2 = (HashSet)num1.clone();
		합집합2.addAll(num2);
		합집합2.addAll(num3);
		System.out.println(합집합2);
		
//		HashSet<String> hash = new HashSet<>();
		
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨칼국수");
//		hash.add("맑은곰탕");
		
//		System.out.println(hash);
		
//		hash.remove("짬뽕");
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
	Set 인터페이스
	- HashSet, TreeSet
	- 순차대로 저장되지 않는다.
	- 중복이 허용되지 않는다.
	- 인텍스가 없다.
	- Set은 집합(데이터의 그룹)을 다룰 때 사용된다.
	- HashSet -> 집합을 표현
	- TreeSet -> 검색에 특화
*/