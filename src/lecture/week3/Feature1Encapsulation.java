package lecture.week3;

import lecture.week3.domain.Encapsulation;

public class Feature1Encapsulation {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		/*
		 *  e로 사용가능한 변수들은 어떤 것들이 있는가?
		 */
		System.out.println(e.publicVar);
		System.out.println(e.defaultVar);
		System.out.println(e.protectedVar);
		System.out.println(e.privateVar);
	}
}
