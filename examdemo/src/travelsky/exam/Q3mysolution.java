package travelsky.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;


/*
 * 对于一个只存在英文单词、数字，和中文单词的文件text.txt，
       每个词中间是空格，通过正则表达式输出text.txt中的中文单词并用空格进行区分。
 */

public class Q3mysolution {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/eclipselunaworkspace/workspace18/Demo/examdemo/src/travelsky/exam/text.txt");
		byte[] bys =new byte[1024];
		int len =fis.read(bys);//这个方法虽然返回值是个int值，但这个方法的效果是把text.txt中的内容读到byte数组中,不信可以把这个数组输出看下。
//		System.out.println(Arrays.toString(bys));
		String textstringString =new String(bys,0,len);//一次读取一个字节数组，就是一次读取好多字节。
		System.out.println(textstringString);
		
		String[] stringarr= textstringString.split(" ");//把String以空格分隔,返回数组。
		System.out.println(Arrays.toString(stringarr));
		
		System.out.println(stringarr[0]);
//		System.out.println(stringarr[0].matches("\\w+"));
//		System.out.println("not".matches("\\w+"));
				
		
		
		for(String s : stringarr){
			if(s.matches("[\\u4e00-\\u9fa5]+")){//利用正则表达式判断输入内容是否全中文,+表示一个或多个中文，这个正则表达式能记住吗？
				System.out.print(s+" ");
			}
		}

	}

}
