package homework.week11;

public class BrokenRobot {

	private static double north=0.25, south=0.25, east=0.25,west=0.25;
	private static double success=0;
	private static boolean[][] ways = new boolean[100][100];
	
	public static void main(String[] args) {		
		success+=move(2, 50, 50);
		System.out.println("확률은 : "+success);
	}
	
	public static double move(int moveCount, int x, int y){
		
		if( moveCount == 1){
			return 1;
		}
		
		if(ways[x][y]){
			return 0;
		}

		ways[x][y] = true;
		double sum = 0;
		
		if(north!=0){
			sum += move(moveCount-1, x, y+1)* north;
		} 
		if(south!=0){
			sum += move(moveCount-1, x, y-1)* south;
		}
		if(east!=0){
			sum += move(moveCount-1, x+1, y)* east;
		}
		if(west!=0){
			sum += move(moveCount-1, x-1, y)* west;
		}
		
		ways[x][y] = false;
		return sum;
		
	}
	
}
