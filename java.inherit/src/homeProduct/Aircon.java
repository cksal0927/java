package homeProduct;

public class Aircon extends House {
	
	static final String[] windText = {"미", "약", "강"};

	int wind = 0;
	int temperature;
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand, price);
	}
	
	void tempUP() {
		this.temperature++;
	}
	
	void tempDOWN() {
		this.temperature--;
	}
	
	void windControl() {
		wind++;
		if(wind == windText.length) wind=0;
		System.out.println("현재 바람세기 : " + windText[wind]);
	}
	
	@Override
	void power() {
		super.onOff =! super.onOff;
		System.out.println("에어컨 전원 : " + super.onOff);
	}
	
}
