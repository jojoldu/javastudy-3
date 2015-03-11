package exam.test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int n = sc.nextInt();
		System.out.println("\n"+ n +"! 결과는 : "+fact(n));
		
	}
	
	public static int fact(int n){

		if(n == 1){
			System.out.print(n);
			return 1;
		}else{
			System.out.print(n+"*");
			return n*fact(n-1);
		}
	}
}
