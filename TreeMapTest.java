package someotherTest;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * �����ַ������ж��ַ����ֵĴ��������
 * ����
 * "dabcdababcabcea",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 * 
 * 
 */

public class TreeMapTest {
	public static void main(String[] args) {
		System.out.println("�������ַ���");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		//����TreeMap
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
//		���ַ���תΪ�ַ�����
		char[] ch=string.toCharArray();
//		�����ַ�����Ԫ�أ���������ͼ�У�������ӣ�������������롣
		for (char c:ch) {
			Integer t=tm.get(c);
			if(t==null) {
				tm.put(c, 1);
			}
			else {
				t++;
				tm.put(c, t);
			}
		}
		
		StringBuffer sb=new StringBuffer();
		
		Set<Character> keys=tm.keySet();
		for(char key:keys) {
			sb.append(key);
			sb.append("(");
			sb.append(tm.get(key));
			sb.append(")");
		}
		
		String s=sb.toString();
		
		System.out.println(s);
		
	}

}
