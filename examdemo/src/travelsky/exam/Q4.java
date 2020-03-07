package travelsky.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 设计一个函数，统计一个字符串中出现频率最高的字符及其出现次数， 并利用该函数对用户输入的任意字符串进行统计。
 */
public class Q4 {

	public static void main(String[] args) {
		String string = "aaaabbbccbab";
		count(string);
	}

	public static void count(String str) {
		if (str != null && !"".equals(str)) {
			
			Map<Character, Integer> resultmap = new HashMap<Character, Integer>();
			String out = "";
			for (char c : str.toCharArray()) {
				if (resultmap.containsKey(c)) {
					resultmap.put(c, resultmap.get(c) + 1);
				} else {
					resultmap.put(c, 1);
				}
			}
			
			System.out.println("resultmap"+resultmap);//{b=4, c=2, a=4}
			
			Collection<Integer> valuescollection = resultmap.values();//map的values方法只能返回Collection类型

			System.out.println("values"+valuescollection);//[4, 2, 4]
			Integer maxvalue = Collections.max(valuescollection);
			System.out.println("maxvalue"+maxvalue);
			
//			List<Integer> temp =(List<Integer>)values;//直接强转可以吗？不行，会报错
			List<Integer> valueslist =new ArrayList<Integer>(valuescollection);//
			
//			List<Integer> temp = new ArrayList<Integer>(0);
//			for (Integer i : values) {
//				temp.add(i);
//			}
			
			System.out.println("valueslist"+valueslist);//[4, 2, 4]
			
			
			Collections.sort(valueslist);//从小到大排，只能对list进行排序，不能对Collection排序。
//			Collections.sort(temp, new Comparator<Integer>() {
//				public int compare(Integer o1, Integer o2) {
//					return o2 - o1;
//				}
//			});
			
			System.out.println("sortedvalueslist"+valueslist);//[4, 4, 2]
			
//			int maxValue = temp.get(0);
			int maxValue = valueslist.get(valuescollection.size()-1);//temp集合已经从小到大排了，那取最后一个，一定是出现次数最大的。List有get方法，Collection没有。
			
			Set<Character> keySet = resultmap.keySet();
			System.out.println("keySet"+keySet);
			for (Character key : keySet) {
				if (resultmap.get(key) == maxvalue) {
//					out += key + ":" + max + ",";
					System.out.println(key+":"+maxvalue);
				}
			}
//			System.out.println(out);
		} else {
			System.out.println("输入有误");
		}
	}
}
