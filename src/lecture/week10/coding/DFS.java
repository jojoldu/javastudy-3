package lecture.week10.coding;

public class DFS {

	private static final int h=5, w=5;
	private static int[][] dp = new int[h+1][w+1];

	
	public static void main(String[] args) {
		System.out.println(dfs(0,0));
	}
	
	public static int dfs(int width, int height){
		if(width > w || height > h) return 0;
		
		if(width == w && height == h) return 1;
		
		if(dp[width][height] != 0) return dp[width][height];
		
		return dp[width][height] = dfs(width+1, height) + dfs(width, height+1);
	}
}
