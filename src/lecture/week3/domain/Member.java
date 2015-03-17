package lecture.week3.domain;

/**
 * 각 키워드에 대해 설명하시오.
 * @author dwlee
 *
 */
public class Member {

	public String name;

	//바로 아래 부분은 꼭 선언해야하는가? 어떤 경우에 선언해야하는가?
	public Member() {}

	//위 부분 없이 아래 부분만 선언되면 어떻게 되는가?
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
