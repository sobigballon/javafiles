package projecttest;

import java.util.Scanner;

public class Regextest {
	public static void mian(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������QQ���룺");
		String qq=sc.nextLine();
		
		boolean flag=checkqq(qq);
		
		boolean flag2=checkQQ(qq);
		
		System.out.println(flag+" "+flag2);
		
	}
	
	public static boolean checkqq(String qq) {
		if(qq.matches("[1-9]{1}[0-9]{4,14}")) {
			return true;
			
		}
		return false;
	}
	
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// У�鳤��
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0���ܿ�ͷ
			if (!qq.startsWith("0")) {
				// �Ƿ��������ַ�
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}
