package someotherTest;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
//		创建集合
		TreeMap<String,String> tm=new TreeMap<String,String>();
//		创建有比较关系的集合
		TreeMap<Ostudent,String> tm2=new TreeMap<Ostudent,String>(new Comparator<Ostudent>() {
			
			@Override
			public int compare(Ostudent o1, Ostudent o2) {
				// TODO Auto-generated method stub
//				主要比较条件
				int num=o1.getAge()-o2.getAge();
//				次要比较条件
				int num2=num==0?o1.getName().compareTo(o2.getName()):num;
				return num2;
			}
			
		});
		
//		添加元素
		tm.put("zhangsan", "北京");
		tm.put("lisi", "天津");
		tm.put("wangwu", "上海");
		tm.put("zhaoliu", "重庆");
		tm.put("tianqi", "西安");
		tm.put("lisi", "武汉");

//		遍历
		Set<Entry<String,String>> s=tm.entrySet();
		for(Entry<String,String> i:s) {
			System.out.println(i.getKey()+"--"+i.getValue());
		}
		
		// 创建对象
		Ostudent s1 = new Ostudent("linqingxia", 28);
		Ostudent s2 = new Ostudent("fengqingyang", 31);
		Ostudent s3 = new Ostudent("wangchongyang", 200);
		Ostudent s4 = new Ostudent("linqingxia", 28);
		Ostudent s5 = new Ostudent("fengqingyang", 20);
		Ostudent s6 = new Ostudent("wangyang", 100);

		// 添加元素
		tm2.put(s1, "it001");
		tm2.put(s2, "it002");
		tm2.put(s3, "it003");
		tm2.put(s4, "it004");
		tm2.put(s5, "it005");
		tm2.put(s6, "it006");
		
//		遍历
		Set<Entry<Ostudent,String>> o=tm2.entrySet();
		for(Entry<Ostudent,String> i:o) {
			System.out.println(i.getKey().getName()+"--"+i.getKey().getAge()+"--"+i.getValue());
		}
	}

}
