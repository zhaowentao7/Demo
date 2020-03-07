package travelsky.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q7 {
	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 2, 2, 2, 2, 3, 6, 3, 4, 4 };
		count(arr);
	}

	public static void count(Integer[] intArr) {

		Map<Integer, Integer> result = new HashMap<Integer, Integer>(0);
		List<Integer> out = new ArrayList<Integer>(0);
		List<Integer> resultList = new ArrayList<Integer>(0);
		for (Integer i : intArr) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		Collection<Integer> values = result.values();
		List<Integer> temp = new ArrayList<Integer>(0);
		for (Integer i : values) {
			temp.add(i);
		}
		Collections.sort(temp, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		Set<Integer> keySet = result.keySet();
		List<Integer> arr = new ArrayList<Integer>(0);
		for (Integer i : keySet) {
			arr.add(i);
		}
		Collections.sort(arr, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		List<Integer> used = new ArrayList<Integer>();
		for (Integer i : temp) {
			if (!used.contains(i)) {
				used.add(i);
				for (Integer k : arr) {
					if (result.get(k) == i) {
						out.add(k);
					}
				}
			}
		}
		for (Integer o : out) {
			for (Integer i : intArr) {
				if (i == o) {
					resultList.add(i);
				}
			}
		}
		System.out.println(resultList);
	}
}
