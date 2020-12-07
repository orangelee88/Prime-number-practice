package u;

import java.util.Scanner;
import java.util.Random;

public class password {

	public static void main(String[] args) {
		Random ran = new Random();
		int x = ran.nextInt(100) + 1;
		Scanner input = new Scanner(System.in);
		int y;

		do {
			System.out.println("½Ð¿é¤J¼Æ¦r(1~100)");
			y = input.nextInt();
			if (x == y)
				System.out.println("BINGO");
			else if (y > x)
				System.out.println("too big");
			else
				System.out.println("too small");
		} while (x != y);
	}
}
