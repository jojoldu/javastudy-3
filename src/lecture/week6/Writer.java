package lecture.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Writer {

	public void write(String fileName){
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(fileName));
			String line = null;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
