package homework.week3;

import java.util.Scanner;

/**
 * A씨는 아침 잠이 많아 매일 2/3의 확률로 회사에 지각한다. 
 * A씨의 팀장님은 3일 연속 지각했을 때는 A씨를 혼낸다. 
 * A씨가 5, 10, 20일 출근할 때 한번도 혼나지 않을 확률을 계산해주는 프로그램을 작성하시오.
 * 
 * @author dwlee
 *
 */
public class Test1 {

	private static final double LATE_RATE = 0.66;
	private static double totalRate; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = -1;
		
		while(count!=0){
			totalRate=0;
			System.out.println("A씨의 출근횟수를 입력하세요:");
			count=sc.nextInt();

			checkLate(count,1,0);
			double result = Double.parseDouble(String.format("%.3f", (1-totalRate)));

			System.out.println("A씨가 혼나지 않을 확률은: "+ (result*100)+"%");
			System.out.println("==========================================");
		}
	}

	private static void checkLate(int count, double thisRate, int index){
		//		System.out.println(count+"번째 : "+Double.parseDouble(String.format("%.3f", thisRate)));
		//		System.out.println("토탈: "+Double.parseDouble(String.format("%.3f", totalRate)));

		if(index==3){//3연속 지각했을 때
			totalRate+=thisRate;
			index=0;
			return;
		}
		if(count==0){
			return;
		}

		//이번에 지각 했을 때
		checkLate(count-1,thisRate*LATE_RATE,index+1);

		//이번에 지각 안했을 때면 그전에 2일연속 지각했다 하더라도 다시 지각체크를 해야하므로 index=0
		checkLate(count-1,thisRate*(1-LATE_RATE),0);

	}
}
