package lecture.week9.solution;

import java.util.Iterator;

import lecture.week9.domain.Character;

public class CharacterArray {

	private static final int MAX_VALUES = 6;
	private Character[] characters;
	private int index = 0;

	public CharacterArray() {
		characters = new Character[MAX_VALUES];
		addItem("홍길동","22","남");
		addItem("성춘향","19","여");
		addItem("강감찬","45","남");
		addItem("제다이","?","남");
	}

	public void addItem(String name, String age, String sex) {
		if(index >= MAX_VALUES) {
			System.out.println("array is full");
		} else {   
			Character c = new Character(name, age, sex);
			characters[index] = c;
			index++;
		}
	}

	public Iterator getIterator() {
		return new CharacterArrayIterator(characters);
	}
}
