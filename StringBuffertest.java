package projecttest;

/*
 * 1:String,StringBuffer,StringBuilder������?
 * A:String���ȹ̶���StringBuffer��StringBuilder�ĳ��ȿɱ䡣
 * B:StringBuffer�̰߳�ȫ��Ч�ʵ͡�StringBuilder�̲߳���ȫ��Ч�ʸߡ�
 * 
 * 2:StringBuffer�����������
 * A:StringBuffer�ĳ��ȿɱ䣬���Դ洢�����������ͣ����ս����ʵ��һ���ַ�����
 * B:���鳤�ȹ̶����洢ͬһ���������͵�Ԫ�ء�
 * 
 * 3:������д�����
 * 		String��Ϊ�������ݣ�StringBuffer��Ϊ��������
 * 
 * 		String��һ��������������ͣ�����Ϊ�������ݵ�ʱ�򣬿��Ե�������������������Ϊ�����ݵ�Ҳ�ǳ���ֵ��
 * 		
 */

public class StringBuffertest {
	public static void main(String[] args) {
		// StringBuffer()�� ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		// StringBuffer(20)�� ����һ�����в����ַ����ַ��������������ʼ����Ϊ 20 ���ַ���
		StringBuffer sb1=new StringBuffer(20);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		// StringBuffer("hello world!")�� ����һ�����в����ַ����ַ��������������ʼ����Ϊ �ַ������� ���ַ���
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
