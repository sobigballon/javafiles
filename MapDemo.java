package someotherTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 需求：我们的学生是有学号和姓名等信息的。
 * 把这两个作为一个类的成员变量，然后用Collection体系的集合存储对象即可。
 * 想根据学号直接就能找到人，如何实现呢?也是可以实现的，遍历的时候，依次比较学号即可。然后学号正确的，获取该对象的姓名变量。
 * 虽然是可以的，但是有点点麻烦，每次要找一个人，都重头遍历一遍。
 * 假如有一种集合，能够实现学号和姓名的对应关系，我们就能简单很多了。
 * 一个学号对应着一个姓名，然后根据学号就能知道该姓名。为了满足这样的需求，java就提供了一个新的集合：Map。
 * 
 * Map：元素是按照键值对形式存储的。每一对元素由两部分组成。分别叫键和值
 * 	          键是唯一的，值是可以重复的。
 * 	         所以Map集合的底层数据结构是针对键有效，跟值无关。
 * 
 * Map接口和Collection接口的不同?(面试题)
 * 		A:Map集合是双列集合；Map集合的键是唯一的，值是可以重复的。其实我们也可以简单的理解为Map集合的键和值是由Set和List组成；数据结构针对键有效。
 * 		B:Collection集合是单列集合；Collection集合的儿子Set是唯一的，List是可以重复的；数据结构针对元素有效。
 * 
 * Map集合的功能：
 * 		A:添加功能
 * 			V put(K key,V value):添加，替换或者修改。键不同，添加到集合。键相同，值替换。
 * 		B:移除功能
 * 			void clear():移除所有映射关系
 * 			V remove(Object key):根据键移除键值对元素，返回的是键对应的值
 * 		C:判断功能
 * 			boolean containsKey(Object key):判断Map集合中是否包含指定的键
 * 			boolean containsValue(Object value):判断Map集合中是否包含指定的值
 * 			boolean isEmpty():判断集合是否为空
 * 		D:获取功能
 * 			Set<Map.Entry<K,V>> entrySet():返回的是键值对对象的Set集合。
 * 			V get(Object key):根据键获取值
 * 			Set<K> keySet():所有的键的集合
 * 			Collection<V> values():所有值的集合
 * 			int size():集合的长度
 */

public class MapDemo {
	public static void main(String[] args) {
		//定义Map集合
		Map <Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "东邪");
		map.put(2, "西毒");
		map.put(3, "南帝");
		map.put(4, "北丐");
		
//		遍历
		
		System.out.println(map);

//     键值条目Set遍历			
		Set<Entry<Integer,String>> s=map.entrySet();
		for(Entry<Integer,String> i:s) {
			System.out.println(i+" "+i.getKey()+" "+i.getValue());
		}
	
//		键set遍历
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(Integer i:keys) {
			System.out.println(i+" "+map.get(i));
		}

//		值Collection集合遍历(值存在重复，不能用set)
		Collection<String> values=map.values();
		System.out.println(values);
		for(String i:values) {
			System.out.println(i);
		}

	}

}
