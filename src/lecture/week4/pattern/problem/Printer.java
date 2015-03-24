package lecture.week4.pattern.problem;

public class Printer {
	
	private String name;
	private String ip;
	private String color;
	
	public Printer() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", ip=" + ip + ", color=" + color
				+ "]";
	}
}
