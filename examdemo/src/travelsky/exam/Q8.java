package travelsky.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		List<String> lists = new ArrayList<String>(0);

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						String string = merge(nums[i], nums[j], nums[k]);
						if (!lists.contains(string)) {
							lists.add(string);
							System.out.println(nums[i] + "," + nums[j] + ","
									+ nums[k]);
						}
					}
				}
			}
		}

	}

	public static String merge(int a, int b, int c) {
		List<Integer> list = new ArrayList<Integer>(0);
		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);
		return list.get(0) + "" + list.get(1) + list.get(2);
	}

}
