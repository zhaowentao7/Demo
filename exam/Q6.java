package travelsky.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 这种做法给的数组a就更加随意，不是必须是从0到数组长度n都有。没有的那数组b的相应位置就是null。
 */

public class Q6 {

	public static void main(String[] args) {
		try {
			Integer [] a = { 1, 3, 0, 4 };
			int maxA = max(a);
			int bMaxLen = a.length - 1 > maxA ? a.length : maxA;
			Integer [] b = new Integer[bMaxLen + 1];
			for (int i = 0; i < a.length; i++) {
				b[a[i]] = i;
			}
			System.out.println(Arrays.toString(b));
			
//			for (Integer bi : b) {
//				System.out.println(bi);
//			}
		} catch (Exception e) {
			System.out.println("数据有误");
		}
	}

	public static int max(Integer[] arr) {
		List<Integer> asList = Arrays.asList(arr);
		List<Integer> list = new ArrayList<Integer>(asList);
		Integer max = Collections.max(list);
		return max;
	}

}
