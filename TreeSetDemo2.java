package projecttest;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet����α�֤Ԫ���������?������α�֤Ԫ��Ψһ����?
 * 
 * ������TreeSet�洢�Զ�����󣬲�����Ҫ�������ȥ���ظ�ֵ��
 * a:�����Ա����ֵ����ͬ���Ҿ���Ϊ���ظ�Ԫ��
 * b:�밴������Ĵ�С�����������
 * 
 * �ܽ᣺TreeSet��֤Ԫ��Ψһ������ 
 * Ψһ�ԣ����ݱȽϵķ���ֵ�Ƿ���0���ж�Ԫ���Ƿ���Ψһ��
 * �������ַ�ʽ
 * 		A:��Ȼ����	(Ԫ�ؾ߱��Ƚ���,������)
 * 			�ö�����������ʵ��Comparable�ӿ�
 * 		B:�Ƚ������� (���Ͼ߱��Ƚ���)
 * 			�������϶����ʱ�򣬽���Comparator�ӿڵ�ʵ�������һ������ʹ�õ��������ڲ���ʵ�֡�
 */

public class TreeSetDemo2 {
	public static void main(String[] args) {
//		�������϶����ʱ�򣬽���Comparator�ӿڵ�ʵ�������һ������ʹ�õ��������ڲ���ʵ�֡� 
		TreeSet<peple> ts=new TreeSet<peple>(new Comparator<peple>() {

			@Override
			public int compare(peple p1, peple p2) {
				// TODO Auto-generated method stub
				int num=p1.getAge()-p2.getAge();
				int num2=(num==0)?(p1.getName().compareTo(p2.getName())):num;
				return num2;
			}	
		});
		
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
				ts.add(p1);
				ts.add(p2);
				ts.add(p3);
				ts.add(p4);
				ts.add(p5);
				ts.add(p6);
				ts.add(p7);
				ts.add(p8);
//				����
				for(peple p:ts) {
					System.out.println(p.getName()+"---"+p.getAge());
				}
				

			}

}
