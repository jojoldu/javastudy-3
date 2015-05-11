package homework.week10;

public class Test5 {

	public static void main(String[] args) {
		int x = 12;
		int y = 6;
		
		calculate(x, y);
	}
	
	public static void calculate(int x, int y){
		
		while(true){
			if(x == y){
				System.out.println(x);
				break;
			
			}else if(x > y){
				x = x-y;
			
			}else if(x < y){
				y = y-x;
			}
			
		}
	}
}
