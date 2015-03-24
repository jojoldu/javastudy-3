package lecture.week4.pattern.solution;

/**
 * 어떻게 하면 a, b, c가 각각 설정한 프린터 설정값들이 모두에게 공유될까?
 * @author dwlee
 *
 */
public class SetPrint {

	public static void main(String[] args) {
		
		UserA a = new UserA();
		UserB b = new UserB();
		UserC c = new UserC();
		
		a.setUp("9층 공용 프린터");
		b.setUp("192.176.36.156");
		c.setUp("white");
		
		System.out.println(Printer.getInstance().toString());
	}
}
