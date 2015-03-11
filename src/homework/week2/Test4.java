package homework.week2;

import java.util.Scanner;

/**
 * 입력받은 숫자 자료구조, 다른 메소드 사용하지 않고 역순 출력하는 프로그램
 * @author dwlee
 *
 */
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
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

		System.out.println("결과는 : " + sum);
	}
}
