package learning_JAVA;

import java.util.Scanner;
/**
 * 需求，输入一串字符，统计其中的数字，字母，空格，及其他符号
 * @author Administrator
 *
 */

public class StatisticsNubersAndBlank {
	public static void main(String[] args) {
		int numbers=0,letters=0,blanks=0,others=0;
		char[] inputStringto;
		System.out.println("请输入一串字符：");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		inputStringto=inputString.toCharArray();
		for(int i=0;i<inputStringto.length;i++) {
			if(inputStringto[i]>='0'&&inputStringto[i]<='9') {
				numbers++;
			}else if(('a'<inputStringto[i]&&inputStringto[i]<'z')||
					('A'<inputStringto[i]&&inputStringto[i]<'Z')) {
				letters++;
			}else if(inputStringto[i]==' ') {
				blanks++;
			}else {
				others++;
			}
		}
		System.out.println("您所输入的字符中：");
		System.out.println("数字有："+numbers);
		System.out.println("字母有："+letters);
		System.out.println("空格有："+blanks);
		System.out.println("其他符号有："+others);
	}

}
