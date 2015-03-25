package homework.week4;

import homework.week4.domain.Book;
import homework.week4.domain.BookManager;
import homework.week4.domain.Comics;
import homework.week4.domain.Magazine;
import homework.week4.domain.Novel;

public class Test2 {

	public static void main(String[] args) {
		Book[] bookList = new Book[5];

		Book book1 = new Magazine("에스콰이어", 6000);
		Book book2 = new Novel("뉴욕의 프로그래머", 12000);
		Book book3 = new Novel("모방범", 14000);
		Book book4 = new Comics("소라의 날개", 4200);
		Book book5 = new Comics("취업매니저", 4200);

		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		bookList[3] = book4;
		bookList[4] = book5;

		for(int i=0;i<bookList.length;i++){
			Book book = bookList[i];
			System.out.println(book.toString());
		}

		BookManager mgr = new BookManager(bookList);
		System.out.println("====책 목록====");
		mgr.printBookList();
		System.out.println();
		System.out.println("====책 가격 총합====");
		mgr.printTotalPrice();
	}
}
