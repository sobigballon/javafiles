package learning_JAVA;
/**
 * 使用两个Vector来实现Dictionary（通过继承Dictionary实现）
 * 
 */

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class VectorAndDictionary extends Dictionary<Object,Object>{
	private Vector<Object> keys=new Vector<Object>();
	private Vector<Object> values=new Vector<Object>();

	
//	抽象类中的默认方法，返回值的Enumeration
	@Override
	public Enumeration<Object> elements() {
		// TODO 自动生成的方法存根
		return values.elements();
	}

//	抽象方法，通过键取得值
	@Override
	public Object get(Object key) {
		// TODO 自动生成的方法存根
		int index=keys.indexOf(key);
		if (index==-1) return null;
		return values.elementAt(index);
	}
	
//	判断字典是否为空
	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return keys.isEmpty();
	}

//	取得键值的Enueration
	@Override
	public Enumeration<Object> keys() {
		// TODO 自动生成的方法存根
		return keys.elements();
	}

	@Override
//	将键值对分别存入各自的Vector中，并返回存储的位置。
	public Object put(Object key, Object value) {
		// TODO 自动生成的方法存根
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

//	删除元素，并返回删除的元素
	@Override
	public Object remove(Object key) {
		// TODO 自动生成的方法存根
		int index=keys.indexOf(key);
		if(index==-1) return null;
		Object rmresult=values.elementAt(index);
		keys.removeElementAt(index);
		values.removeElement(index);
		
		return rmresult;
	}

//	取得字典的大小
	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return keys.size();
	}
	
//	测试
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
