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
			url = "19�� �̻�.com";
		}else{
			url = "19�� �̸�.com";
		}
	
		
		
//		url = (age > 19)? "19�� �̻�.com" : "19�� �̸�.com";
	}
	
	//������ �������? ������ �߸��Ǿ�����?
	public static void useSwitch1(){
		
		int num = 1;
		
		switch(num){
		case 1:
			System.out.println("1 �Դϴ�.");
		
		case 2:
			System.out.println("2 �Դϴ�.");
			
		case 3:
			System.out.println("3 �Դϴ�.");
		
		case 4:
			System.out.println("4 �Դϴ�.");
			
		case 5:
			System.out.println("5 �Դϴ�.");
		
		default:
			System.out.println("1~5�� �ƴ� �����Դϴ�.");
	
		}
	}
	
	//������ ����� �����Ѱ���?
	public static void useSwitch2(){
		
		String position = "����";
		
		switch(position){
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("600���� ");
			break;
		case "����":
			System.out.println("500����");
			break;
		case "�븮":
			System.out.println("400����");
			break;
		case "����":
			System.out.println("300����");
			break;
		default:
			System.out.println("200����");
			break;
		}
	}	
}
