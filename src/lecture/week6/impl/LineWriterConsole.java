package lecture.week6.impl;

import lecture.week6.interfaces.LineWriter;

public class LineWriterConsole implements LineWriter{

	@Override
	public void write(String line){
		System.out.println(line);
	}
}
