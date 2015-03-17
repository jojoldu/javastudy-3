package lecture.week3.domain;

public class Person {

	private String name;
	private String registerNumber;
	
	public Person() {}
	
	public Person(String name, String registerNumber) {
		this.name = name;
		this.registerNumber = registerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	@Override
	public String toString() {
		return "ObjectEquals [name=" + name + ", registerNumber="
				+ registerNumber + "]";
	}
}
