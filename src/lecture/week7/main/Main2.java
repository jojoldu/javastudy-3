package lecture.week7.main;

import lecture.week7.dao.impl.ConsoleDao;
import lecture.week7.dao.impl.DbDao;
import lecture.week7.dao.impl.FileDao;
import lecture.week7.domain.Writer2;

public class Main2 {

	public static void main(String[] args) {
		String input = "메세지 : 안녕하세요 \n자바스터디 진행중입니다. \n많은 관심 부탁드립니다.";
		Writer2 w2 = new Writer2();
		
		//콘솔출력
		w2.write(input, new ConsoleDao());
		
		//DB저장
		w2.write(input, new DbDao());
		
		//파일 저장
		w2.write(input, new FileDao());
		
	}
}
