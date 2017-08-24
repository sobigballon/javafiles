package projecttest;

/*
 * 1:String,StringBuffer,StringBuilder的区别?
 * A:String长度固定，StringBuffer和StringBuilder的长度可变。
 * B:StringBuffer线程安全，效率低。StringBuilder线程不安全，效率高。
 * 
 * 2:StringBuffer和数组的区别
 * A:StringBuffer的长度可变，可以存储任意数据类型，最终结果其实是一个字符串。
 * B:数组长度固定，存储同一种数据类型的元素。
 * 
 * 3:看程序写结果：
 * 		String作为参数传递，StringBuffer作为参数传递
 * 
 * 		String是一种特殊的引用类型，在作为参数传递的时候，可以当作基本类型来看。因为它传递的也是常量值。
 * 		
 */

public class StringBuffertest {
	public static void main(String[] args) {
		// StringBuffer()： 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		// StringBuffer(20)： 构造一个其中不带字符的字符串缓冲区，其初始容量为 20 个字符。
		StringBuffer sb1=new StringBuffer(20);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		// StringBuffer("hello world!")： 构造一个其中不带字符的字符串缓冲区，其初始容量为 字符串长度 个字符。
		StringBuffer sb2=new StringBuffer("hello world!");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2.append("JAVA!"));
		System.out.println(sb2.insert(5, " java"));
//		System.out.println(sb2.reverse());
		String s=new String(sb2);
		System.out.println(s instanceof String);
		String s1="abcdefg";
		StringBuffer sb3=new StringBuffer(s1);
		System.out.println(sb3.reverse());
		int[] arr = { 11, 22, 33, 44, 55 };
		StringBuffer sb4=new StringBuffer();
		String s3=arr.toString();
		System.out.println(s3 instanceof String);
		
		String s4 = "hello";
		String s5 = "world";
		System.out.println(s4 + "---" + s5); // hello---world
		change(s4, s5);
		System.out.println(s4 + "---" + s5);// world---worldworld???

		StringBuffer sb6 = new StringBuffer("hello");
		StringBuffer sb5 = new StringBuffer("world");
		System.out.println(sb6 + "---" + sb5);// hello---world
		change(sb6, sb5);
		System.out.println(sb6 + "---" + sb5); // world---worldworld???
		
		
	}
	
	public static void change(StringBuffer sb1, StringBuffer sb2) {
		System.out.println(sb1 + "---" + sb2);// hello---world
		sb1 = sb2;// sb1="world"
		sb2 = sb1.append(sb2); // sb2=worldworld
		System.out.println(sb1 + "---" + sb2);// world---worldworld ???
	}
	
	public static void change(String s1, String s2) {
		System.out.println(s1 + "---" + s2);// hello---world
		s1 = s2; // s1=world
		s2 = s1 + s2; // s2=worldworld
		System.out.println(s1 + "---" + s2); // world---worldworld
	}

}
