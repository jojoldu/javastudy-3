package exam.test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int n = sc.nextInt();
		System.out.println("\n"+ n +"!�� ����� : "+fact(n));
		
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
