package learning_JAVA;
/**
 * û��Щ���Ժ�������Ҫ˵����������ʹ�÷�ʽ��
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
//����б�
	public static List<?> fill(List<?> a) {
		return (List<?>)fill(a);
	}
	
	public static Collection<String> fill1(Collection<String> c,int start,int size) {
		for(int i=start;i<start+size;i++) {
			c.add(Integer.toString(i));
		}
		return c;
	}
	
	public static Collection<String> fill(Collection<String> c) {
		return fill1(c,0,c.size());
	}
	
//	�˴�����Iterator�����������漴���ʷ�ʽget(),����Arraylist�еõ��˺ܺõ�����
	public static void print(List<?> a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i)+" ");
		}
		System.out.println();
	}
	
	static boolean b;
	static Object o;
	static int i;
	static Iterator<String> it;
	static ListIterator<String> lit,lit2;
	public static void basicTest(List<String> a) {
//		������1�����
		a.add(1, "X");
//		���б���ĩ���
		a.add("X");
//		�����һ���ϵ�����Ԫ�أ�����ĩλ��ʼ
//		a.addAll(new ArrayList<Object>());
//		������3��ʼ�����һ���ϵ�����Ԫ��
//		a.addAll(3, new ArrayList<Object>());
//		�Ƿ����
		b=a.contains("1");
//		�Ƿ������������
		b=a.containsAll(fill(new ArrayList<Object>()));
//		��ArrayList��˵Ч����õ��漴���ʣ�����LinkedList��˵��Ч�����ġ�
		o=a.get(1);
//		ȡ�ö��������ֵ
		i=a.indexOf("x");
//		�Ƿ�Ϊ��
		b=a.isEmpty();
		it=a.iterator();
		lit=a.listIterator();
//		�ӵ�����������ʼ
		lit2=a.listIterator(3);
	}
	
	public static void iterMotion(List<?> a) {
		ListIterator<?> lit=a.listIterator();
		Object o=lit.next();
		boolean b=lit.hasNext();
		int i=lit.nextIndex();
		Object o1=lit.previous();
		int j=lit.previousIndex();	
	}
	
	public static void  iterManipulation(List<String> a) {
		ListIterator<String> lit=a.listIterator();
		lit.add("47");
//		���֮������ƶ�
		lit.next();
//		set()����ֻ������ӻ���ɾ��֮��ʹ�ã��ı�ող�����Ԫ�ء�
		lit.set("47");
		
	}

}
