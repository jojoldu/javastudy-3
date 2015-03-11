package homework.week2;

import java.util.Scanner;

/**
 * 입력받은 숫자를 별도의 자료구조와 라이브러리 도움없이 역순으로 출력하는 프로그램
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

		System.out.println("����� : " + sum);
	}
}
