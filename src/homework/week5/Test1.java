package homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = randomGenerator(8);
		
		System.out.println("입력 리스트" + list.toString());
		
		/**
		 * 문제풀이 코드 작성
		 */
		
		getShortestDistance(list);
	}
	
	public static List<Integer> randomGenerator(int size){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<size;i++){
			list.add((int)(Math.random()*100 + 1));
		}
		
		return list;
	}
	
	public static void getShortestDistance(List<Integer> list){
		int size = list.size();
		int min = 100;
		int result1 = 0, result2 = 0;
		
		for(int i=0;i<size;i++){
			int num1 = list.get(i);
			
			for(int j=i+1;j<size;j++){
				int num2 = list.get(j);
				int distance = Math.abs(num1-num2);
						
				if(distance < min){
					min = distance;
					result1 = num1;
					result2 = num2;
				}
			}
		}
		System.out.println("최단거리는 : " + result1 + ", " + result2);
	}
}
