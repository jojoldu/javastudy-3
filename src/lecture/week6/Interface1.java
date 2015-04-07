package lecture.week6;

import lecture.week6.impl.AudioController;
import lecture.week6.impl.TelevesionController;
import lecture.week6.interfaces.RemoteController;

public class Interface1 {

	public static void main(String[] args) {
		RemoteController rc;
		
		/*
		 * 변경이 일어나는 부분을 어뎁터를 갈아끼우듯이 사용할 수 있다.
		 */
		rc = new TelevesionController();
		//rc = new AudioController();
		
		rc.setVolume(5);
		rc.showVolume();
	}
}
