package lecture.week4.pattern.solution;

public class UserC implements User{

	@Override
	public void setUp(String config){
		Printer p = Printer.getInstance();
		p.setColor(config);	
	}
}
