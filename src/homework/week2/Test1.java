package homework.week2;

import java.util.Scanner;

public class Test1 {
	
	private static int inputCount;
	private static int outputCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("숫자의 범위와 추출할 숫자를 입력해주세요");
			System.out.println("0을 입력하면 프로그램은 종료합니다.");
			String[] inputs = sc.nextLine().split(" ");

			inputCount = Integer.parseInt(inputs[0]);
			if(inputCount == 0){
				break;
			}
			outputCount = Integer.parseInt(inputs[1]);
			getRandomNum1();
			System.out.println("\n===================");
		}
		
	}
	
	public static void getRandomNum1(){
		int[] arr = new int[inputCount];
		
		for(int i=0;i<inputCount;i++){
			arr[i] = i+1;
		}
		
		int temp=0;
		for(int i=0;i<10;i++){
			int randomIndex = (int)(Math.random()*inputCount);	
			temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		
		System.out.println("랜덤한 숫자 " + outputCount + "개는");
		for(int i=0;i<outputCount;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
