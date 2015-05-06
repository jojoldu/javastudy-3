package lecture.week9.solution;

import java.util.ArrayList;
import java.util.Iterator;

import lecture.week9.domain.Character;

public class CharacterList {
	private ArrayList<Character> characters;

	public CharacterList() {
		characters = new ArrayList<Character>();
		addItem("탐크루즈","41","남");
		addItem("안젤리나졸리","33","여");
		addItem("디아나","31","여");
		addItem("러셀크로","41","남");
	}

	public void addItem(String name, String age, String sex) {
		Character c = new Character(name, age, sex);
		characters.add(c);
	}

	public Iterator getIterator() {
		return characters.iterator();
	}
}
