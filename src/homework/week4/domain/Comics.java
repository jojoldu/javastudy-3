package homework.week4.domain;

public class Comics extends Book {

	public Comics() { }

	public Comics(String title, int price) {
		super(title, price);
		setPrice(price);
	}

	@Override
	public void setPrice(int price) {
		price = (int)(price*0.6);
		super.setPrice(price);
	}

	
}
