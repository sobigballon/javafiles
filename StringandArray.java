package projecttest;
/*
* 字符串：由多个字符组成的一串数据。
* 
* 构造方法：
* 		public String():创建String对象
*		public String(byte[] bytes):把字节数组转成字符串。
*		public String(byte[] bytes,int index,int length):把字节数组中的一部分转成字符串
*		public String(char[] value):把字符数组转成字符串
*		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
* 		public String(String original):把字符串转成字符串
* 
* 问题：
* 		1:输出语句输出任何对象名称的时候，默认调用的是该对象的toString()方法。
* 		  而toString()方法默认输出的是包名...类名@哈希值的十六进制。
* 		 如果，你用输出语句输出一个对象名称的时候，发现不是这个格式，说明了该类重写了toString()方法。
* 		2:返回此字符串的长度
* 		public int length()
* 	
* 面试题：
* 		数组有length()吗?String有length()吗？
* 		没有。
* 		有。
*/

public class StringandArray {
	public static void main(String[] args) {
		char[] chr= {'a','b','c','d'};
		String str=new String(chr);
		System.out.println(str+" "+str.length());
		byte[] byt= {86,87,88,89};
		String b=new String(byt);
		System.out.println(b+" "+b.length()+" "+byt.length);
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '林', '青', '霞' };
		String c=new String(chs,0,4);
		String ch=new String(chs,0,chs.length);
		System.out.println(c+" "+c.length()+" "+chs.length);
		String s="hello";
		s+=" world!";
		String s1="hello world!";
		System.out.println(s+" "+s1);
		/*
		 * String s = new String(“hello”)和String s = “hello”;的区别
		 * 
		 * ==:比较引用类型，比较的是地址值
		 * equal():默认比较的是地址值。String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同
		 */
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		/*
		 * String类的判断功能：
		 * boolean equals(Object obj):比较字符串的内容是否相同，严格区分大小写
		 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不考虑大小写
		 * boolean contains(String str):判断是否包含指定的小串
		 * boolean startsWith(String str):判断是否以指定的字符串开头
		 * boolean endsWith(String str):判断是否以指定的字符串结尾
		 * boolean isEmpty():判断字符串的内容是否为空
		 */
		System.out.println(s.endsWith("!"));
		System.out.println(s1.startsWith("h"));
		System.out.println(s.contains("hello"));
		System.out.println(s.isEmpty());
		/*
		 * String类的获取功能：
		 * int length():返回字符串的长度。字符的个数。
		 * char charAt(int index):返回字符串中指定位置的字符。
		 * int indexOf(int ch):返回指定字符在字符串中第一次出现的位置
		 * 		97,'a'
		 * int indexOf(String str):返回指定字符串在字符串中第一次出现的位置
		 * int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
		 * int indexOf(String str,int fromIndex):返回指定字符串从指定位置开始在字符串中第一次出现的位置
		 * String substring(int start):返回从指定位置开始到末尾的子串
		 * String substring(int start,int end):返回从指定位置开始到指定位置结束的子串----注意左包右不包
		 */
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.indexOf("world!"));
		System.out.println(s1.indexOf('o',6));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(6, 8));
		/*
		 * String的转换功能：
		 * byte[] getBytes():把字符串转换为字节数组
		 * char[] toCharArray():把字符串转换为字符数组
		 * static String valueOf(char[] chs):把字符数组转成字符串
		 * static String valueOf(int i):把int类型的数据转成字符串
		 * 		把任意类型转换为字符串的方法。
		 * String toLowerCase():把字符串转小写
		 * String toUpperCase():把字符串转大写
		 * String concat(String str):字符串的连接
		 */
		System.out.println(s1.getBytes());
		System.out.println(s1.toCharArray());
		int y=12345;
		String x=new String();
		x=x.valueOf(y);
		System.out.println(y+" "+x);
		int v=getCount(s1,"o");
		System.out.println(v);
		System.out.println(compareTo(s,s1));
		String l="shijieshi      ";
		System.out.println(l.trim()+" "+l);
		
	}
	
//	统计小串在大串中出现的次数。
	public static int getCount(String maxString,String minString) {
		int starts=0;
		int index=maxString.indexOf(minString);
		int count=0;
		while(index!=-1) {
			count++;
			starts=index+minString.length();
			index=maxString.indexOf(minString,starts);
		}
		return count;
		
		
		
	}
	
//	比较字符串
	public static boolean compareTo(String s1,String s2) {
//		return s1.equals(s2);
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		if(ch1.length!=ch2.length) {
			return false;
		}
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
		
	}

}
