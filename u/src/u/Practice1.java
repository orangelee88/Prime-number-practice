package u;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * 條件: 1.輸入任意整數, 整數<=100,若不再此範圍請重新跳出輸入框(不考慮負數)
		 *  2計算出1+2+......輸入整數和 
		 *  3.輸出計算結果
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入數字0到105");
		int number = input.nextInt();
		int a=0,i=0,sum=0;
		a=number;
		
		while(a>100) {
		System.out.println("請重新輸入");
		a=input.nextInt();
		}
		if(a<=100) {
			for(i=0;i<=a;i++) {
			sum=sum+i;
			
			}
			System.out.println("結果="+sum);
		}
		
		
	}
}
