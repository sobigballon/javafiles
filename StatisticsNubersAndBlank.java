package learning_JAVA;

import java.util.Scanner;
/**
 * ��������һ���ַ���ͳ�����е����֣���ĸ���ո񣬼���������
 * @author Administrator
 *
 */

public class StatisticsNubersAndBlank {
	public static void main(String[] args) {
		int numbers=0,letters=0,blanks=0,others=0;
		char[] inputStringto;
		System.out.println("������һ���ַ���");
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
		System.out.println("����������ַ��У�");
		System.out.println("�����У�"+numbers);
		System.out.println("��ĸ�У�"+letters);
		System.out.println("�ո��У�"+blanks);
		System.out.println("���������У�"+others);
	}

}
