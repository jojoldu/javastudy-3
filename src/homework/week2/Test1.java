package homework.week2;

import java.util.Scanner;

public class Test1 {
	
	private static int inputCount;
	private static int outputCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("������ ������ ������ ���ڸ� �Է����ּ���");
			System.out.println("0�� �Է��ϸ� ���α׷��� �����մϴ�.");
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
		
		System.out.println("������ ���� " + outputCount + "����");
		for(int i=0;i<outputCount;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
