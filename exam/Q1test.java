package travelsky.exam;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Q1test {

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 4, 5 };
		int[] arr2 = { 1, 3, 6, 7, 8 };

//		// 数组动态初始化建立一个新的数组，长度是两个数组长度之和
//		int[] arrTarget = new int[arr1.length + arr2.length];
//
//		// 遍历两个数组给新的数组赋值
//		for (int x = 0; x < arr1.length; x++) {
//			arrTarget[x] = arr1[x];
//		}
//
//		for (int x = arr1.length; x < arrTarget.length; x++) {
//			arrTarget[x] = arr2[x - arr1.length];
//		}
//		Arrays.sort(arrTarget);
		
		int[] arrTarget =mergeOut(arr1, arr2);

		for (int arr : arrTarget) {
			System.out.println(arr);
		}
	}

	// 写一个方法,形参是两个int数组，可以这样写，main方法的形参就是一个String数组。返回值类型也是一个int数组。 
	public static int[] mergeOut(int[] arr1, int[] arr2) {
		
		int[] arrTarget = new int[arr1.length + arr2.length];

		// 遍历两个数组给新的数组赋值
		for (int x = 0; x < arr1.length; x++) {
			arrTarget[x] = arr1[x];
		}

		for (int x = arr1.length; x < arrTarget.length; x++) {
			arrTarget[x] = arr2[x - arr1.length];
		}
		Arrays.sort(arrTarget);
		return arrTarget;

	}

}
