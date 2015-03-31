package lecture.week5.inheritance1;

public class Child extends Parent {

	private String school;
	
	public String getName(){
		return super.name;
	}
	
	public String getHouse(){
		return super.house;
	}
}
