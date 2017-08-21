package projecttest;
/*
* �ַ������ɶ���ַ���ɵ�һ�����ݡ�
* 
* ���췽����
* 		public String():����String����
*		public String(byte[] bytes):���ֽ�����ת���ַ�����
*		public String(byte[] bytes,int index,int length):���ֽ������е�һ����ת���ַ���
*		public String(char[] value):���ַ�����ת���ַ���
*		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
* 		public String(String original):���ַ���ת���ַ���
* 
* ���⣺
* 		1:����������κζ������Ƶ�ʱ��Ĭ�ϵ��õ��Ǹö����toString()������
* 		  ��toString()����Ĭ��������ǰ���...����@��ϣֵ��ʮ�����ơ�
* 		 ������������������һ���������Ƶ�ʱ�򣬷��ֲ��������ʽ��˵���˸�����д��toString()������
* 		2:���ش��ַ����ĳ���
* 		public int length()
* 	
* �����⣺
* 		������length()��?String��length()��
* 		û�С�
* 		�С�
*/

public class StringandArray {
	public static void main(String[] args) {
		char[] chr= {'a','b','c','d'};
		String str=new String(chr);
		System.out.println(str+" "+str.length());
		byte[] byt= {86,87,88,89};
		String b=new String(byt);
		System.out.println(b+" "+b.length()+" "+byt.length);
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '��', '��', 'ϼ' };
		String c=new String(chs,0,4);
		String ch=new String(chs,0,chs.length);
		System.out.println(c+" "+c.length()+" "+chs.length);
		String s="hello";
		s+=" world!";
		String s1="hello world!";
		System.out.println(s+" "+s1);
		/*
		 * String s = new String(��hello��)��String s = ��hello��;������
		 * 
		 * ==:�Ƚ��������ͣ��Ƚϵ��ǵ�ֵַ
		 * equal():Ĭ�ϱȽϵ��ǵ�ֵַ��String����д��equals()�������÷����������ǱȽ��ַ����������Ƿ���ͬ
		 */
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		/*
		 * String����жϹ��ܣ�
		 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ���ϸ����ִ�Сд
		 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�������Ǵ�Сд
		 * boolean contains(String str):�ж��Ƿ����ָ����С��
		 * boolean startsWith(String str):�ж��Ƿ���ָ�����ַ�����ͷ
		 * boolean endsWith(String str):�ж��Ƿ���ָ�����ַ�����β
		 * boolean isEmpty():�ж��ַ����������Ƿ�Ϊ��
		 */
		System.out.println(s.endsWith("!"));
		System.out.println(s1.startsWith("h"));
		System.out.println(s.contains("hello"));
		System.out.println(s.isEmpty());
		/*
		 * String��Ļ�ȡ���ܣ�
		 * int length():�����ַ����ĳ��ȡ��ַ��ĸ�����
		 * char charAt(int index):�����ַ�����ָ��λ�õ��ַ���
		 * int indexOf(int ch):����ָ���ַ����ַ����е�һ�γ��ֵ�λ��
		 * 		97,'a'
		 * int indexOf(String str):����ָ���ַ������ַ����е�һ�γ��ֵ�λ��
		 * int indexOf(int ch,int fromIndex):����ָ���ַ���ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
		 * int indexOf(String str,int fromIndex):����ָ���ַ�����ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
		 * String substring(int start):���ش�ָ��λ�ÿ�ʼ��ĩβ���Ӵ�
		 * String substring(int start,int end):���ش�ָ��λ�ÿ�ʼ��ָ��λ�ý������Ӵ�----ע������Ҳ���
		 */
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.indexOf("world!"));
		System.out.println(s1.indexOf('o',6));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(6, 8));
		/*
		 * String��ת�����ܣ�
		 * byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
		 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		 * static String valueOf(char[] chs):���ַ�����ת���ַ���
		 * static String valueOf(int i):��int���͵�����ת���ַ���
		 * 		����������ת��Ϊ�ַ����ķ�����
		 * String toLowerCase():���ַ���תСд
		 * String toUpperCase():���ַ���ת��д
		 * String concat(String str):�ַ���������
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
	
//	ͳ��С���ڴ��г��ֵĴ�����
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
	
//	�Ƚ��ַ���
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
