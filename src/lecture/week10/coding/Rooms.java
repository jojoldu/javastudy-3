package lecture.week10.coding;

public class Rooms {

	private static final int MAX_H=5, MAX_W=5;
	private static boolean[][] rooms = {
										{true, 	true, 	true, 	true, 	true},
										{false,	false,	true,	false,	true},
										{true,	false,	false,	true,	true},
										{false,	true,	true,	true,	false},
										{true,	true,	true,	true,	true}
									};	
	
	
	public static boolean dfs(int height, int width){
		
		rooms[height][width] = false;
		
		System.out.println(height + ": " + width);
		
		if(height == MAX_H-1 && width == MAX_W-1){
			System.out.println("성공");
			return true;
		}
		else if(width > 0 && rooms[height][width-1] && dfs(height, width-1)){
			return true;
		}
		else if(width < MAX_W && rooms[height][width+1] && dfs(height, width+1)){
			return true;
		}
		else if(height > 0 && rooms[height-1][width] && dfs(height-1, width)){
			return true;
		}
		else if(height < MAX_H && rooms[height+1][width] && dfs(height+1, width)){
			return true;
		}
		else{
			rooms[height][width] = true;
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(dfs(0,0));
	}
}
