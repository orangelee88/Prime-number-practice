package u;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// ��J1~100 �d�߼Ʀr�X�{2���Ʀr�A�@�X�{�X��?
		int a = 0, b = 0, c = 0, d = 0, sum = 0;
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�Ʀr" + "(1~99)");
		input = scanner.nextInt();
		while (input > 99) {
			System.out.println("�W�X�d��A�Э��s��J");
			input = scanner.nextInt();
		}
		for (a = 1; a <= input; a++) {
			if (a == 2 || a == 20) {// 1~10�X�{2�A�]�t20
				b = b + 1; // �֥[2�X�{����

			}
			if (a > 10 && a % 10 == 2) {// 1~100�X�{2
				c = c + 1;// �֥[2�X�{����

			}
			if (a - 20 <= 9 && a > 20) {// 21~29�X�{2
				d = d + 1;

			}
		}
		sum = b + c + d;
		System.out.println("�Ʀr1~" + input + "�@�X�{" + "2��" + "(" + sum + ")" + "��");
	}
}
