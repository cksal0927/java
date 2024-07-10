package java0710_1;

interface Animal1{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound();  // 추상 메서드 (interface에서는 추상 메서드가 기본으로 되어 있어서 abstract 따로 안 써도 됨
}

interface bird{
	public void fly();
}

class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}

class Pigeon1 implements Animal1, bird{  // 클래스는 부모 클래스 하나, interface는 여러 개 가능
	@Override
	public void sound() {
		System.out.println("구구");
	}
	@Override
	public void fly() {
		System.out.println("푸드득 비둘기 날다.");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon1 p = new Pigeon1();
		
		d.sound();
		c.sound();
		p.sound();

	}

}

/*
	클래스 상속
	1. 단일 상속 - 하나의 클래스만 상속 가능
	   자식 클래스는 하나의 부모 클래스만 가질 수 있다.
	   다른 클래스의 기능을 사용하려면 포함 관계로 구현
	   포함 관계
	   class A{  }
	   class B{
	   		A a = new A();
	   }
	   자동차 - 타이어, 엔진, 창문, 에어컨, 헨들...
	   자동차 - 소나타, 아반떼, 그랜저, 스포티지, 카니발...
	   
	2. 부모 클래스의 변수와 메서드를 상속받아 사용
	   부모 클래스의 public, protected, default 제어자 변수와 메서드만 상속
	   자식 클래스는 부모가 상속으로 주는 모든 것을 다 받아야 한다.
	   자식 클래스 입장에서는 선택지가 없다. 강제적 상속
	   
	3. 강한 결합
	   부모 클래스의 변경이 자식 클래스에 영향을 준다.
	   
	   
	인터페이스
	1. 다중 구현
	   클래스가 여러 개의 인터페이스를 연결하여 구현 가능
	   
	2. 유연성
	   클래스는 필요한 인터페이스를 조합하여 구현 가능
	   
	3. 약한 결합
	   클래스는 필요한 인터페이스만 구현하면 되므로 상속 관계일 때보다 유연성 증가 (상속보다 영향이 적음)
*/