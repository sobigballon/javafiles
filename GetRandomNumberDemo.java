package projecttest;

import java.util.HashSet;

/*
 * Set�������ǽ������������ࡣһ������ʹ��˭��?
 * 		Ҫ������?
 * 			Ҫ��TreeSet
 * 			��Ҫ��HashSet
 * ����Ҳ��֪���ǲ���Ҫ������HashSet��
 * 
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:����HashSet���ϣ��洢Integer���͵�����
 * 		B:ֱ���жϼ��ϵĳ���
 * 			С��10������������������洢
 * 		C:��������
 */

public class GetRandomNumberDemo {
	public static void main(String[] args) {
        int count=0;
        HashSet<Integer> hs=new HashSet<Integer>();
        while(count<10) {
        	int num=(int)(Math.random()*20+1);
        	hs.add(num);
        	count++;
        }
        
        for(int i:hs) {
        	System.out.println(i);
        }
		
	}

}
