package projecttest;

/*
 * TreeSet:底层数据结构是二叉树。
 * 可以让元素排序，有两种方案，分别是：自然排序，以及Comparator(比较器)进行排序,具体使用哪种情况看你使用的构造方法。
 */

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		 构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
		TreeSet<Integer> ts=new TreeSet<Integer>();
//		 存储元素
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);
		
		System.out.println(ts);
		
//		遍历
		for(int i:ts) {
			System.out.println(i);
		}
		
		TreeSet<peple> ts2=new TreeSet<peple>();
		// 创建人对象
		peple p1 = new peple("tangseng", 30);
		peple p2 = new peple("jiapingwa", 25);
		peple p3 = new peple("zhangyimou", 25);
		peple p4 = new peple("xijinping", 26);
		peple p5 = new peple("yanni", 27);
		peple p6 = new peple("wenzhang", 30);
		peple p7 = new peple("tianliang", 28);
		peple p8 = new peple("xijinping", 26);

		// 添加元素
		ts2.add(p1);
		ts2.add(p2);
		ts2.add(p3);
		ts2.add(p4);
		ts2.add(p5);
		ts2.add(p6);
		ts2.add(p7);
		ts2.add(p8);
//		遍历
		for(peple p:ts2) {
			System.out.println(p.getName()+"---"+p.getAge());
		}
		

	}

}

class peple implements Comparable<peple> {
	
	private String name;
	private int age;

	public peple() {
		super();
	}

	public peple(String name, int age) {
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
	public int compareTo(peple p) {
		// TODO Auto-generated method stub
		// 主要比较条件：按照年龄比较
		// 次要比较条件：当年龄相同，比较姓名，这是要自己能够分析出来的
		int num = this.age - p.age;
		
		int num2=(num==0)?(this.name.compareTo(p.name)):num; //num==0，说明年龄相等，主次条件进行三目运算
		return num2;
	}
	
}
