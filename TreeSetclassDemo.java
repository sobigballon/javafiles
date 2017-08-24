package projecttest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 * 
 * 分析：
 * 		A:定义一个学生类，里面有成员变量：姓名,语文成绩,数学成绩,英语成绩
 * 		B:因为我们最终要按照总分进行排序，说明我们要排序，所以，选择TreeSet集合
 * 		C:两种方式实现，我们选择一种，用比较器实现
 * 		D:键盘录入学生，存储到TreeSet集合
 * 		E:遍历集合
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
		
		System.out.println("请开始录入学生信息：");;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("请输入第"+i+"个学生的姓名：");
			String name=sc.nextLine();
			System.out.println("请输入第" + i + "个学生的语文成绩：");
//			int chinese=sc.nextInt();
			int chinese = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" + i + "个学生的数学成绩：");
//			int math=sc.nextInt();
			int math = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" +i + "个学生的英语成绩：");
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

//定义学生类
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
