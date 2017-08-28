package someotherTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
需求：
假设ArrayList集合的元素是HashMap。有3个。
每一个HashMap集合的键和值都是字符串。
元素我已经完成，请遍历。
结果：
周瑜---小乔
吕布---貂蝉

郭靖---黄蓉
杨过---小龙女

令狐冲---任盈盈
林平之---岳灵珊
*/


public class ArrayListAndHashMapTest {
	public static void main(String[] args) {
//		定义数组
		ArrayList<HashMap<String, String>> array=new ArrayList<HashMap<String, String>>();
		
//		定义HashMap并存放元素
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("周瑜", "小乔");
		hm1.put("吕布", "貂蝉");
		
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("郭靖", "黄蓉");
		hm2.put("杨过", "小龙女");
		
		HashMap<String,String> hm3=new HashMap<String,String>();
		hm3.put("令狐冲", "任盈盈");
		hm3.put("林平之", "岳灵珊");
		
//		Array存放元素
		array.add(hm1);
		array.add(hm2);
		array.add(hm3);
		
//		遍历
		for(HashMap<String, String> x:array) {
			Set<String> s=x.keySet();
			for(String key:s) {
				System.out.println(key+"---"+x.get(key));
			}
			
			
		}
		
	}

}
