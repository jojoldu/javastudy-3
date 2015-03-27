package homework.week4.domain;

public class Magazine extends Book {

	
	public Magazine() {
		super();
	}
	public Magazine(String title, int price) {
		super(title, price);
	}

	public void addAppendix(){
		System.out.println("이번호 별책 부록은 에센스 입니다 ");
	}
}
