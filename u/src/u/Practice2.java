package u;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����: 1.��J���N���, ���<=100,�Y���A���d��Э��s���X��J��(���Ҽ{�t��) 2.��X���d��"���"���
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�Ʀr0��100");
		int number = input.nextInt();
		int a = 0;
		int i = 0;
		a = number;

		while (a > 100) {
			System.out.println("�Э��s��J");
			a = input.nextInt();
		}
		if (a < 100) {
			for (i = 1; i <= a; i++) {
				if (i % 2 == 1) {
					System.out.println("�_��=" + i);
				}
			}
		}

	}
}
