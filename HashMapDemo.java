package someotherTest;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
//		����
		HashMap<Students,String> hm=new HashMap<Students,String>();
		
//		����ѧ������

		Students s1 = new Students("����ϼ", 28);
		Students s2 = new Students("������", 31);
		Students s3 = new Students("������", 200);
		Students s4 = new Students("����ϼ", 28);
		Students s5 = new Students("������", 20);
		Students s6 = new Students("����", 100);
		
// ���Ԫ��
		hm.put(s1, "it001");
		hm.put(s2, "it002");
		hm.put(s3, "it003");
		hm.put(s4, "it004");
		hm.put(s5, "it005");
		hm.put(s6, "it006");
		
//		����
		Set<Students> keys=hm.keySet();
		for(Students s:keys) {
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}

}
