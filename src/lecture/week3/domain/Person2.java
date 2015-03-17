package lecture.week3.domain;

public class Person2 {
	private String name;
	private String registerNumber;
	
	public Person2() {}
	
	public Person2(String name, String registerNumber) {
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

	@Override
	public boolean equals(Object obj) {
		Person2 compare = (Person2)obj;
		
		boolean nameCheck = this.name.equals(compare.getName());
		boolean registerNumCheck = this.registerNumber.equals(compare.registerNumber);
		
		return ( nameCheck && registerNumCheck ) ? true : false;
	}
}
