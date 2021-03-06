package lecture.week9.solution;

import java.util.Iterator;
import lecture.week9.domain.Character;

public class Main {
	public static void main(String[] args) {

		CharacterList cl = new CharacterList();
		CharacterArray ca = new CharacterArray();

		Iterator i = cl.getIterator();
		Iterator i2 = ca.getIterator();

		showList(i);
		System.out.println("############################");
		showList(i2);

	}

	public static void showList(Iterator i) {
		while(i.hasNext()) {
			Character c = (Character)i.next();
			System.out.println(c.toString());
		}
	}
}
