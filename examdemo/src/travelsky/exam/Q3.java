package travelsky.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {

	public static void main(String[] args) {
		try {
			String s = readTxtFile(new File("D:/workspace18/examdemo/src/travelsky/exam/text.txt"));
			String[] split = s.split(" ");
			String resultString = "";
			for (String string : split) {
				String regex = "[\u4e00-\u9fa5]*";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(string);
				if (matcher.matches()) {
					resultString += string + " ";
				}
			}
			System.out.println(resultString);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String readTxtFile(File fileName) throws IOException {
		String result = "";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String read = null;
		while ((read = bufferedReader.readLine()) != null) {
			if (!"".equals(result)) {
				result += System.getProperty("line.separator");
			}
			result += read;
		}

		if (bufferedReader != null) {
			bufferedReader.close();
		}

		if (fileReader != null) {
			fileReader.close();
		}
		return result;
	}

}
