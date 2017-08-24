package projecttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 
 * 分析：
 * 		A:定义集合，用于存储多个数据
 * 		B:循环键盘录入数据，用while(true){}
 * 		C:判断键盘录入的数据是否是0
 * 			是：break
 * 			否：添加到集合
 * 		D:把集合转成数组
 * 		E:对数组进行排序(升序)
 * 		F:获取数组中的最后一个元素即可
 * 		
 */


public class GetMaxNumberDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要比较的数，结束请输入0");
		while(true) {
			int i=sc.nextInt();
			if (i!=0) {
				arr.add(i);
			}
			else if(i==0) {
				break;
			}
		}
		String s=arr.toString();
		// 把集合转成数组
		Integer[] i=new Integer[arr.size()];//声明数组
		Integer[] iarry=arr.toArray(i);
		
		// 对数组进行排序(升序)
		Arrays.sort(iarry);//注意数组的sort方法	
		
		System.out.println("最大数为："+iarry[iarry.length-1]+" "+"输入的数为："+s);
		
	}

}
