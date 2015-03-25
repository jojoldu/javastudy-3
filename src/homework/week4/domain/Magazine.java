package homework.week4.domain;

public class Magazine extends Book {

	
	public Magazine() {
		super();
	}
	public Magazine(String title, int price) {
		super(title, price);
	}

	public void addAppendix(){
		System.out.println("( �̹�ȣ ��å �η��� ������ �Դϴ�. )");
	}
}
