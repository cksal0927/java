package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("F1234", "������� ���λ��", "�����ó� ���̰�"));
		book.add(new Book("H7651", "���̾�", "�츣�� �켼"));
		book.add(new Book("B1909", "���ΰ� �ٴ�", "��Ͻ�Ʈ ��ֿ���"));
		dvd.add(new DVD("M3004", "�ظ�����", "J. K. �Ѹ�"));
		dvd.add(new DVD("M3872", "Ʈ���϶���", "ĳ���� �ϵ���"));
		dvd.add(new DVD("M9682", "�ؿ��", "������"));
		
		// �뿩�ϱ�
		Library lib = new Library();
		lib.addRental(book.get(0), "���켮");
		lib.addRental(dvd.get(2), "������");
		lib.showRentalList();
		
//		Rental<Book> brent = new Rental<>(book.get(0), "���켮");
//		System.out.println(brent);
//		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "������");
//		System.out.println(rent);

	}

}
