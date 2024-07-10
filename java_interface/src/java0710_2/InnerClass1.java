package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out = new Out();
		out.num = 100;
		out.obj.age = 34;
		out.obj.setName("이순신");
		
		Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();
		in.age = 20;
		in.setName("김유신");

	}

}

// static으로 선언 및 정의한 변수와 메서드는 인스턴스 메서드에서 사용 가능
// 인스턴스 변수, 메서드는 static 메서드에서 사용 불가

// static 붙은 건 프로그램 시작할 때 생성
// 나머지는 프로그램 실행 중 생성

class Out{
	static int count;  // 클래스 변수
	int num;  // 인스턴스 변수
	private String job;  // 인스턴스 변수
	인스턴스내부클래스 obj = new 인스턴스내부클래스();
	
	interface car{  // 내부 인터페이스
		void make();
	}
	
	void makeCar() {
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("익명 클래스를 통해 만들기");
			}
		};
	}
	
	void buyComputer() {  // 메소드 안에 만드는 변수는 모두 지역변수
		class 지역클래스{  // 메소드 내부에서 사용 가능한 클래스 / 메소드가 실행하기 전까지는 존재하지 않음, 메소드가 종료되면 사라짐
			int weight;
			void del() {
				
			}
		}
		지역클래스 ob = new 지역클래스();
	}
	
	static void save() {
		
	}
	
	static class 정적클래스{  // Out 클래스 객체에 속하지 않는다.
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	
	private class 인스턴스내부클래스{  // static 변수, 메서드 불가
		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
		static void create() {
			count = 10;
		}
	}
}

/*
	내부 클래스 : 클래스 내부에서만 사용 가능한 클래스
	1. 인스턴스 내부 클래스
	2. 정적 내부 클래스
	3. 지역 내부 클래스
	4. 익명 내부 클래스
*/