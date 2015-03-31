package lecture.week5;

import lecture.week5.inheritance1.Parent;

public class Inheritance1Child extends Parent {

	private String school;
	
	public String getName(){
		return super.name;
	}
	
	public String getHouse(){
		return super.house;
	}
}
