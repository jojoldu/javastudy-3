package homework.week8.problem.service;

import homework.week8.domain.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
	
	private List<Member> list;
	
	public MemberService() {
		list = new ArrayList<Member>();
		list.add(new Member("이동욱", 29));
		list.add(new Member("박종기", 27));
		list.add(new Member("김태영", 27));
		list.add(new Member("이혜진", 27));
		list.add(new Member("서지연", 26));
		list.add(new Member("선재희", 26));
		list.add(new Member("김현주", 26));
	}

	public Member get(int no){
		return list.get(no);
	}
	
	public void show(Member member){
		System.out.println(member.toString());
	}
}
