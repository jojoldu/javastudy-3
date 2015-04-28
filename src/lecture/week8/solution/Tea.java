package lecture.week8.solution;

public class Tea extends CaffeinBeverage {
	@Override
	public void addCondiments() {
		System.out.println("레몬를 추가하는 중");
	}

	@Override
	public void brew() {
		System.out.println("차를 우려내는 중");
	}
}
