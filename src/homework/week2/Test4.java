package homework.week2;

import java.util.Scanner;

/**
 * �Է¹��� ���� �ڷᱸ��, �ٸ� �޼ҵ� ������� �ʰ� ���� ����ϴ� ���α׷�
 * @author dwlee
 *
 */
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		reverseNum(sc.nextInt());
	}
	
	public static void reverseNum(int num){
		int sum=0;
		int add=0;
		
		while(true) {
			
			if(num < 10){
				sum = sum*10 + num;
				break;
			}
			
			add = num%10;
			sum = sum*10 + add;
			num /= 10;
		}

		System.out.println("����� : " + sum);
	}
}
