package u;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * ����: 1.��J���N���, ���<=100,�Y���A���d��Э��s���X��J��(���Ҽ{�t��)
		 *  2�p��X1+2+......��J��ƩM 
		 *  3.��X�p�⵲�G
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�Ʀr0��105");
		int number = input.nextInt();
		int a=0,i=0,sum=0;
		a=number;
		
		while(a>100) {
		System.out.println("�Э��s��J");
		a=input.nextInt();
		}
		if(a<=100) {
			for(i=0;i<=a;i++) {
			sum=sum+i;
			
			}
			System.out.println("���G="+sum);
		}
		
		
	}
}
