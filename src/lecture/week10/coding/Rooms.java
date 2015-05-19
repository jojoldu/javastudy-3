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
	
	private static boolean[][] newRooms = new boolean[MAX_H+1][MAX_W+1];
	
	public static boolean dfs(int height, int width){
		if(height == 0 && width == 0){
			for(int i=0;i<MAX_H; i++){
				for(int j=0;j<MAX_W;j++){
					newRooms[i][j] = rooms[i][j];
				}
			}
		}
		
		newRooms[height][width] = false;
		System.out.println(height + ": " + width);
		
		if(height == MAX_H-1 && width == MAX_W-1){
			System.out.println("성공");
			return true;
		}
		if(width > 0 && newRooms[height][width-1] && dfs(height, width-1)){
			return true;
		}
		if(width < MAX_W && newRooms[height][width+1] && dfs(height, width+1)){
			return true;
		}
		if(height > 0 && newRooms[height-1][width] && dfs(height-1, width)){
			return true;
		}
		if(height < MAX_H && newRooms[height+1][width] && dfs(height+1, width)){
			return true;
		}

		newRooms[height][width] = true;
		return false;
	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(dfs(0,0));
	}
}
