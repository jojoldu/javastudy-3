package lecture.week3;

import lecture.week3.domain.Person;
import lecture.week3.domain.Person2;

/**
 * 객체의 비교
 * @author dwlee
 *
 */
public class ObjectEquals {
	
	public static void main(String[] args) {
		Person p1 = new Person("이동욱", "870912");
		Person p2 = new Person("이동욱", "870912");
		
		System.out.println(p1 == p2); //결과는?
		
		/*
		 * 위 2가지 객체는 다른 객체라고 할 수 있는가??
		*/
		System.out.println("===========================================");
		
		Person2 pp1 = new Person2("이동욱", "870912");
		Person2 pp2 = new Person2("이동욱", "870912");
		System.out.println(pp1.equals(pp2));
	}
}
