package homework.week5;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		int num = randomGenerator(5000);
		System.out.println(num + "을 입력하였습니다.");
		
		/**
		 * 문제풀이 코드 작성
		 */
		
		checkSelfNum(num);
	}

	public static int randomGenerator(int limit){
		return (int)((Math.random() * limit) +1);
	}
	
	
	public static void checkSelfNum(int num){
		int count = 0;
		int numCopy = num;
		int start = 0;
		boolean flag = false;
		
		while(numCopy >= 10){
			numCopy /= 10;
			count++;
		}
		
		start = num - (count * 10);
		
		for(int i=start;i<num;i++){
			int compare = i;
			int result = compare;
			
			while(compare > 0){
				result += compare % 10;
				compare /= 10;
			}
			
			if(result == num){
				flag = true;
			}
		}
		
		if(!flag){
			System.out.println(num + "는 셀프넘버입니다.");
		}
	}
}
