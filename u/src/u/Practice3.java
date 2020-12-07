package u;

import java.util.Scanner;

public class Practice3 {
  // Creat Project by NeivoHuang 2020/12/07
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 條件: 條件: 1.輸入任意整數, 整數<=100,若不再此範圍請重新跳出輸入框(不考慮負數) 2.請輸出此範圍所有質數
		 * 
		 * 備註: 質數定義,除了1和本身,不能被其他數整除 --------------------- <提示>:有些題目 需使用雙層以上迴圈(也就是迴圈裡包迴圈)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入數字0到100");
		int number = input.nextInt();
		int a;
		boolean status = true;
		a = number;
		while (a > 100) {
			System.out.println("請重新輸入");
			a = input.nextInt();
		}
		if (a < 100) {
				for (int b = 2; b <= a; b++) {
					if (a % b == 0 && a != b)
						status = false;
					break;
			}
		}
		if (status == true) {
			System.out.println(a + "是質數");
		} else {
			System.out.println(a + "不是質數");
		}
	}
}
