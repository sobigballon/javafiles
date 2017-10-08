package learning_JAVA;
/**
 * ����Comparator��Comparable
 * 
 */

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparable {
	public static void print(Object[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println( );
	}
	
//	����
	public static void main(String[] args) {
		CompClass[] a=new CompClass[20];
		for(int i=0;i<a.length;i++) {
			a[i]=new CompClass(
					(int)(Math.random()*100));
		}
		print(a);
		Arrays.sort(a);
		print(a);
		int loc=Arrays.binarySearch(a, a[3]);
		System.out.println("Location of "+a[3]+"="+loc);
		
		String[] s=
				ArrayAndSortAndBinarySearch.randStrings(4, 10);
		print(s);
		AlphaCompa ac=new AlphaCompa();
//		����ac��Ҫ�Ƚϵ�����������Ϊ���������Լ���Compare�������бȽϴ���
		Arrays.sort(s,ac);
		print(s);
//		�˴���Ҫѡ��Comparatorȥ����
		loc=Arrays.binarySearch(s, s[3],ac);
		System.out.println("Location of "+s[3]+"="+loc);
	}

}

class AlphaCompa implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO �Զ����ɵķ������
		String s1=((String)o1).toUpperCase();
		String s2=((String)o2).toUpperCase();
		return s1.compareTo(s2);
	}
	
}

class CompClass implements Comparable<Object>{
	private int i;
	public CompClass(int ii) {
		i=ii;
	}

	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		int argi=((CompClass)o).i;
		if(i>argi) return 1;
		if(i<argi)return -1;
		return 0;
	}
	public String toString() {
		return i+"";
	}
	
}
