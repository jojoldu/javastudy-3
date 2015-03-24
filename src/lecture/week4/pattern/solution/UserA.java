package lecture.week4.pattern.solution;

public class UserA implements User{

	@Override
	public void setUp(String config){
		Printer p = Printer.getInstance();
		p.setName(config);
	}
}
