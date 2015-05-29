package algospot.CLOCKSYNC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	private static int[][] switches = {
										{0,1,2},
										{3,7,9,11},
										{4,10,14,15},
										{0,4,5,6,7},
										{6,7,8,10,12},
										{0,2,14,15},
										{3,14,15},
										{4,5,7,14,15},
										{1,2,3,4,5},
										{3,4,5,9,13}
									  };
	
	private static int[] clocks;
	private static int[] switchesCount = new int[10];
	private static int minCount = 999999999;
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("CLOCKSYNC.txt");
		Scanner sc = new Scanner(file);
		int count = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<count;i++){
			String[] inputs = sc.nextLine().split(" ");
			for(int j=0;i<inputs.length;j++){
				clocks[j] = Integer.parseInt(inputs[j]);
			}
			
			

		}
	}
	
	public static boolean checkClocks(){
		int length = clocks.length;
		boolean result = true;
		
		for(int i=0;i<length;i++){
			if(clocks[i] != 12 || clocks[i] != 24){
				result = false;
			}
		}
		
		return result;
	}
	
	public static int clickSwitch(int clocksIndex){
		
		if(checkClocks()){
			return 1;
		}
		
		if(switchesCount[clocksIndex] > 3){
			
		}
		
		
		
	}
}