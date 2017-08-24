package projecttest;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
* List:
* 		ArrayList:
* 			底层数据结构是数组，查询快，增删慢
* 			线程不安全，效率高
* 		Vector:
* 			底层数据结构是数组，查询快，增删慢
* 			线程安全，效率低
* 		LinkedList:
* 			底层数据结构是链表，查询慢，增删快
* 			线程不安全，效率高
* 
* 面试题：ArrayList，Vector和LinkedList的各自特点?
* 
* 思考题：ArrayList，Vector和LinkedList我们到底使用谁呢?
* 			看情况
* 			
* 			要安全吗?
* 				要：Vector(这个现在也不常用，在Collections里面有新的方式)
* 				不要：ArrayList和LinkedList
* 					查询多：ArrayList
* 					增删多：LinkedList
* 
* 		不知道用哪个，就用ArrayList。
* 
* 需求：用ArrayList存储字符串并遍历
*/


/*
 * Vector特有功能：
 * 		A:添加元素
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:获取元素
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK版本升级：
 *			A:安全
 *			B:效率
 *			C:简化书写
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector  v=new Vector();
		v.add("hello");
		v.addElement("world!");
		Iterator it=v.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());;
		}
		
		Enumeration it2=v.elements();
		while(it2.hasMoreElements()) {
			String s=(String)it2.nextElement();
			System.out.println(s);
		}
	}
	

}
