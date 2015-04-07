package lecture.week6.impl;

import java.io.File;
import java.io.FileWriter;

import lecture.week6.interfaces.LineWriter;

public class LineWriterFile implements LineWriter{

	private String filePath = "C:\\Users\\dwlee\\workspace\\JavaStudy\\result.txt";
	
	@Override
	public void write(String line){
        try{
            
            // 파일 객체 생성
            File file = new File(filePath) ;
             
            // true 지정시 파일의 기존 내용에 이어서 작성
            FileWriter fw = new FileWriter(file, true) ;
             
            // 파일안에 문자열 쓰기
            fw.write(line);
            fw.flush();
 
            // 객체 닫기
            fw.close(); 
             
             
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
