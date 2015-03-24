package lecture.week4;

/**
 * 메소드 오버로딩
 * @author dwlee
 *
 */
public class MethodOverloading {
	public static void main(String[] args) {
		
		//기본적인 메소드 오버로딩
		int int1 = 10;
		int int2 = 5;
		int int3 = 1;
		
		String str = "0";
		
		add(int1, int2);
		add(int1, int2, int3);
		add(str);
		
		
		
		//아래와 같은 경우에는 정상 출력이 가능한가??? 
		double double1 = 11.3;
		
		printDouble(int1, double1);
		printInt(int1, double1);
	}
	
	public static void add(int a, int b){
		System.out.println("a + b : " + (a+b));
	}
	
	public static void add(int a, int b, int c){
		System.out.println("a + b + c : " + (a+b+c));
	}
	
	public static void add(String str){
		System.out.println("숫자 넣어야죠??" + str);
	}
	
	
	public static void printDouble(double a, double b){
		System.out.println("double 2개");
	}
	
	public static void printint(int a, int b){
		System.out.println("int 2개");
	}
}
