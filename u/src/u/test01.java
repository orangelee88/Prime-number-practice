package u;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// 輸入1~100 查詢數字出現2的數字，共出現幾次?
		int a = 0, b = 0, c = 0, d = 0, sum = 0;
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數字" + "(1~99)");
		input = scanner.nextInt();
		while (input > 99) {
			System.out.println("超出範圍，請重新輸入");
			input = scanner.nextInt();
		}
		for (a = 1; a <= input; a++) {
			if (a == 2 || a == 20) {// 1~10出現2，包含20
				b = b + 1; // 累加2出現次數

			}
			if (a > 10 && a % 10 == 2) {// 1~100出現2
				c = c + 1;// 累加2出現次數

			}
			if (a - 20 <= 9 && a > 20) {// 21~29出現2
				d = d + 1;

			}
		}
		sum = b + c + d;
		System.out.println("數字1~" + input + "共出現" + "2為" + "(" + sum + ")" + "次");
	}
}
