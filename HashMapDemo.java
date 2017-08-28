package someotherTest;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
//		定义
		HashMap<Students,String> hm=new HashMap<Students,String>();
		
//		创建学生对象

		Students s1 = new Students("林青霞", 28);
		Students s2 = new Students("风清扬", 31);
		Students s3 = new Students("王重阳", 200);
		Students s4 = new Students("林青霞", 28);
		Students s5 = new Students("风清扬", 20);
		Students s6 = new Students("王阳", 100);
		
// 添加元素
		hm.put(s1, "it001");
		hm.put(s2, "it002");
		hm.put(s3, "it003");
		hm.put(s4, "it004");
		hm.put(s5, "it005");
		hm.put(s6, "it006");
		
//		遍历
		Set<Students> keys=hm.keySet();
		for(Students s:keys) {
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}

}
