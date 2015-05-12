package homework.week9;

import java.util.Scanner;

/**
 * 
 * 태영이는 다재다능한 개발자입니다.(모든것이 그의 관심 대상입니다.) 그래서 그에게는 개발자 친구가 많습니다.
 * 하지만 불행하게도 그의 친구들은 다재다능하지 않습니다. 
 * 각각의 친구는 2가지 주제에만 관심이 있고, 다른 주제로 이야기하는 것을 싫어합니다. 
 * 그래서 파티를 개최할 때마다 모두가 즐겁게 파티를 보내려면 어떤 친구를 초대할지가 큰 문제입니다.
 * 태영이는 그 동안의 경험으로 초대된 친구 모두가 하나 이상의 겹치는 주제가 있을 때 파티를 즐기는 것을 알았습니다.
 * (예를 들어, {1번 : "java", "c" }, {2번 : "c++", "php"}, {3번 : "javascript", "asp"}, {4번 : "javascript", "php"} 일 경우에
 * 2,3,4 를 초대해야 즐거운 파티가 될 수 있습니다. 1번은 자신과 공통된 주제를 가지는 사람이 없습니다.)
 * 
 * 문자열 배열 first, second가 주어집니다. 태영이의 i번째 친구가 흥미있는 기술은 first[i]와 second[i]입니다.
 * 즐거운 파티가 되려면 태영이가 초대할 수 있는 친구는 최대 몇명인지 출력하는 프로그램을 작성하세요.
 * 
 *  - first와 second의 길이는 같습니다.
 *  - first와 second의 최대길이는 50이하입니다.
 * 
 * @author dwlee
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		String[] first;
		String[] second;	
		
		while(input != -1){
			System.out.println("first 배열을 입력하세요");
			first = sc.nextLine().split(" ");
			System.out.println("second 배열을 입력하세요");
			second = sc.nextLine().split(" ");
			
			System.out.println("최대 초대가능한 친구의 수는 " + getMaxInvitation(first, second));
			
			System.out.println("계속하실꺼면 0을, 그만하실꺼면 -1을 입력하세요");
			input = Integer.parseInt(sc.nextLine());
		}
	}
	
	public static int getMaxInvitation(String[] first, String[] second){
		int max=0;
		boolean check=false;
		
		for(int i=0; i<first.length;i++){
			for(int j=0; j<first.length; j++){
				
				if(i != j){
					if(first[i].equals(first[j])){
						check = true;
					}else if(first[i].equals(second[j])){
						check = true;
					}else if(second[i].equals(first[j])){
						check = true;
					}else if(second[i].equals(second[j])){
						check = true;
					}				
				}
			}
			
			if(check){
				max++;
			}
		}
		
		return max;
	}
}
