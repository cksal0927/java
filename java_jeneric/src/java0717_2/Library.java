package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Rental<? extends Media>> list = new ArrayList<>();
	
	public <T extends Media> void addRental(T item, String renter) {
		Rental<T> rental = new Rental<>(item, renter);
		list.add(rental);
		System.out.println("´ë¿© >> " + rental);
	}
	
	public void showRentalList() {
		for(Rental<? extends Media> r : list) {
			System.out.println(r);
		}
	}

}
