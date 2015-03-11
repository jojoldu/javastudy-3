package homework.week2;

import java.util.Scanner;

public class Test3 {

	private static int[] mergeArr;
	private static int compare;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 배열을 입력하세요");
		String[] inputs1 = sc.nextLine().split(" ");
		int[] aArr = strArr2IntArr(inputs1);
		
		System.out.println("2번째 배열을 입력하세요");
		String[] inputs2 = sc.nextLine().split(" ");
		int[] bArr = strArr2IntArr(inputs2);	
		
		System.out.println("정렬방식을 선택해주세요. \n오름차순:asc, 내림차순:desc");
		String sort = sc.nextLine();
		compare = ("asc".equals(sort))? 1 : -1;
		
		merge(aArr, bArr);
		sort(sort);
	}
	
	public static int[] strArr2IntArr(String[] strArr){
		
		int[] intArr = new int[strArr.length];
		
		for(int i=0;i<strArr.length;i++){
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		return intArr;
	}
	
	public static void merge(int[] aArr, int[] bArr){
		int[] arr = new int[aArr.length + bArr.length];
		
		for(int i=0;i<arr.length;i++){
			
			if(i >= aArr.length){
				arr[i] = bArr[i - aArr.length];
			}else{
				arr[i] = aArr[i]; 
			}
		}
		
		int duplCount = 0;
		for(int i=0; i<arr.length-1; i++){
			int current = arr[i];
			
			for(int j=i+1; j<arr.length; j++){
				int other = arr[j];
				if(current == other){
					arr[i] = -1;
					duplCount++;
					break;
				}
			}
		}
		
		mergeArr = new int[arr.length - duplCount];
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] != -1){
				mergeArr[index++] = arr[i] * compare;
			}
		}
	}
	
	public static void sort(String sort){
		
		for(int i=1; i<mergeArr.length; i++){
			int temp = mergeArr[i];
			int swapIndex = i - 1;
			
			while((swapIndex >= 0) && mergeArr[swapIndex] > temp){
				mergeArr[swapIndex+1] = mergeArr[swapIndex];
				swapIndex--;
			}
			
			mergeArr[swapIndex+1] = temp;
		}
		for(int i=0;i<mergeArr.length; i++){
			System.out.print(mergeArr[i]*compare +" ");	
		}
	}
}
