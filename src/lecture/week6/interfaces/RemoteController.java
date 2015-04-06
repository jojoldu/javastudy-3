package lecture.week6.interfaces;

/**
 * 인터페이스 선언시
 * 상수와 추상메소드만이 가능하다 
 * (java8 부터는 디폴트메소드와 정적 메소드가 추가되었다.)
 * @author user
 *
 */
public interface RemoteController {

	/**
	 * 아래와 같이 필드 선언시 MAX_VOLUME, MIN_VOLUME는 
	 * 변수인가? 상수인가?
	 * 스코프는?
	 */
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	
	
}
