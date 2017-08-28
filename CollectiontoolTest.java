package someotherTest;

/*
 * Collections：是针对集合进行操作的工具类。里面包含了排序和查找等方法。
 * 
 * 		Collections和Collection的区别?
 * 		Collections:是针对集合进行操作的工具类，包含了排序和查找等功能。
 * 		Collection:是单列集合的顶层接口，定义了单列集合的共性功能。
 * 
 * 掌握的功能：
 * 		public static <T> void sort(List<T> list):排序
 *		public static <T> int binarySearch(List<?> list,T key):二分查找
 *		public static <T> T max(Collection<?> coll):最大值
 *		public static void reverse(List<?> list):反转
 *		public static void shuffle(List<?> list):随机置换
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectiontoolTest {
	public static void main(String[] args) {
//		创建集合对象
		ArrayList<Integer> arr=new ArrayList<Integer>();

		// 添加元素
		arr.add(30);
		arr.add(20);
		arr.add(50);
		arr.add(10);
		arr.add(40);
		
//		遍历（无序结果）
		System.out.println(arr);
//		output:[30, 20, 50, 10, 40]
		
//		测试集合对象
// public static <T> void sort(List<T> list):排序
		Collections.sort(arr);
		System.out.println(arr);
//		output:[10, 20, 30, 40, 50]
		
//		 public static <T> int binarySearch(List<?> list,T key):二分查找
		int index=Collections.binarySearch(arr, 30);
		System.out.println(index);
//		output:2
		
//		 public static <T> T max(Collection<?> coll):最大值
		int maxValue=Collections.max(arr);
		System.out.println(maxValue);
//		output:50
		
//		 public static void reverse(List<?> list):反转
		Collections.reverse(arr);
		System.out.println(arr);
//		output:[50, 40, 30, 20, 10]
		
// public static void shuffle(List<?> list):随机置换
		Collections.shuffle(arr);
		System.out.println(arr);
//      output:回到乱序
		
	}

}
