package lecture.week8.problem;

public class Coffee {
	public void prepareReceipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void addSugarAndMilk() {
		System.out.println("설탕과 우유를 추가하는 중");
	}

	private void pourInCup() {
		System.out.println("컵에 따르는 중");
	}

	private void brewCoffeeGrinds() {
		System.out.println("필터를 통해서 커피를 우려내는 중");
	}

	private void boilWater() {
		System.out.println("물 끓이는 중");
	}
}
