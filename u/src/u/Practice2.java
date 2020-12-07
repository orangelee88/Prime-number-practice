package u;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 條件: 1.輸入任意整數, 整數<=100,若不再此範圍請重新跳出輸入框(不考慮負數) 2.輸出此範圍的"基數"顯示
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入數字0到100");
		int number = input.nextInt();
		int a = 0;
		int i = 0;
		a = number;

		while (a > 100) {
			System.out.println("請重新輸入");
			a = input.nextInt();
		}
		if (a < 100) {
			for (i = 1; i <= a; i++) {
				if (i % 2 == 1) {
					System.out.println("奇數=" + i);
				}
			}
		}

	}
}
