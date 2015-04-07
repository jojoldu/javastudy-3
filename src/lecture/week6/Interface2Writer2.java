package lecture.week6;

import lecture.week6.impl.LineWriterConsole;
import lecture.week6.impl.LineWriterFile;

public class Interface2Writer2 {

	public static void main(String[] args) {
	
		String fileName = "C:\\Users\\dwlee\\workspace\\JavaStudy\\abc.txt";

		//콘솔 출력
		Writer2 w1 = new Writer2();
		w1.write(fileName, new LineWriterConsole());
		
		
		//파일 생성
		Writer2 w2 = new Writer2();
		w2.write(fileName, new LineWriterFile());
	}
}
