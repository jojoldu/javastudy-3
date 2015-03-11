package lecture.week2;

public class IfAndSwitch {
	public static void main(String[] args) {
		useSwitch1();
		//useSwitch2();
	}
	
	public static void ifAnd3(){
		int age = 25;
		String url;
		
		if(age >= 19){
			url = "19세이상.com";
		}else{
			url = "19세미만.com";
		}
	
		
		
//		url = (age > 19)? "19세이상.com" : "19세이상.com";
	}
	
	//������ �������? ������ �߸��Ǿ�����?
	public static void useSwitch1(){
		
		int num = 1;
		
		switch(num){
		case 1:
			System.out.println("1.");
		
		case 2:
			System.out.println("2.");
			
		case 3:
			System.out.println("3.");
		
		case 4:
			System.out.println("4.");
			
		case 5:
			System.out.println("5.");
		
		default:
			System.out.println("1~5.");
	
		}
	}
	
	//������ ����� �����Ѱ���?
	public static void useSwitch2(){
		
		String position = "부장";
		
		switch(position){
		case "부장":
			System.out.println("700");
			break;
		case "차장":
			System.out.println("600");
			break;
		case "과장":
			System.out.println("500");
			break;
		case "대리":
			System.out.println("400");
			break;
		case "주임":
			System.out.println("300");
			break;
		default:
			System.out.println("200");
			break;
		}
	}	
}
