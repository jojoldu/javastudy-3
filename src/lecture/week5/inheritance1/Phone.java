package lecture.week5.inheritance1;

public class Phone {
	protected String model;
	protected String color;
	
	public Phone() {
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	protected void call(String callee){
		System.out.println(callee + "에게 전화를 겁니다.");
	}
}
