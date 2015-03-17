package lecture.week3.domain;

/**
 * 캡슐화란?
 *  - 객체의 필드, 메소드를 하나로 묶고, 실제 구현 내용을 감추는 것을 말한다.
 *    자바에서는 캡슐화된 멤버를 노출시킬 것인지, 숨길것인지를 결정하기 위해 '접근제한자' 를 사용한다.
 *    
 * @author dwlee
 *
 */
public class Encapsulation {

	public String publicVar = "publicVar";
	String defaultVar = "defaultVar";
	protected String protectedVar = "protectedVar";
	private String privateVar = "privateVar";
	
	
}
