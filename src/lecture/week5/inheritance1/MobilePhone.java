package lecture.week5.inheritance1;

public class MobilePhone extends Phone{

	private String os;
	
	
	public MobilePhone() {}

	public MobilePhone(String os, String model, String color) {
		super(model, color);
		this.os = os;
	}

	public void useKakao(){
		System.out.println("카카오톡을 사용합니다.");
	}
	
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String getModel(){
		return super.model;
	}
	
	@Override
	public String toString() {
		return "MobilePhone [os=" + os + ", model=" + model + ", color="
				+ color + "]";
	}
}
