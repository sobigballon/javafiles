package projecttest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Ϊʲô���ּ�����?
 * 		����������Զ���������ֶ����Զ������ʽ������Ϊ�˷���Զ������Ĳ�������ǰ����ѧ֪ʶ������ֻ�ܲ��ö�������ʵ�֡�
 * 		���ǣ���������ĳ������ǹ̶��ģ���Ӧ���˱仯���������ԣ�java���ṩ�˼����๩����ʹ�á�
 * 
 * ��������ص㣺
 * 		A:���ȿɱ�
 * 		B:ֻ�ܴ洢����
 * 		C:���Դ洢��ͬ���͵Ķ���
 * 
 * �����⣺����ͼ��ϵ�����?
 * 		A:���ϳ��ȿɱ䣻����ֻ�ܴ洢�����������ͣ����Ͽ��Դ洢��ͬ�������͵�Ԫ��
 * 		B:���鳤�ȹ̶���������Դ洢�����������ͣ�Ҳ���Դ洢�����������ͣ�����洢����ͬһ���������͵�Ԫ��
 * 
 * �������ǵĹ�������̫һ�������ԣ�java���ṩ�˶��ּ����๩����ʹ�á���Щ������ı���������ʵ�ǵײ�����ݽṹ��ͬ��
 * ���ݽṹ�����ݵĴ洢��ʽ��
 * 
 * Collection�Ĺ��ܣ�
 * A:��ӹ���
 * 		boolean add(Object obj):�����������һ��Ԫ��
 * 		boolean addAll(Collection c):����������Ӷ��Ԫ�ء�
 * B:��ȡ����
 * 		Iterator iterator():������
 * 		int size():���ϵ�Ԫ�ظ���������
 * C:ɾ������
 * 		void clear():��ռ��ϵ�����Ԫ��
 * 		boolean remove(Object obj):�Ӽ������Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ӽ������Ƴ����Ԫ��
 * D:�жϹ���
 * 		boolean contains(Object obj):�жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c):�жϼ������Ƿ����ָ���Ķ��Ԫ��
 * 		boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * E:����Ԫ��
 * 		boolean retainAll(Collection c)
 * F:ת����
 * 		Object[] toArray():�Ѽ���ת�ɶ�������
 */

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("JAVA");
		System.out.println(c);
		System.out.println(c.size());
		c.add("World!");
		System.out.println("Remove:"+c.remove("excuse!"));;
		System.out.println("Remove:"+c.remove("World!"));
		System.out.println(c);
		
		/*
		 * ���������������A��B����A��B������ ����Ԫ�ش洢��A���ϣ�B���ϲ������ı䡣 ����ֵ�����A�����Ƿ������ı䡣
		 */
		
		Collection c1=new ArrayList();
		c1.add("hello");
		c1.add("some");
		System.out.println("contain:"+c1.retainAll(c));
		System.out.println(c1);
		System.out.println(c);
		
		Collection c2=new ArrayList();
		Student s1=new Student("С��",10);
		Student s2=new Student("Сǿ",11);
		Student s3=new Student("��",12);
		c2.add(s1);
		c2.add(s2);
		c2.add(s3);
		
		Object[] obj=c2.toArray();
		for (int i=0;i<obj.length;i++) {
			Student s=(Student) obj[i];
			System.out.println(s.getName()+"-----"+s.getAge());
		}
		
		/*
		 * Iterator iterator()
		 * 		boolean hasNext():�Ƿ�����һ��Ԫ��
		 * 		Object next():��ȡ��һ��Ԫ��,���Զ��ƶ�����һ��λ�õȴ�
		 * 
		 * 		NoSuchElementException:û��������Ԫ���쳣��
		 * 		ԭ���ǣ����Ѿ���ȡ��Ԫ�ص�ĩβ�ˣ��㻹Ҫ��ȡԪ�أ��Ѿ�û��Ԫ���ˣ����Ա���
		 */
		
		Iterator it=c2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// forѭ���Ľ�
	   for (Iterator it2 = c2.iterator(); it2.hasNext();) {
			Object s = (Object) it2.next();
			System.out.println(s);
			}
		
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

