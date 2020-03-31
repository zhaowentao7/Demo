package travelsky.exam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * 合并两个乱序数组并升序排序输出。
	示例：
	输入：
	arr1 = [10,5,4,5]
	arr2 = [1,3,6,7,8]
	输出：
	1,3,4,5,5,6,7,8,10
 */
public class Q1 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 4, 5 };
		int[] arr2 = { 1, 3, 6, 7, 8 };

		Q1 q1 = new Q1();
		List<Integer> result = q1.merge(arr1, arr2);
//		Set<Integer> result = q1.merge(arr1, arr2);
		
		for (int r : result) {
			System.out.println(r);
		}

	}
/*
 * 先把两个数组放入一个List集合，再用集合工具类对List进行排序。
 */
	public List<Integer> merge(int[] arr1, int[] arr2) {
		List<Integer> result = new ArrayList<Integer>(0);
		
//		Set<Integer> result = new HashSet<Integer>();
//		Set会去重，这一点就决定不能用Set。
		//增强for可以遍历数组和集合
		for (int a1 : arr1) {
			result.add(a1);
		}
		for (int a2 : arr2) {
			result.add(a2);
		}
		Collections.sort(result);//这个方法只能对List排序
		return result;
	}

}
