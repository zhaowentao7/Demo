package travelsky.exam;

import java.util.Scanner;

/*
 * 编写一个程序，令用户输入两个数，比较它们的大小并输出较大者。
 （请注意，你需要考虑用户输入非数字的情况。）
 */

public class Q2mysolution {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入数字1");
			int num1 = scanner.nextInt();
			System.out.println("请输入数字2");
			int num2 = scanner.nextInt();

			int bigger = (num1 > num2 ? num1 : num2);
			System.out.println("较大的数是" + bigger);
		} catch (Exception e) {
			System.out.println("输入有误，请重新输入");
			main(null);//作用就是重新调用main方法
		}

	}

}
