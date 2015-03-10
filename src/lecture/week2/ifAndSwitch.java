package lecture.week2;

public class IfAndSwitch {
	public static void main(String[] args) {
		useSwitch1();
		//useSwitch2();
	}
	
	public static void ifAnd3(){
		int age = 25;
		String url;
		
		if(age > 19){
			url = "19세 이상.com";
		}else{
			url = "19세 미만.com";
		}
	
		
		
//		url = (age > 19)? "19세 이상.com" : "19세 미만.com";
	}
	
	//다음의 결과값은? 무엇이 잘못되었나요?
	public static void useSwitch1(){
		
		int num = 1;
		
		switch(num){
		case 1:
			System.out.println("1 입니다.");
		
		case 2:
			System.out.println("2 입니다.");
			
		case 3:
			System.out.println("3 입니다.");
		
		case 4:
			System.out.println("4 입니다.");
			
		case 5:
			System.out.println("5 입니다.");
		
		default:
			System.out.println("1~5가 아닌 숫자입니다.");
	
		}
	}
	
	//다음의 방식은 가능한가요?
	public static void useSwitch2(){
		
		String position = "과장";
		
		switch(position){
		case "부장":
			System.out.println("700만원");
			break;
		case "차장":
			System.out.println("600만원 ");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		case "대리":
			System.out.println("400만원");
			break;
		case "주임":
			System.out.println("300만원");
			break;
		default:
			System.out.println("200만원");
			break;
		}
	}	
}
