package lecture.week7.dao.impl;

import lecture.week7.dao.Dao;

public class DbDao implements Dao {
	
	@Override
	public void save(String input){
		System.out.println("DB Connection을 open 합니다.");
		System.out.println(input + "\n위 데이터를 쿼리로 전환합니다.");
		System.out.println("insert 쿼리를 보냅니다.");
		System.out.println("DB 저장이 완료 되었습니다.");
		System.out.println("DB Connection을 close 합니다.");
	}
}
