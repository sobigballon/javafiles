package someotherTest;

/*
 * Collections������Լ��Ͻ��в����Ĺ����ࡣ�������������Ͳ��ҵȷ�����
 * 
 * 		Collections��Collection������?
 * 		Collections:����Լ��Ͻ��в����Ĺ����࣬����������Ͳ��ҵȹ��ܡ�
 * 		Collection:�ǵ��м��ϵĶ���ӿڣ������˵��м��ϵĹ��Թ��ܡ�
 * 
 * ���յĹ��ܣ�
 * 		public static <T> void sort(List<T> list):����
 *		public static <T> int binarySearch(List<?> list,T key):���ֲ���
 *		public static <T> T max(Collection<?> coll):���ֵ
 *		public static void reverse(List<?> list):��ת
 *		public static void shuffle(List<?> list):����û�
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectiontoolTest {
	public static void main(String[] args) {
//		�������϶���
		ArrayList<Integer> arr=new ArrayList<Integer>();

		// ���Ԫ��
		arr.add(30);
		arr.add(20);
		arr.add(50);
		arr.add(10);
		arr.add(40);
		
//		��������������
		System.out.println(arr);
//		output:[30, 20, 50, 10, 40]
		
//		���Լ��϶���
// public static <T> void sort(List<T> list):����
		Collections.sort(arr);
		System.out.println(arr);
//		output:[10, 20, 30, 40, 50]
		
//		 public static <T> int binarySearch(List<?> list,T key):���ֲ���
		int index=Collections.binarySearch(arr, 30);
		System.out.println(index);
//		output:2
		
//		 public static <T> T max(Collection<?> coll):���ֵ
		int maxValue=Collections.max(arr);
		System.out.println(maxValue);
//		output:50
		
//		 public static void reverse(List<?> list):��ת
		Collections.reverse(arr);
		System.out.println(arr);
//		output:[50, 40, 30, 20, 10]
		
// public static void shuffle(List<?> list):����û�
		Collections.shuffle(arr);
		System.out.println(arr);
//      output:�ص�����
		
	}

}
