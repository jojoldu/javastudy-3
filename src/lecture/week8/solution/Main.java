package lecture.week8.solution;

public class Main {
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		System.out.println("\nCoffee를 만듭니다.");
		coffee.prepareReceipe();
		
		Tea tea = new Tea();
		System.out.println("\nTea를 만듭니다.");
		tea.prepareReceipe();
	}
}
