package someotherTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
����
����ArrayList���ϵ�Ԫ����HashMap����3����
ÿһ��HashMap���ϵļ���ֵ�����ַ�����
Ԫ�����Ѿ���ɣ��������
�����
���---С��
����---����

����---����
���---С��Ů

�����---��ӯӯ
��ƽ֮---����ɺ
*/


public class ArrayListAndHashMapTest {
	public static void main(String[] args) {
//		��������
		ArrayList<HashMap<String, String>> array=new ArrayList<HashMap<String, String>>();
		
//		����HashMap�����Ԫ��
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("���", "С��");
		hm1.put("����", "����");
		
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		
		HashMap<String,String> hm3=new HashMap<String,String>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		
//		Array���Ԫ��
		array.add(hm1);
		array.add(hm2);
		array.add(hm3);
		
//		����
		for(HashMap<String, String> x:array) {
			Set<String> s=x.keySet();
			for(String key:s) {
				System.out.println(key+"---"+x.get(key));
			}
			
			
		}
		
	}

}
