package java0717_3;

public class Mall {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics("E12001", "�����", 1702000, "�Ｚ");
		Clothing clo = new Clothing("C12032", "����", 42000, "S");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec, 3);  // ��ǰ�� ����
		shop.addCart(clo, 2);
		
		shop.showCart();

	}

}
