package travelsky.exam;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			float a = 0;
			float b = 0;
			a = scanner.nextFloat();
			b = scanner.nextFloat();

			System.out.println(a > b ? a : b);
			scanner.close();
		} catch (Exception e) {
			System.out.println("输入有误，请重新输入");
			main(null);
		}

	}
}
