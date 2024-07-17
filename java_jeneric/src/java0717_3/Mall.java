package java0717_3;

public class Mall {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics("E12001", "냉장고", 1702000, "삼성");
		Clothing clo = new Clothing("C12032", "바지", 42000, "S");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec, 3);  // 상품과 수량
		shop.addCart(clo, 2);
		
		shop.showCart();

	}

}
