package lecture.week2;

public class EqualsTest {
	public static void main(String[] args) {
		
		equalsAndSign();
		
		useStrEquals();
	}
	
	public static void equalsAndSign(){
		String str1 = "jojoldu";
		String str2 = "jojoldu";
		String str3 = new String("jojoldu");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}
	
	//올바른 equals의 사용법은?
	public static void useStrEquals(){
		
		String result = "";		
		//String result = null;
		
		if(result.equals("")){
			System.out.println("빈 문자열입니다.");
		}else{
			System.out.println("데이터가 있습니다.");
		}
	}
}
