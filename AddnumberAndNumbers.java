package learning_JAVA;

import java.util.Scanner;
/*
 * ��s=a+aa+aaa+aaaa+a...a,�����ɼ��̿���
 * 
 */

public class AddnumberAndNumbers {
	public static void main(String[] args) {
		int value,number,sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("����������Ҫ������һ������");
		value=sc.nextInt();
		System.out.println("�������������"+value);
		System.out.println("���������ӵ���λ��");
		number=sc.nextInt();
		System.out.println("���������ӵ�"+number+"λ");
		int temp=value;
		for(int i=1;i<=number;i++) {
			sum=sum+temp;
			temp=temp*10+value;
		}
		System.out.println("�����Ϊ"+sum);
	}

}
