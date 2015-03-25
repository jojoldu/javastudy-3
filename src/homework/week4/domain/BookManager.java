package homework.week4.domain;

public class BookManager {
	
	private Book[] bookList;
	
	public BookManager() {
		bookList=new Book[5];
	}

	public BookManager(Book[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList(){
		for(int i=0;i<bookList.length;i++){
			Book book = bookList[i];
			System.out.println(book.getTitle());
			
			if(book instanceof Magazine){
				((Magazine) book).addAppendix();
			}
		
		}
	}
	
	public void printTotalPrice(){
		int totalPrice = 0;
		for(int i=0;i<bookList.length;i++){
			Book book = bookList[i];
			totalPrice +=book.getPrice();
		}
		System.out.println("��ü å ������ �� : "+totalPrice);
	}
	
}
