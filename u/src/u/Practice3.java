package u;

import java.util.Scanner;

public class Practice3 {
  // Creat Project by NeivoHuang 2020/12/07
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����: ����: 1.��J���N���, ���<=100,�Y���A���d��Э��s���X��J��(���Ҽ{�t��) 2.�п�X���d��Ҧ����
		 * 
		 * �Ƶ�: ��Ʃw�q,���F1�M����,����Q��L�ƾ㰣 --------------------- <����>:�����D�� �ݨϥ����h�H�W�j��(�]�N�O�j��̥]�j��)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�Ʀr0��100");
		int number = input.nextInt();
		int a;
		boolean status = true;
		a = number;
		while (a > 100) {
			System.out.println("�Э��s��J");
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
			System.out.println(a + "�O���");
		} else {
			System.out.println(a + "���O���");
		}
	}
}
