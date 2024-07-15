package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq);
		
		for(int i=1; i<=5; i++) {
			System.out.println(pq.poll());
		}
		
		// 개발자가 정의한 클래스의 객체에서 우선순위를 정하려면 compare 메서드를 구현해야 한다.
		// 인터페이스 Comparator를 implements 해야 한다.
		
		Queue<String> q = new LinkedList<>();
		
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살구");
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());  // 다음 나갈 것 알려줌
		System.out.println(q);
		System.out.println(q.element());  // 다음 나갈 것 알려줌
		System.out.println(q.size());
		System.out.println(q.contains("복숭아"));

	}

}

/*
	Queue - 큐
	FIFO
*/