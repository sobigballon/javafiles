package projecttest;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
* List:
* 		ArrayList:
* 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
* 			�̲߳���ȫ��Ч�ʸ�
* 		Vector:
* 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
* 			�̰߳�ȫ��Ч�ʵ�
* 		LinkedList:
* 			�ײ����ݽṹ��������ѯ������ɾ��
* 			�̲߳���ȫ��Ч�ʸ�
* 
* �����⣺ArrayList��Vector��LinkedList�ĸ����ص�?
* 
* ˼���⣺ArrayList��Vector��LinkedList���ǵ���ʹ��˭��?
* 			�����
* 			
* 			Ҫ��ȫ��?
* 				Ҫ��Vector(�������Ҳ�����ã���Collections�������µķ�ʽ)
* 				��Ҫ��ArrayList��LinkedList
* 					��ѯ�ࣺArrayList
* 					��ɾ�ࣺLinkedList
* 
* 		��֪�����ĸ�������ArrayList��
* 
* ������ArrayList�洢�ַ���������
*/


/*
 * Vector���й��ܣ�
 * 		A:���Ԫ��
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:��ȡԪ��
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK�汾������
 *			A:��ȫ
 *			B:Ч��
 *			C:����д
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
