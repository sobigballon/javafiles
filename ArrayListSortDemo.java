package someotherTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortDemo {
	
	public static void main(String[] args) {
//		���弯��
		ArrayList<Person> ap=new ArrayList<Person>();

//		�������
		Person p1=new Person("��С��",40);
		Person p2=new Person("���º�",30);
		Person p3=new Person("������",35);
		Person p4=new Person("������",35);
		
//		��Ӷ���
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
//		ap.add(p1);
		ap.add(p4);
		
//		���������
		for (Person p:ap) {
			System.out.println(p.getName()+"--"+p.getAge());
		}
		
//		Ĭ�Ϲ�������
		Collections.sort(ap);
		
		for (Person p:ap) {
			System.out.println(p.getName()+"--"+p.getAge());
		}
		
//		�����ڲ�����д���򷽷�
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
