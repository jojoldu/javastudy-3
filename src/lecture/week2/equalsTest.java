package lecture.week2;

public class equalsTest {
	public static void main(String[] args) {
		
		//equalsAndSign();
		
		//correctEquals();
	}
	
	public static void equalsAndSign(){
		String str1 = "�̵���";
		String str2 = "�̵���";
		String str3 = new String("�̵���");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}
	
	public static void correctEquals(){
		
		String result = "";		
		//String result = null;
		
		if(result.equals("")){
			System.out.println("�ش������ �����ϴ�.");
		}else{
			System.out.println("������ �ֽ��ϴ�.");
		}
	}
}