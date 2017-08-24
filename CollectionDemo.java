package projecttest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 为什么出现集合类?
 * 		面向对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，用前面所学知识，我们只能采用对象数组实现。
 * 		但是，对象数组的长度又是固定的，适应不了变化的需求，所以，java就提供了集合类供我们使用。
 * 
 * 集合类的特点：
 * 		A:长度可变
 * 		B:只能存储对象
 * 		C:可以存储不同类型的对象
 * 
 * 面试题：数组和集合的区别?
 * 		A:集合长度可变；集合只能存储引用数据类型；集合可以存储不同数据类型的元素
 * 		B:数组长度固定；数组可以存储引用数据类型，也可以存储基本数据类型；数组存储的是同一种数据类型的元素
 * 
 * 由于我们的功能需求不太一样，所以，java就提供了多种集合类供我们使用。这些集合类的本质区别：其实是底层的数据结构不同。
 * 数据结构：数据的存储方式。
 * 
 * Collection的功能：
 * A:添加功能
 * 		boolean add(Object obj):往集合中添加一个元素
 * 		boolean addAll(Collection c):往集合中添加多个元素。
 * B:获取功能
 * 		Iterator iterator():迭代器
 * 		int size():集合的元素个数，长度
 * C:删除功能
 * 		void clear():清空集合的所有元素
 * 		boolean remove(Object obj):从集合中移除一个元素
 * 		boolean removeAll(Collection c):从集合中移除多个元素
 * D:判断功能
 * 		boolean contains(Object obj):判断集合中是否包含指定的元素
 * 		boolean containsAll(Collection c):判断集合中是否包含指定的多个元素
 * 		boolean isEmpty():判断集合是否为空
 * E:交集元素
 * 		boolean retainAll(Collection c)
 * F:转数组
 * 		Object[] toArray():把集合转成对象数组
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
		 * 如果我有两个集合A，B。用A对B做交集 交集元素存储在A集合，B集合不发生改变。 返回值表达是A集合是否发生过改变。
		 */
		
		Collection c1=new ArrayList();
		c1.add("hello");
		c1.add("some");
		System.out.println("contain:"+c1.retainAll(c));
		System.out.println(c1);
		System.out.println(c);
		
		Collection c2=new ArrayList();
		Student s1=new Student("小明",10);
		Student s2=new Student("小强",11);
		Student s3=new Student("大虎",12);
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
		 * 		boolean hasNext():是否有下一个元素
		 * 		Object next():获取下一个元素,并自动移动到下一个位置等待
		 * 
		 * 		NoSuchElementException:没有这样的元素异常。
		 * 		原因是：你已经获取到元素的末尾了，你还要获取元素，已经没有元素了，所以报错。
		 */
		
		Iterator it=c2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// for循环改进
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

