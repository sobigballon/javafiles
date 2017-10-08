package learning_JAVA;
/**
 * ���Ų���
 */

import java.util.Enumeration;

public class ChangeAndUnchangeSortTest {
//	��̬�ڲ��࣬��ֱ�ӵ���
	static class StringCompare implements Compare{

		@Override
		public boolean lessThan(Object l, Object r) {
			// TODO �Զ����ɵķ������
			return ((String)l).toLowerCase().compareTo
					(((String)r).toLowerCase())<0;
		}

		@Override
		public boolean lessThanOrequal(Object l, Object r) {
			// TODO �Զ����ɵķ������
			return ((String)l).toLowerCase().compareTo
					(((String)r).toLowerCase())<=0;
		}
		
		public static void main(String[] args) {
			SortVector sv=new SortVector(new StringCompare());
			sv.addElement("B");
			sv.addElement("E");
			sv.addElement("a");
			sv.addElement("C");
			sv.addElement("d");
			sv.addElement("f");
			sv.quicksort(0, sv.size()-1);
			Enumeration<Object> e=sv.elements();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			
		}
		
	}

}
