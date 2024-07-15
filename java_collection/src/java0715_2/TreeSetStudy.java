package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34);
		tree.add(45);
		tree.add(20);
		tree.add(9);
		tree.add(40);
		tree.add(15);
		tree.add(48);
		tree.add(2);
		tree.add(11);
		tree.add(39);
		
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.higher(30));  // 입력값보다 큰 값들 중에서 가장 가까운 값 검색
		System.out.println(tree.lower(19));  // 입력값보다 작은 값들 중에서 가장 가까운 값 검색
		System.out.println(tree.headSet(35));  // 입력값보다 작은 모든 값
		System.out.println(tree.tailSet(30));  // 입력값보다 큰 모든 값
		System.out.println(tree.subSet(10, 39));  // 입력값들의 사이 값 검색
		
		TreeSet<String> word = new TreeSet<>();
		word.add("이순신");
		word.add("문익점");
		word.add("장보고");
		word.add("김유신");
		word.add("정도전");
		word.add("박팽년");
		word.add("성상문");
		word.add("마골피");
		word.add("나훈아");
		
		System.out.println(word);
		System.out.println(word.higher("아"));
		System.out.println(word.headSet("라면"));
		System.out.println(word.subSet("나", "자"));
		System.out.println(word.subSet("ㄴ", "ㅇ"));  // 자음만으로는 검색 불가
		
		// 90점 이상 - 상위 10%
		// 70점 이상 - 상위 30%
		// 40점 이상 - 상위 80%
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90);
		rank.add(70);
		rank.add(40);
		
		// 나의 점수를 입력하여 상위 몇 프로인지 출력
		System.out.println("나의 점수 : ");
		int myScore = sc.nextInt();
		if(rank.lower(myScore) == 90) {
			System.out.println("나의 점수는 상위 10%");
		}else if(rank.lower(myScore) == 70) {
			System.out.println("나의 점수는 상위 30%");
		}else if(rank.lower(myScore) == 40) {
			System.out.println("나의 점수는 상위 80%");
		}
		
		
		TreeSet<String> score = new TreeSet<>();
		score.add("89점 이순신");
		score.add("67점 김유신");
		score.add("45점 문익점");
		score.add("98점 한석봉");
		score.add("72점 박문수");
		score.add("81점 김춘추");
		score.add("59점 이성계");
		score.add("32점 정약용");
		
		// 나의 점수를 입력하고 나보다 점수가 높은 사람들 출력
		System.out.println("나의 점수 : ");
		String me = sc.nextLine();
		System.out.println(score.tailSet(me));
		
	}

}

/*
	Tree 구조를 이용하여 값을 저장시키는 TreeSet
	- 순차적으로 데이터를 저장하지 않는다.
	- 중복 허용하지 않는다.
	- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력된다.
	- 범위 검색 또는 데이터 중 정렬에 용이하다.
*/