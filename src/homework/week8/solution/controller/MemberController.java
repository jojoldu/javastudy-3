package homework.week8.solution.controller;

import homework.week8.solution.service.MemberService;

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
			
			service.show(service.get(no));
			System.out.println();
			
		}
	}	
}
