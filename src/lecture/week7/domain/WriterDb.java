package lecture.week7.domain;

public class WriterDb {
	
	public void write(String input){
		System.out.println("입력한 데이터를 받습니다.");
		System.out.println("데이터를 한줄 한줄 읽어들입니다.");
		System.out.println("저장할 차례입니다.");
		
		System.out.println("DB Connection을 open 합니다.");
		System.out.println(input + "\n위 데이터를 쿼리로 전환합니다.");
		System.out.println("insert 쿼리를 보냅니다.");
		System.out.println("DB 저장이 완료 되었습니다.");
		System.out.println("DB Connection을 close 합니다.");
		
		System.out.println("모든 처리가 끝났습니다. \n종료합니다.");
	}
}
