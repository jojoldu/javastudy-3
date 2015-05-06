package lecture.week9.solution;

import java.util.Iterator;
import lecture.week9.domain.Character;

public class CharacterArrayIterator implements Iterator{
	private Character[] c;
	private int index = 0;

	public CharacterArrayIterator(Character[] c) {
		this.c = c;
	}

	public boolean hasNext() {
		if(index >= c.length || c[index] == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		Character character = c[index];
		index++;
		return character;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
