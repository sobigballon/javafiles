package learning_JAVA;
/**
 * 主要测试Arrays的sort()和BinarySearch()
 * 
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayAndSortAndBinarySearch {
	static Random rand=new Random();
	static String ssourse="fjdksjfksjfksdjf"+
							"JDKJFISDHIFSHIF";
	static char[] src=ssourse.toCharArray();
//	Create a random String
	public static String randonString(int length) {
		char[] buf=new char[length];
		int rad;
		for(int i=0;i<length;i++) {
			rad=Math.abs(rand.nextInt())%src.length;
			buf[i]=src[rad];
		}
		return new String(buf);
	}
//	Create a random array of Strings:
	public static
	String[] randStrings(int length,int size) {
		String[] s=new String[size];
		for(int i=0;i<size;i++) {
			s[i]=randonString(length);
		}
		return s;
	}
//打印byte[]数组	
	public static void print(byte[] b) {
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
		System.out.println( );
	}
	
//	重写方法，打印字符串
	public static void print(String[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+" ");
		}
		System.out.println( );
	}
	
	public static void main(String[] args) {
		byte[] b=new byte[15];
		rand.nextBytes(b);
		print(b);
		Arrays.sort(b);
		print(b);
		int loc=Arrays.binarySearch(b, b[10]);
		System.out.println("Location of "+b[10]+"="+loc);
//		测试sort和search
		String[] s=randStrings(4,10);
		print(s);
		Arrays.sort(s);
		print(s);
		loc=Arrays.binarySearch(s, s[4]);
		System.out.println("Location of "+s[4]+"="+loc);
	}

}
