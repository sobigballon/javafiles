package projecttest;

import java.util.ArrayList;

/*
 * 去除集合中字符串的重复值(字符串的内容相同)
 * 举例：
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * 结果：
 * 		hello,world,java,android,javaee
 * 
 * 创建新集合的方式：
 * 		A:定义集合，存储带重复的元素
 * 		B:创建新集合
 * 		C:遍历旧集合，获取到旧集合中的每一个元素
 * 		D:那旧集合的每一个元素到新集合中去找，看有没有
 * 			有：就不添加(不搭理它)
 * 			木有：就添加
 * 		E:遍历新集合
 */

public class ArrarListDemo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("android");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("android");
		
/*		ArrayList newArrayList = new ArrayList();

		// 遍历旧集合，获取到旧集合中的每一个元素
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			// 那旧集合的每一个元素到新集合中去找，看有没有
			if (!newArrayList.contains(s)) {
				// 木有：就添加
				newArrayList.add(s);
			}
		}
*/		
		
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(y).equals(array.get(x))) {
					array.remove(y);
					y--; // 把元素删除后，还要和当前位置的比较一次
				}
			}
		}
		
	}

}
