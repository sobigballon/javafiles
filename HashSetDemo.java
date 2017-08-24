package projecttest;

import java.util.HashSet;

/*
 * ���󣺴洢�Զ�����󲢱�����(�������ĳ�Ա����ֵ����ͬ�����Ǿ���Ϊ������������ͬһ������Ҳ�����ظ���Ԫ��)
 * ���Ǵ洢��Ԫ�غ󣬷���û�дﵽ������Ҫ��Ч����
 * ����������д��equals()���������ֻ��ǲ��С�
 * ��ô����?���Ǿ�Ӧ��˼����������������?
 * ͨ���򵥵ķ���������֪���϶���add()�����������
 * ���ԣ�����Ҫ��֪����ʲô������,���Ǿ�Ӧ�ÿ�add()������Դ��
 * ͨ���鿴Դ�룬���ǿ��������µ�һ���жϣ�
 * 		if (e.hash == hash && ((k = e.key) == key || key.equals(k))){}
 * 			A:e.hash == hash
 * 				�Ƚϵ��Ƕ���Ĺ�ϣֵ�Ƿ���ͬ
 * 			B:((k = e.key) == key || key.equals(k))
 * 				��߱Ƚϵ��ǵ�ַ�Ƿ���ͬ
 * 				�ұ߱Ƚϵ��������Ƿ���ͬ
 * HashSet���ϵײ����ݽṹ�ǹ�ϣ����ϣ����hashCode()��equals()��������֤Ԫ�ص�Ψһ�ԡ�
 * 		�Ƚ϶����hashCode()ֵ�Ƿ���ͬ
 * 			�ǣ������Ƚ�equals()�������������Ƿ���ͬ
 * 				����true���Ͳ���ӵ�����
 * 				����false������ӵ�����
 * 			��ֱ����ӵ�����
 * ��ʵ�ʿ����У����ǿ������ֽṹ�ļ��ϣ���Ҫ��д����������hashCode()��equals()��
 * ���ǲ��õ��ģ���Ϊ���������������Զ����ɡ�
 */

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world!");
		hs.add("again");
		
		
		System.out.println(hs);
		
		HashSet<Person> hp=new HashSet<Person>();
		
		// ����Ԫ�ض���
		Person p1 = new Person("������", 30);
		Person p2 = new Person("���ɹ�", 22);
		Person p3 = new Person("�ܹ���", 25);
		Person p4 = new Person("������", 35);
		Person p5 = new Person("�Ź���", 33);
		Person p6 = new Person("���ɺ�", 22);
		Person p7 = new Person("���ɹ�", 22);
		Person p8 = new Person("������", 18);
		
		// ��Ԫ����ӵ�����
		hp.add(p1);
	    hp.add(p1);
		hp.add(p2);
		hp.add(p3);
		hp.add(p4);
		hp.add(p5);
		hp.add(p6);
		hp.add(p7);
		hp.add(p8);
        //��������
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