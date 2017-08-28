package someotherTest;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 输入字符串，判断字符出现的次数并输出
 * 例：
 * "dabcdababcabcea",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * 
 * 
 */

public class TreeMapTest {
	public static void main(String[] args) {
		System.out.println("请输入字符串");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		//创建TreeMap
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
//		将字符创转为字符数组
		char[] ch=string.toCharArray();
//		遍历字符数组元素，若存在树图中，则个数加１，不存在则存入。
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
