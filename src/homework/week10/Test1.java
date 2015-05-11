package homework.week10;

public class Test1 {

	public static void main(String[] args) {
		String str1 = "쿠팡";
		String str2 = "쿠팡";
		String str3 = new String("쿠팡");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}
}
