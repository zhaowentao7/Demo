package travelsky.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;


/*
 * 按指定的方式打印输出回环金字塔数列。
 */
public class Q5mysolution {

	public static void main(String[] args) {
		 star(5);
//		test();
//		multiplicationtable();

	}

	public static void multiplicationtable() {
		for (int i = 1; i <= 9; i++) {// 决定有几列

			for (int j = 1; j <= i; j++) {// 从第1到第i列

				System.out.print(j + "*" + i + "=" + (i * j) + " ");

			}
			System.out.println();// 作用就是换行
		}

	}
	
	public static void star(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("    ");

			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}
    @Test
	public void test() {
		int out = 1;
		for (int i = 1; i < 5; i++) {
				for (int j = 1; j <= i; j++) {
					int out1 = out++;
					System.out.print(out1+" ");
				}
				
				System.out.println();
		}
	}

    @Test
	public void test1() {//失败
		int out = 1;
		for (int i = 1; i < 5; i++) {//i是决定第几行
			if (i % 2 != 0) {//奇数行的时候怎么样
				for (int j = 1; j <= i; j++) {
					int out1 = out++;
					System.out.print(out1+" ");
				}
				System.out.println();
			} else {//偶数行的时候怎么样
				for (int j = 1; j <= i; j++) {
					int out1 = out+i-1;
					int out2 =out1-1;
					
					if(j == 1){
						System.out.print(out1+" ");
					}else {
						System.out.print(out2+" ");
					}
				}
				System.out.println();
			}

		}

	}
    @Test
    public void outtest(){
    	int [] arr = {1,2,3};
    	int [ ] arr2 = {4,5};
    	int[]arr3={7,8};
    	int arr4 [] = {10,11};
    	
    	
    }
    
    
    
    

}
