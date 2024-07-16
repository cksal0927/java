package Service;

import java.util.Scanner;

import DTO.Coffee;
import DTO.Tea;

public class Order implements Kiosk{
	
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Order(Coffee orderCoffee) {
		this.orderCoffee = orderCoffee;
	}
	
	public Order(Tea orderTea) {
		this.orderTea = orderTea;
	}

	@Override
	public void action() {
		
		// 주문 확인 및 결제 진행
		System.out.println("주문 메뉴 확인 ");
		System.out.println(orderCoffee!=null ? orderCoffee : orderTea);
		System.out.println("=== 결제 ===");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.결제 2.닫기 : ");
		if(sc.nextInt() == 2) return;
		Kiosk payment = new Payment(orderCoffee!=null ? orderCoffee : orderTea);
		payment.action();
		
	}

}
