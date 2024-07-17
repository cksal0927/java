package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("F1234", "가면산장 살인사건", "히가시노 게이고"));
		book.add(new Book("H7651", "데미안", "헤르만 헤세"));
		book.add(new Book("B1909", "노인과 바다", "어니스트 헤밍웨이"));
		dvd.add(new DVD("M3004", "해리포터", "J. K. 롤링"));
		dvd.add(new DVD("M3872", "트와일라잇", "캐서린 하드윅"));
		dvd.add(new DVD("M9682", "해운대", "윤제균"));
		
		// 대여하기
		Library lib = new Library();
		lib.addRental(book.get(0), "변우석");
		lib.addRental(dvd.get(2), "김혜윤");
		lib.showRentalList();
		
//		Rental<Book> brent = new Rental<>(book.get(0), "변우석");
//		System.out.println(brent);
//		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "김혜윤");
//		System.out.println(rent);

	}

}
