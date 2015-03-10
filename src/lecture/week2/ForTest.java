package lecture.week2;

public class ForTest {
	
	public static void main(String[] args) {
		
		break1();
		//continue1();
		//continue2();
	}

	
	public static void break1(){
		
		int sum=0;
		
		while(true){
			
			for(int i=0;i<5;i++){
				
				sum+=i;
				
				if(i == 3){
					break;
				}
				
				if(sum == 10){
					break;
				}
			}
			sum++;
		}
		
		//System.out.println("sum : " + sum);
	}
	
	public static void continue1(){
		
		int sum=0;
		
		for(int i=0;i<10;i++){
			
			if(i%2 == 0){
				continue;
			}
			
			sum+=i;
		}
		System.out.println("1번 메소드의 총 합은 : "+sum);
	}
	
	
	
	
	public static void continue2(){
		
		int sum=0;
		
		for(int i=0;i<10;i++){
			
			if(i%2 != 0){
				sum+=i;
			}
		}
		System.out.println("2번 메소드의 총 합은 : "+sum);
	}
}
