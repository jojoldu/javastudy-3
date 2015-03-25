package homework.week4;

import java.util.Scanner;

/**
 * 삽입 정렬 구현
 * @author dwlee
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자들을 입력해주세요");
		String[] inputs = sc.nextLine().split(" ");
		int[] numbers = new int[inputs.length];
		
		for(int i=0;i<inputs.length;i++){
			numbers[i] = Integer.parseInt(inputs[i]);
		}
		
		insertSort(numbers);
	}
	
	public static void insertSort(int[] numbers){
		
		int temp=0;
		
		for(int i=1; i<numbers.length;i++){
			temp = numbers[i];
			int swapIndex = i-1;
			
			while((swapIndex >= 0 && numbers[swapIndex] > temp)){
				numbers[swapIndex+1] = numbers[swapIndex];
				swapIndex--;
			}
			
			numbers[swapIndex+1] = temp;
			System.out.print(i + "번째 정렬 : ");
			print(numbers);
			
		}
		
		System.out.print("최종 정렬 결과 : ");
		print(numbers);
	}
	
	public static void print(int[] numbers){
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
	}
}
