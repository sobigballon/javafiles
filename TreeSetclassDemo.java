package projecttest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 * 
 * ������
 * 		A:����һ��ѧ���࣬�����г�Ա����������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
 * 		B:��Ϊ��������Ҫ�����ֽܷ�������˵������Ҫ�������ԣ�ѡ��TreeSet����
 * 		C:���ַ�ʽʵ�֣�����ѡ��һ�֣��ñȽ���ʵ��
 * 		D:����¼��ѧ�����洢��TreeSet����
 * 		E:��������
 */

public class TreeSetclassDemo {
	public static void main(String[] args) {
		
		TreeSet<xuesheng> xs=new TreeSet<xuesheng>(new Comparator<xuesheng>() {
			@Override
			public int compare(xuesheng x1, xuesheng x2) {
				// TODO Auto-generated method stub
				int num=x1.getSum()-x2.getSum();
				int num2=num==0?x1.getName().compareTo(x2.getName()):num;
				return num2;
			}});
		
		System.out.println("�뿪ʼ¼��ѧ����Ϣ��");;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("�������"+i+"��ѧ����������");
			String name=sc.nextLine();
			System.out.println("�������" + i + "��ѧ�������ĳɼ���");
//			int chinese=sc.nextInt();
			int chinese = Integer.parseInt(sc.nextLine());
			System.out.println("�������" + i + "��ѧ������ѧ�ɼ���");
//			int math=sc.nextInt();
			int math = Integer.parseInt(sc.nextLine());
			System.out.println("�������" +i + "��ѧ����Ӣ��ɼ���");
			int english = Integer.parseInt(sc.nextLine());
//			int english=sc.nextInt();
			
			xuesheng x=new xuesheng(name,chinese, math, english);
//			x.setName(name);
			xs.add(x);	
		}
		
		for(xuesheng j:xs) {
			System.out.println(j.getName()+"---"+j.getSum());
		}
		
	}

}

//����ѧ����
class xuesheng{
	private String name;
	private int chinese;
	private int math;
	private int english;

	public xuesheng() {
		super();
	}

	public xuesheng(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getSum() {
		return chinese + math + english;
	}
}
