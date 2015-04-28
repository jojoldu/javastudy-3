package lecture.week8.solution;

public class Coffee extends CaffeinBeverage {
	
	@Override
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
	}

	@Override
	public void brew() {
		System.out.println("필터를 통해서 커피를 우려내는 중");
	}
}
