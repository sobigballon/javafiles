package someotherTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * �������ǵ�ѧ������ѧ�ź���������Ϣ�ġ�
 * ����������Ϊһ����ĳ�Ա������Ȼ����Collection��ϵ�ļ��ϴ洢���󼴿ɡ�
 * �����ѧ��ֱ�Ӿ����ҵ��ˣ����ʵ����?Ҳ�ǿ���ʵ�ֵģ�������ʱ�����αȽ�ѧ�ż��ɡ�Ȼ��ѧ����ȷ�ģ���ȡ�ö��������������
 * ��Ȼ�ǿ��Եģ������е���鷳��ÿ��Ҫ��һ���ˣ�����ͷ����һ�顣
 * ������һ�ּ��ϣ��ܹ�ʵ��ѧ�ź������Ķ�Ӧ��ϵ�����Ǿ��ܼ򵥺ܶ��ˡ�
 * һ��ѧ�Ŷ�Ӧ��һ��������Ȼ�����ѧ�ž���֪����������Ϊ����������������java���ṩ��һ���µļ��ϣ�Map��
 * 
 * Map��Ԫ���ǰ��ռ�ֵ����ʽ�洢�ġ�ÿһ��Ԫ������������ɡ��ֱ�м���ֵ
 * 	          ����Ψһ�ģ�ֵ�ǿ����ظ��ġ�
 * 	         ����Map���ϵĵײ����ݽṹ����Լ���Ч����ֵ�޹ء�
 * 
 * Map�ӿں�Collection�ӿڵĲ�ͬ?(������)
 * 		A:Map������˫�м��ϣ�Map���ϵļ���Ψһ�ģ�ֵ�ǿ����ظ��ġ���ʵ����Ҳ���Լ򵥵����ΪMap���ϵļ���ֵ����Set��List��ɣ����ݽṹ��Լ���Ч��
 * 		B:Collection�����ǵ��м��ϣ�Collection���ϵĶ���Set��Ψһ�ģ�List�ǿ����ظ��ģ����ݽṹ���Ԫ����Ч��
 * 
 * Map���ϵĹ��ܣ�
 * 		A:��ӹ���
 * 			V put(K key,V value):��ӣ��滻�����޸ġ�����ͬ����ӵ����ϡ�����ͬ��ֵ�滻��
 * 		B:�Ƴ�����
 * 			void clear():�Ƴ�����ӳ���ϵ
 * 			V remove(Object key):���ݼ��Ƴ���ֵ��Ԫ�أ����ص��Ǽ���Ӧ��ֵ
 * 		C:�жϹ���
 * 			boolean containsKey(Object key):�ж�Map�������Ƿ����ָ���ļ�
 * 			boolean containsValue(Object value):�ж�Map�������Ƿ����ָ����ֵ
 * 			boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * 		D:��ȡ����
 * 			Set<Map.Entry<K,V>> entrySet():���ص��Ǽ�ֵ�Զ����Set���ϡ�
 * 			V get(Object key):���ݼ���ȡֵ
 * 			Set<K> keySet():���еļ��ļ���
 * 			Collection<V> values():����ֵ�ļ���
 * 			int size():���ϵĳ���
 */

public class MapDemo {
	public static void main(String[] args) {
		//����Map����
		Map <Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "��а");
		map.put(2, "����");
		map.put(3, "�ϵ�");
		map.put(4, "��ؤ");
		
//		����
		
		System.out.println(map);

//     ��ֵ��ĿSet����			
		Set<Entry<Integer,String>> s=map.entrySet();
		for(Entry<Integer,String> i:s) {
			System.out.println(i+" "+i.getKey()+" "+i.getValue());
		}
	
//		��set����
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(Integer i:keys) {
			System.out.println(i+" "+map.get(i));
		}

//		ֵCollection���ϱ���(ֵ�����ظ���������set)
		Collection<String> values=map.values();
		System.out.println(values);
		for(String i:values) {
			System.out.println(i);
		}

	}

}
