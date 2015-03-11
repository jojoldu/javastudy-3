package homework.week2;

import java.util.Scanner;

/**
 * 달팽이 배열출력
 * @author dwlee
 *
 */
public class Test2 {

	public static void main(String[] args){

		int num,n,i,j,k;

		Scanner input = new Scanner(System.in);
		System.out.print("크기를 입력하세요 : ");
		num=input.nextInt();

		int array[][]= new int[num][num];

		int element =1;
		j=0;

		for(n=num; n>0;n-=2){
			for(i=0;i<n;i++){
				array[j][j+i]=element;
				element++;

			}
			for(k=1;k<n;k++){
				array[j+k][num-j-1]=element;
				element++;
			}
			for(i=1;i<n;i++){
				array[j+k-1][num-1-j-i]=element;
				element++;
			}
			for(k=1;k<n-1;k++){
				array[num-1-j-k][j]=element;
				element++;
			}

			j++;
		}

		for(i=0;i<num;i++){
			for(j=0;j<num;j++){
				System.out.printf("%3d",array[i][j]);
			}
			System.out.println("");
		}
	}
}
