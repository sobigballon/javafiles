package projecttest;

import java.util.ArrayList;

/*
 * ���󣺻�ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������
 * 		A:����һ�����ϣ����ڴ洢�����������
 * 		B:����һ��ͳ�Ʊ�������ʼֵ��0
 * 		C:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			�ǣ�
 * 				����һ�������Ȼ���ж����ڼ�����
 * 					�ǣ������
 * 					����ӵ�����
 * 			�񣺽���
 * 		D:��������
 */


public class RandomList {
	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		int count=0;
		while(count<10) {
			// ����һ�������Ȼ���ж����ڼ�����
			int r=(int)(Math.random()*20)+1;
			if (!array.contains(r)) {
				array.add(r);
				count++;
			}
		}
		//����
		for(Integer i:array) {
			System.out.println(i);
		}
	}

}
