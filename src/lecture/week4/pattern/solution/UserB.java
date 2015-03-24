package lecture.week4.pattern.solution;

public class UserB implements User{

	@Override
	public void setUp(String config){
		Printer p = Printer.getInstance();
		p.setIp(config);		
	}
}
