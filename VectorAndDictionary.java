package learning_JAVA;
/**
 * ʹ������Vector��ʵ��Dictionary��ͨ���̳�Dictionaryʵ�֣�
 * 
 */

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class VectorAndDictionary extends Dictionary<Object,Object>{
	private Vector<Object> keys=new Vector<Object>();
	private Vector<Object> values=new Vector<Object>();

	
//	�������е�Ĭ�Ϸ���������ֵ��Enumeration
	@Override
	public Enumeration<Object> elements() {
		// TODO �Զ����ɵķ������
		return values.elements();
	}

//	���󷽷���ͨ����ȡ��ֵ
	@Override
	public Object get(Object key) {
		// TODO �Զ����ɵķ������
		int index=keys.indexOf(key);
		if (index==-1) return null;
		return values.elementAt(index);
	}
	
//	�ж��ֵ��Ƿ�Ϊ��
	@Override
	public boolean isEmpty() {
		// TODO �Զ����ɵķ������
		return keys.isEmpty();
	}

//	ȡ�ü�ֵ��Enueration
	@Override
	public Enumeration<Object> keys() {
		// TODO �Զ����ɵķ������
		return keys.elements();
	}

	@Override
//	����ֵ�Էֱ������Ե�Vector�У������ش洢��λ�á�
	public Object put(Object key, Object value) {
		// TODO �Զ����ɵķ������
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

//	ɾ��Ԫ�أ�������ɾ����Ԫ��
	@Override
	public Object remove(Object key) {
		// TODO �Զ����ɵķ������
		int index=keys.indexOf(key);
		if(index==-1) return null;
		Object rmresult=values.elementAt(index);
		keys.removeElementAt(index);
		values.removeElement(index);
		
		return rmresult;
	}

//	ȡ���ֵ�Ĵ�С
	@Override
	public int size() {
		// TODO �Զ����ɵķ������
		return keys.size();
	}
	
//	����
	public static void main(String[] args) {
		VectorAndDictionary vd=new VectorAndDictionary();
		for(char c='a';c<'z';c++) {
			vd.put(String.valueOf(c), 
					String.valueOf(c).toUpperCase());
		}
		char[] a= {'a','b','c','d','e'};
		for(char ch:a) {
			System.out.println(vd.get(String.valueOf(ch)));
		}
	}

}
