package learning_JAVA;
/**
 * 没有些测试函数，主要说明各方法的使用方式。
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
//填充列表
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
	
//	此处可用Iterator遍历，可用随即访问方式get(),这在Arraylist中得到了很好的运用
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
//		在索引1处添加
		a.add(1, "X");
//		在列表最末添加
		a.add("X");
//		添加另一集合的所有元素，在最末位开始
//		a.addAll(new ArrayList<Object>());
//		从索引3开始添加另一集合的所有元素
//		a.addAll(3, new ArrayList<Object>());
//		是否包含
		b=a.contains("1");
//		是否包含整个集合
		b=a.containsAll(fill(new ArrayList<Object>()));
//		对ArrayList来说效率最好的随即访问，但对LinkedList来说，效率最差的。
		o=a.get(1);
//		取得对象的索引值
		i=a.indexOf("x");
//		是否为空
		b=a.isEmpty();
		it=a.iterator();
		lit=a.listIterator();
//		从第三索引处开始
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
//		添加之后必须移动
		lit.next();
//		set()方法只能在添加或者删除之后使用，改变刚刚操作的元素。
		lit.set("47");
		
	}

}
