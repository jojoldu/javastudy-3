package lecture.week8.solution;

public abstract class CaffeinBeverage {
	
	public final void prepareReceipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void addCondiments();
	public abstract void brew();

	private void pourInCup() {
		System.out.println("컵에 따르는 중");
	}

	private void boilWater() {
		System.out.println("물 끓이는 중");
	}
}
