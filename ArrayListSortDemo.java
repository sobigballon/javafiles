package someotherTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortDemo {
	
	public static void main(String[] args) {
//		定义集合
		ArrayList<Person> ap=new ArrayList<Person>();

//		定义对象
		Person p1=new Person("王小明",40);
		Person p2=new Person("二月红",30);
		Person p3=new Person("王胖子",35);
		Person p4=new Person("丁丁东",35);
		
//		添加对象
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
//		ap.add(p1);
		ap.add(p4);
		
//		不排序遍历
		for (Person p:ap) {
			System.out.println(p.getName()+"--"+p.getAge());
		}
		
//		默认工具排序
		Collections.sort(ap);
		
		for (Person p:ap) {
			System.out.println(p.getName()+"--"+p.getAge());
		}
		
//		匿名内部类重写排序方法
		Collections.sort(ap,new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				int num=p1.getAge()-p2.getAge();
				int num2=num==0?p1.getName().compareTo(p2.getName()):num;
				return num2;
			}
			
		});
		
		for (Person p:ap) {
			System.out.println(p.getName()+"--"+p.getAge());
		}
	}

}
