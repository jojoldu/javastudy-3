package lecture.week9.problem;

import java.util.List;

import lecture.week9.domain.Character;

public class Main {
	public static void main(String[] args) {
		CharacterList cl = new CharacterList();
		CharacterArray ca = new CharacterArray();

		List<Character> list = cl.getCharacters();
		Character[] array = ca.getCharacters();

		for(int i = 0; i < list.size(); i++) {
			Character c = list.get(i);
			System.out.println(c.toString());
		}

		System.out.println("############################");
		for(int i = 0; i < array.length; i++) {
			Character c = array[i];
			System.out.println(c.toString());
		}
	}
}
