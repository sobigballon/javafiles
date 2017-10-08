package learning_JAVA;

import java.util.Scanner;
/*
 * 求s=a+aa+aaa+aaaa+a...a,个数由键盘控制
 * 
 */

public class AddnumberAndNumbers {
	public static void main(String[] args) {
		int value,number,sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请先输入想要操作的一个数：");
		value=sc.nextInt();
		System.out.println("您输入的数字是"+value);
		System.out.println("您想让它加到几位？");
		number=sc.nextInt();
		System.out.println("您想让它加到"+number+"位");
		int temp=value;
		for(int i=1;i<=number;i++) {
			sum=sum+temp;
			temp=temp*10+value;
		}
		System.out.println("最后结果为"+sum);
	}

}
