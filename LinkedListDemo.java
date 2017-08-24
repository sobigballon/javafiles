package projecttest;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			void addFirst()
 * 			void addLast()
 * 		B:移除功能
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:获取功能
 * 			Object getFirst()
 * 			Object getLast()
 */


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add("Hello");
		link.add("Java!");
		
		System.out.println(link);
		System.out.println(link.getFirst());
		
		Iterator it=link.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	

}
