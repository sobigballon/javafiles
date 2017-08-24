package projecttest;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet：底层数据结构是哈希表和链表。
 * 哈希表：能够保证元素的唯一性
 * 链表：能够保证元素有序
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lsh =new LinkedHashSet<String>();
		lsh.add("Hello");
		lsh.add("JAVA");
		lsh.add("This");
		lsh.add("good!");
		
		System.out.println(lsh);
		
		for(String s:lsh) {
			System.out.println(s);
		}
		
	}

}
