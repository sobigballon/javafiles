package projecttest;

import java.util.HashSet;

/*
 * 需求：存储自定义对象并遍历。(如果对象的成员变量值都相同，我们就认为这两个对象是同一个对象，也就是重复的元素)
 * 我们存储完元素后，发现没有达到我们想要的效果。
 * 接着我们重写了equals()方法，发现还是不行。
 * 怎么办呢?我们就应该思考看哪里会出现问题?
 * 通过简单的分析，我们知道肯定是add()那里出问题了
 * 所以，我们要想知道出什么问题了,我们就应该看add()方法的源码
 * 通过查看源码，我们看到了如下的一个判断：
 * 		if (e.hash == hash && ((k = e.key) == key || key.equals(k))){}
 * 			A:e.hash == hash
 * 				比较的是对象的哈希值是否相同
 * 			B:((k = e.key) == key || key.equals(k))
 * 				左边比较的是地址是否相同
 * 				右边比较的是内容是否相同
 * HashSet集合底层数据结构是哈希表，哈希表由hashCode()和equals()方法来保证元素的唯一性。
 * 		比较对象的hashCode()值是否相同
 * 			是：继续比较equals()方法，看内容是否相同
 * 				返回true：就不添加到集合
 * 				返回false：就添加到集合
 * 			否：直接添加到集合
 * 在实际开发中，我们看到这种结构的集合，就要重写两个方法：hashCode()和equals()。
 * 但是不用担心，因为这两个方法都是自动生成。
 */

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world!");
		hs.add("again");
		
		
		System.out.println(hs);
		
		HashSet<Person> hp=new HashSet<Person>();
		
		// 创建元素对象
		Person p1 = new Person("吕洞宾", 30);
		Person p2 = new Person("何仙姑", 22);
		Person p3 = new Person("曹国舅", 25);
		Person p4 = new Person("铁拐李", 35);
		Person p5 = new Person("张果老", 33);
		Person p6 = new Person("蓝采和", 22);
		Person p7 = new Person("何仙姑", 22);
		Person p8 = new Person("铁拐李", 18);
		
		// 把元素添加到集合
		hp.add(p1);
	    hp.add(p1);
		hp.add(p2);
		hp.add(p3);
		hp.add(p4);
		hp.add(p5);
		hp.add(p6);
		hp.add(p7);
		hp.add(p8);
        //遍历集合
		for(Person p:hp) {
			System.out.println(p);
		}

	}
	
	

}

class Person{
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
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

	// @Override
	// public int hashCode() {
	// // return 0;
	// // return this.name.hashCode() + this.age;
	// // this.name.hashCode(): 20,40
	// // this.age: 50,30
	// return this.name.hashCode() + this.age * 13;
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}