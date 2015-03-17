package lecture.week3;

import lecture.week3.domain.Member;

/**
 * 객체는 call by reference? call by value? 
 * @author dwlee
 *
 */
public class ObjectCallBy {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "이동욱";
		System.out.println(m1.name);
		
		Member m2 = m1;
		m1.name = "윙스터디";
		System.out.println("m1 : "+ m1.name + " m2 : "+m2.name);
	}
}
