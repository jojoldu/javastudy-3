package homework.week8.problem.controller;

import homework.week8.problem.service.MemberService;

import java.util.Scanner;


public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		Scanner sc = new Scanner(System.in);
		int no = -2;
		
		while(true){
			System.out.println("찾으시는 회원의 회원번호를 입력해주세요");
			System.out.println("-1을 입력하면 프로그램은 종료합니다.");
			no = sc.nextInt();
			
			if(no == -1){
				System.out.println("프로그램이 종료 됩니다.");
				break;
			}
			
			System.out.println("입력하신 회원번호는 "+ no + "입니다.");
			
			service.show(service.get(no));
			System.out.println();
			
		}
	}	
}
