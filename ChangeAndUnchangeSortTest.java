package learning_JAVA;
/**
 * 快排测试
 */

import java.util.Enumeration;

public class ChangeAndUnchangeSortTest {
//	静态内部类，可直接调用
	static class StringCompare implements Compare{

		@Override
		public boolean lessThan(Object l, Object r) {
			// TODO 自动生成的方法存根
			return ((String)l).toLowerCase().compareTo
					(((String)r).toLowerCase())<0;
		}

		@Override
		public boolean lessThanOrequal(Object l, Object r) {
			// TODO 自动生成的方法存根
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
