package learning_JAVA;

import java.util.Scanner;

public class IsPrimeNuber {
		public static void main(String[] args) {
			System.out.println("������һ����Ҫ�жϵ���:");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			IsPrimeNuber ipn=new IsPrimeNuber();
			boolean b1,b2,b3;
			b1=ipn.fu_one(n);
			b2=ipn.fu_two(n);
			b3=ipn.fu_three(n);
			if(b1==b2&&b2==b3) {
				System.out.println("�������ܺ��ã��жϽ��Ϊ"+b1);
			}
		}
//	����һ��ֻҪ�ܱ�2~n-1����������һ������������
	public boolean fu_one(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
//	��Լ������������һ��Լ��һ������ƽ����С����һ��һ������ƽ������
	public boolean fu_two(int n) {
		double temp=Math.sqrt(n);
		for(int i=2;i<temp;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
//	������������������һ����6����6�ı�������,��6����6�ı������������һ����������,��25�ȣ���ˣ��ɽ���������Ϊ6������֤
	public boolean fu_three(int n) {
		if(n==2||n==3) {return true;}
		if(n%6!=1&&n%6!=5) {
			return false;
		}
		double temp=Math.sqrt(n);
		for(int i=5;i<temp;i+=6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}
