package travelsky.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {

		int n = 5;
		int o = 1;
		for (int i = 0; i < n; i++) {
			String out = "";
			List<Integer> list = new ArrayList<Integer>(0);
			for (int j = 0; j <= i; j++) {
				int num = o++;
				list.add(num);//确定第i行放到一个集合里面
			}
//			System.out.println(list);
			if (i % 2 == 1) {//如果第i行是奇数，就把集合翻转一下
				Collections.reverse(list);
			}
			for (int k = 0; k < list.size(); k++) {//把第i行输出
				if (k < list.size() - 1) {
					out += list.get(k) + "*";
				} else {
					out += list.get(k);
				}
			}
			System.out.println(out);
		}
	}

}
