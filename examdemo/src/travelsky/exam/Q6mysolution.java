package travelsky.exam;

import java.util.Arrays;

import org.junit.Test;

/*
 * 既然a中元素的值是b中的位置，那么a这个数组的内容就不是随意的，必须是从0到数组长度n,都有，不0缺数，否则b数组就没有位置了。
 * 
 */

public class Q6mysolution {
	
	@Test
	public void test() {
		int [] a = { 1, 3, 2, 0 };
		int [] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = i;
		}
		System.out.println(Arrays.toString(b));
		
	}

}
