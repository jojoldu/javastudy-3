package lecture.week7.domain;

import lecture.week7.dao.Dao;

public class Writer2 {
	public void write(String input, Dao dao){
		System.out.println("입력한 데이터를 받습니다.");
		System.out.println("데이터를 한줄 한줄 읽어들입니다.");
		System.out.println("저장할 차례입니다.");
		
		System.out.println("총 문자개수는 : "+ input.length());
		dao.save(input);
		
		System.out.println("모든 처리가 끝났습니다. \n종료합니다.");
	}
}
