package algospot.PICNIC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	static boolean[][] areFriends;
	static int students;
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("PICNIC.txt");
		
		Scanner sc = new Scanner(file);
		int count = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<count;i++){
			String input1 = sc.nextLine();
			students = Integer.parseInt(input1.split(" ")[0]);
			String[] friends = sc.nextLine().split(" "); 
			areFriends = new boolean[10][10];
			setFriends(friends);
			
			System.out.println(getPairCount(new boolean[10]));
		}
	}
	
	public static void setFriends(String[] friends){
		int length = friends.length;
		
		for(int i=0;i<length-1;i+=2){
			int first = Integer.parseInt(friends[i]);
			int second = Integer.parseInt(friends[i+1]);
			
			if(first < second){
				areFriends[first][second] = true;
			}else{
				areFriends[second][first] = true;
			}
		}
	}
	
	public static int getPairCount(boolean[] taken){
		int first = -1;
		
		for(int i=0;i<students;i++){
			if(!taken[i]){
				first = i;
				break;
			}
		}
		
		if(first == -1){
			return 1;
		}
		
		int result=0;
		
		for(int pair = first+1; pair<students ;pair++){
			if(!taken[pair] && areFriends[first][pair]){
				taken[first] = taken[pair] = true;
				result += getPairCount(taken);
				taken[first] = taken[pair] = false;				
			}
		}
		
		return result;
	}
}
