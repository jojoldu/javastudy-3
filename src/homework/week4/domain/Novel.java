package homework.week4.domain;

public class Novel extends Book {

	public Novel() {
		super();
	}

	public Novel(String title, int price) {
		super(title, price);
		setPrice(price);
	}

	@Override
	public void setPrice(int price) {
		price = (int)(price*0.8);
		super.setPrice(price);
	}	
}
