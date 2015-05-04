package homework.week8.solution.service;

import homework.week8.domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

	public Map<String, Object> get(int no){
		Map<String, Object> map = new HashMap<String, Object>();
	
		if(no > list.size()){
			
			map.put("result", false);
			map.put("message", "없는 회원번호입니다.");
			
		}else{
			Member member = list.get(no);
			
			if("박종기".equals(member.getName())){
				map.put("fastAge", "빠른생일입니다.");
			}
			
			if("김태영".equals(member.getName())){
				map.put("lookginJob", "구직중입니다.");
			}
			
			map.put("result", true);
			map.put("member", member);	
		}
		return map;
	}
	
	public void show(Map<String, Object> map){
		if((boolean) map.get("result")){
			Iterator<String> itr = map.keySet().iterator();
			while(itr.hasNext()){
				String key = itr.next();
				if(!"result".equals(key)){
					System.out.println(map.get(key).toString());
				}
			}
		}else{
			System.out.println(map.get("message"));
		}
		
	}
}
