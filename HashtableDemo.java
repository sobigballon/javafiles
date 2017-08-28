package someotherTest;

import java.util.Hashtable;

/*
* 面试题：
* 1:HashMap和Hashtable的区别?
* A:HashMap是线程不安全的，效率高。允许使用 null 值和 null 键。
* B:Hashtable是线程安全的，效率低。不允许使用 null 值和 null 键。
* 
* 2:List,Set,Map等接口是否都继承自Map接口
* List,Set都继承自Collection接口。
* Map本身就是顶层接口
* 
* 3:你常见的集合类有哪些，都有什么方法?
* 		Collection
* 			|--List
* 				|--ArrayList
* 				|--Vector
* 				|--LinkedList
* 			|--Set
* 				|--HashSet
* 					|--LinkedHashSet
* 				|--TreeSet
* 		Map
* 			|--HashMap
* 				|--LinkedHashMap
* 			|--Hashtable
* 			|--TreeMap
* 
* 		ArrayList
* 			添加功能，移除功能，判断功能，获取，长度
* 		HashSet
* 			添加功能，移除功能，判断功能，获取，长度
* 		HashMap
* 			添加功能，移除功能，判断功能，获取，长度
*/

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("007", "周星驰");
//		ht.put("008", null);  线程安全，不允许出现null
//		ht.put(null, "佟大为");
		
		System.out.println(ht);;
	}

}
