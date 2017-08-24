package projecttest;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			void addFirst()
 * 			void addLast()
 * 		B:�Ƴ�����
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:��ȡ����
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
