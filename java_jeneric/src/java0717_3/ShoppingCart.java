package java0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<CartItem<? extends Product>> list = new ArrayList<>();
	
	public <T extends Product> void addCart(T item, int quan) {
		CartItem<T> cart = new CartItem<>(item, quan);
		list.add(cart);
	}
	
	public void showCart() {
		for(CartItem<? extends Product> cart : list) {
			System.out.println(cart);
		}
	}

}
