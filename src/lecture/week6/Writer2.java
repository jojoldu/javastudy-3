package lecture.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import lecture.week6.interfaces.LineWriter;

public class Writer2 {
	
	public void write(String fileName, LineWriter lw){
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(fileName));
			String line = null;
			
			while((line = br.readLine()) != null){
				lw.write(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
