package projecttest;

/*
 * TreeSet:�ײ����ݽṹ�Ƕ�������
 * ������Ԫ�����������ַ������ֱ��ǣ���Ȼ�����Լ�Comparator(�Ƚ���)��������,����ʹ�������������ʹ�õĹ��췽����
 */

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		 ����һ���µĿ� set���� set ������Ԫ�ص���Ȼ˳���������
		TreeSet<Integer> ts=new TreeSet<Integer>();
//		 �洢Ԫ��
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
		
//		����
		for(int i:ts) {
			System.out.println(i);
		}
		
		TreeSet<peple> ts2=new TreeSet<peple>();
		// �����˶���
		peple p1 = new peple("tangseng", 30);
		peple p2 = new peple("jiapingwa", 25);
		peple p3 = new peple("zhangyimou", 25);
		peple p4 = new peple("xijinping", 26);
		peple p5 = new peple("yanni", 27);
		peple p6 = new peple("wenzhang", 30);
		peple p7 = new peple("tianliang", 28);
		peple p8 = new peple("xijinping", 26);

		// ���Ԫ��
		ts2.add(p1);
		ts2.add(p2);
		ts2.add(p3);
		ts2.add(p4);
		ts2.add(p5);
		ts2.add(p6);
		ts2.add(p7);
		ts2.add(p8);
//		����
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
		// ��Ҫ�Ƚ���������������Ƚ�
		// ��Ҫ�Ƚ���������������ͬ���Ƚ�����������Ҫ�Լ��ܹ�����������
		int num = this.age - p.age;
		
		int num2=(num==0)?(this.name.compareTo(p.name)):num; //num==0��˵��������ȣ���������������Ŀ����
		return num2;
	}
	
}
