package lecture.week2;

public class EqualsTest {
	public static void main(String[] args) {
		
		//equalsAndSign();
		
		//useStrEquals();
	}
	
	public static void equalsAndSign(){
		String str1 = "이동욱";
		String str2 = "이동욱";
		String str3 = new String("이동욱");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}
	
	public static void useStrEquals(){
		
		String result = "";		
		//String result = null;
		
		if(result.equals("")){
			System.out.println("해당사항이 없습니다.");
		}else{
			System.out.println("정보가 있습니다.");
		}
	}
}
