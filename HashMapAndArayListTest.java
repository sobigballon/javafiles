package someotherTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
����
����HashMap���ϵ�Ԫ��ֵ��ArrayList����3����
ÿһ��ArrayList���ϵ�ֵ���ַ�����
Ԫ�����Ѿ���ɣ��������
�����
��������

����
���

Ц������

�����
��ƽ֮

�������

����
���  
*/

public class HashMapAndArayListTest {
	public static void main(String[] args) {
//		����HashMap
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
//		����List
		ArrayList<String> sgyy=new ArrayList<String>(); 
		sgyy.add("����");
		sgyy.add("���");
		
		ArrayList<String> xajh=new ArrayList<String>();
		xajh.add("�����");
		xajh.add("��ƽ֮");
		
		ArrayList<String> sdxl=new ArrayList<String>(); 
		sdxl.add("����");
		sdxl.add("���");
		
//		���Ԫ��
		hm.put("��������", sgyy);
		hm.put("Ц������", xajh);
		hm.put("�������",sdxl);
		
//		����
		Set<Entry<String, ArrayList<String>>> set=hm.entrySet();
		for(Entry<String, ArrayList<String>> kv:set) {
			System.out.println(kv.getKey());
			ArrayList<String> value=hm.get(kv.getKey());
			for(String v:value) {
				System.out.println(v);
			}
		}
// 		ֵ����		
		Collection<ArrayList<String>> values=hm.values();
		for(ArrayList<String> v:values) {
			for(String s:v) {
				System.out.println(s);
			}
		}	
	
 }

}
