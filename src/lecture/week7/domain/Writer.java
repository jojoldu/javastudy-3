package lecture.week7.domain;

public class Writer {

	public void write(String input){
		System.out.println("입력한 데이터를 받습니다.");
		System.out.println("데이터를 한줄 한줄 읽어들입니다.");
		System.out.println("저장할 차례입니다.");
		
		System.out.println("저장하지 않고, 콘솔로 출력합니다.");
		System.out.println(input);
		
		System.out.println("모든 처리가 끝났습니다. \n종료합니다.");
	}
}
