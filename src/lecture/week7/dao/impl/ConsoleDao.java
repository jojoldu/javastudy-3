package lecture.week7.dao.impl;

import lecture.week7.dao.Dao;

public class ConsoleDao implements Dao {
	
	@Override
	public void save(String input){
		System.out.println("저장하지 않고, 콘솔로 출력합니다.");
		System.out.println(input);
	}
}