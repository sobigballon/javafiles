package projecttest;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet���ײ����ݽṹ�ǹ�ϣ�������
 * ��ϣ���ܹ���֤Ԫ�ص�Ψһ��
 * �����ܹ���֤Ԫ������
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lsh =new LinkedHashSet<String>();
		lsh.add("Hello");
		lsh.add("JAVA");
		lsh.add("This");
		lsh.add("good!");
		
		System.out.println(lsh);
		
		for(String s:lsh) {
			System.out.println(s);
		}
		
	}

}
