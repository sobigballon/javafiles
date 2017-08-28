package someotherTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
需求：
假设HashMap集合的元素值是ArrayList。有3个。
每一个ArrayList集合的值是字符串。
元素我已经完成，请遍历。
结果：
三国演义

吕布
周瑜

笑傲江湖

令狐冲
林平之

神雕侠侣

郭靖
杨过  
*/

public class HashMapAndArayListTest {
	public static void main(String[] args) {
//		创建HashMap
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
//		创建List
		ArrayList<String> sgyy=new ArrayList<String>(); 
		sgyy.add("吕布");
		sgyy.add("周瑜");
		
		ArrayList<String> xajh=new ArrayList<String>();
		xajh.add("令狐冲");
		xajh.add("林平之");
		
		ArrayList<String> sdxl=new ArrayList<String>(); 
		sdxl.add("郭靖");
		sdxl.add("杨过");
		
//		添加元素
		hm.put("三国演义", sgyy);
		hm.put("笑傲江湖", xajh);
		hm.put("神雕侠侣",sdxl);
		
//		遍历
		Set<Entry<String, ArrayList<String>>> set=hm.entrySet();
		for(Entry<String, ArrayList<String>> kv:set) {
			System.out.println(kv.getKey());
			ArrayList<String> value=hm.get(kv.getKey());
			for(String v:value) {
				System.out.println(v);
			}
		}
// 		值遍历		
		Collection<ArrayList<String>> values=hm.values();
		for(ArrayList<String> v:values) {
			for(String s:v) {
				System.out.println(s);
			}
		}	
	
 }

}
