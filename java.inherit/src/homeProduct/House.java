package homeProduct;

public abstract class House {

	boolean onOff;
	String brand;  // 제품 브랜드명
	int price;  // 제품 구매 가격
	
	House(){
		this.onOff = false;
	}
	
	House(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	protected abstract void power();  // 추상 메서드
	
}

// 추상 클래스 - class 앞에 abstract를 붙인다.
// 추상 클래스는 객체 생성 불가
// 추상 메서드를 가지고 있는 클래스는 반드시 추상 클래스가 되어야 한다.
// 부모 클래스가 추상 클래스라면 반드시 자식 클래스는 추상 메서드를 정의해야 한다.
// 부모의 추상 메서드를 재정의하지 않을 거라면 자식 클래스는 추상 클래스가 되어야 한다.