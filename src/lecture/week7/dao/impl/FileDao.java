package lecture.week7.dao.impl;

import lecture.week7.dao.Dao;

public class FileDao implements Dao{

	@Override
	public void save(String input){
		System.out.println("FileInputStream 을 open 합니다.");
		System.out.println(input + "\n위 데이터를 byte로 전환합니다.");
		System.out.println("input stream으로 데이터를 전송합니다.");
		System.out.println("전송이 완료되었습니다.");
		System.out.println("FileInputStream을 close 합니다.");
	}
}
